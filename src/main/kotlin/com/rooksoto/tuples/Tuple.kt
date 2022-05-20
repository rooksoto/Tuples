package com.rooksoto.tuples

import com.rooksoto.tuples.initializers.toTuple
import com.rooksoto.tuples.utils.compareByCapacity
import com.rooksoto.tuples.utils.normalized
import com.rooksoto.tuples.utils.simpleName
import com.rooksoto.tuples.utils.widenAndCompareTo
import java.io.Serializable

// Suppress HashCode undefined, since implementers are data classes
@Suppress("EqualsOrHashCode")
abstract class Tuple :
    Serializable,
    Comparable<Tuple>,
    Collection<Any?> {

    abstract operator fun get(index: Int): Any?

    override fun isEmpty(): Boolean = false

    override fun contains(element: Any?): Boolean {
        forEach { value ->
            if (value == element) {
                return true
            }
        }
        return false
    }

    override fun containsAll(elements: Collection<Any?>): Boolean {
        elements.forEach { element ->
            if (!contains(element)) {
                return false
            }
        }
        return true
    }

    /**
     * Returns a comparison of this [Tuple] to the specified
     * [other] [Tuple].
     *
     * Returns 1 if:
     * - The other [Tuple] has a smaller capacity than
     * this [Tuple]
     * - While comparing element by element, an
     * item in this [Tuple] is greater than the element
     * in the other [Tuple]'s corresponding position.
     *
     * Returns -1 if:
     * - The other [Tuple] has a larger capacity than
     * this [Tuple]
     * - While comparing element by element, an
     * item in this [Tuple] is less than the element
     * in the other [Tuple]'s corresponding position.
     *
     * Returns 0 if the two [Tuple]s have the same capacity
     * and all elements in corresponding positions are equal.
     */
    override fun compareTo(other: Tuple): Int {
        if (size != other.size) return compareByCapacity(other)

        zip(other).forEach { (a, b) ->
            val bestGuess = when {
                a == null && b == null -> 0
                a != null && b == null -> 1
                a == null && b != null -> -1
                a!!::class != b!!::class -> a.simpleName().compareTo(b.simpleName()).normalized()
                (a is Number && b is Number) -> a.widenAndCompareTo(b)
                (a is String && b is String) -> a.compareTo(b).normalized()
                else -> a.toString().compareTo(b.toString()).normalized()
            }
            if (bestGuess != 0) return bestGuess
        }

        return 0
    }

    /**
     * Returns a [String] representation of this [Tuple].
     */
    override fun toString(): String =
        when (this) {
            is LabelValue<*, *> -> "${simpleName()}: [$label : (${value?.simpleName()}) -> $value]"
            is KeyValue<*, *> -> "${simpleName()}: [(${key?.simpleName()}) -> $key : (${value?.simpleName()}) -> $value]"
            else -> joinToString(
                prefix = "${simpleName()}: [",
                postfix = "]",
                separator = ", ",
            ) { value ->
                "(${value?.simpleName()}) -> $value"
            }
        }

    /**
     * Returns a [Tuple] comprising only the distinct elements of
     * the original [Tuple].
     */
    fun dropDuplicates() = toSet().toTuple()
}
