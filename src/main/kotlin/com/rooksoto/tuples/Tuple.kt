package com.rooksoto.tuples

import java.io.Serializable

// Suppress HashCode undefined, since implementers are data classes
@Suppress("EqualsOrHashCode")
abstract class Tuple :
    Serializable,
    Iterable<Any?>,
    Comparable<Tuple> {

    abstract val size: Int

    abstract override fun equals(other: Any?): Boolean

    // TODO: Add support for Comparable<T>
    override fun compareTo(other: Tuple): Int {
        if (size != other.size) return compareByCapacity(other)

        val thisList = toList()
        val otherList = other.toList()

        for (index in 0 until size) {
            val thisItem = thisList[index]
            val otherItem = otherList[index]
            val bestGuess = when {
                thisItem == null && otherItem == null -> 0
                thisItem != null && otherItem == null -> 1
                thisItem == null && otherItem != null -> -1
                thisItem!!::class != otherItem!!::class -> thisItem.simpleName().compareTo(otherItem.simpleName()).normalized()
                (thisItem is Number && otherItem is Number) -> thisItem.widenAndCompareTo(otherItem)
                (thisItem is String && otherItem is String) -> thisItem.compareTo(otherItem).normalized()
                else -> thisItem.toString().compareTo(otherItem.toString()).normalized()
            }
            if (bestGuess != 0) return bestGuess
        }

        return 0
    }

    override fun toString(): String =
        when (this) {
            is LabelValue<*, *> -> "${simpleName()}[$label : (${value?.simpleName()}) -> $value]"
            is KeyValue<*, *> -> "${simpleName()}[(${key?.simpleName()}) -> $key : (${value?.simpleName()}) -> $value]"
            else -> joinToString(
                prefix = "${simpleName()}[",
                postfix = "]",
                separator = " : ",
            ) { value ->
                "(${value?.simpleName()}) -> $value"
            }
        }

    fun dropDuplicates() = toSet().toTuple()
}
