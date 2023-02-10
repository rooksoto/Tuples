package com.rooksoto.tuples

import com.rooksoto.tuples.constants.ELEMENT_SIZE
import com.rooksoto.tuples.exceptions.TupleIndexOutOfBoundsException
import com.rooksoto.tuples.interfaces.ConvertsToElement
import com.rooksoto.tuples.interfaces.ConvertsToKeyValue
import com.rooksoto.tuples.interfaces.ConvertsToMap
import com.rooksoto.tuples.interfaces.ConvertsToPair
import com.rooksoto.tuples.interfaces.DropsLabel
import com.rooksoto.tuples.interfaces.DropsValue
import com.rooksoto.tuples.interfaces.ReplacesLabel
import com.rooksoto.tuples.interfaces.ReplacesValue
import com.rooksoto.tuples.utils.simpleName

/**
 * A [LabelValue] is a [Tuple] that can store 1 element as
 * a label, and 1 element as a value.
 *
 * @param L The type of the label element in the tuple.
 * @param V The type of the value element in the tuple.
 * @property label The label element in  the tuple.
 * @property value The value element in the tuple.
 */
data class LabelValue<L, V>(
    val label: L,
    val value: V
) : Tuple(),
    ConvertsToElement,
    ConvertsToPair,
    ConvertsToKeyValue,
    ConvertsToMap,
    DropsLabel,
    DropsValue,
    ReplacesLabel,
    ReplacesValue {

    override val size: Int =
        ELEMENT_SIZE

    override fun get(index: Int): Any? =
        when (index) {
            0 -> value
            else -> TupleIndexOutOfBoundsException(simpleName(), index, size)
        }

    override fun contains(element: Any?): Boolean =
        element == value

    override fun containsAll(elements: Collection<Any?>): Boolean =
        elements.size == 1 && elements.contains(value)

    override fun toElement(): Element<V> =
        Element(value)

    override fun toPair(): Pair<L, V> =
        Pair(label, value)

    override fun toKeyValue(): KeyValue<L, V> =
        KeyValue(label, value)

    override fun toMap(): Map<L, V> =
        mapOf(label to value)

    override fun dropLabel(): Element<V> =
        Element(value)

    override fun dropValue(): Element<L> =
        Element(label)

    override fun <T> replaceLabel(label: T): LabelValue<T, V> =
        LabelValue(label, value)

    override fun <T> replaceValue(value: T): LabelValue<L, T> =
        LabelValue(label, value)

    override fun toString(): String =
        super.toString()
}
