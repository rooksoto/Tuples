package com.rooksoto.tuples

import com.rooksoto.tuples.constants.ELEMENT_SIZE
import com.rooksoto.tuples.exceptions.TupleIndexOutOfBoundsException
import com.rooksoto.tuples.interfaces.ConvertsToElement
import com.rooksoto.tuples.interfaces.ConvertsToLabelValue
import com.rooksoto.tuples.interfaces.ConvertsToMap
import com.rooksoto.tuples.interfaces.ConvertsToPair
import com.rooksoto.tuples.interfaces.DropsKey
import com.rooksoto.tuples.interfaces.DropsValue
import com.rooksoto.tuples.interfaces.ReplacesKey
import com.rooksoto.tuples.interfaces.ReplacesValue
import com.rooksoto.tuples.utils.simpleName

/**
 * A [KeyValue] is a [Tuple] that can store 1 element as
 * a key, and 1 element as a value.
 *
 * @param K The type of the key element in the tuple.
 * @param V The type of the value element in the tuple.
 * @property key The key element in  the tuple.
 * @property value The value element in the tuple.
 */
data class KeyValue<K, V>(
    val key: K,
    val value: V
) : Tuple(),
    ConvertsToElement,
    ConvertsToPair,
    ConvertsToLabelValue,
    ConvertsToMap,
    DropsKey,
    DropsValue,
    ReplacesKey,
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

    override fun iterator(): Iterator<V> =
        listOf(value)
            .iterator()

    override fun toElement(): Element<V> =
        Element(value)

    override fun toPair(): Pair<K, V> =
        Pair(key, value)

    override fun toLabelValue(): LabelValue<K, V> =
        LabelValue(key, value)

    override fun toMap(): Map<K, V> =
        mapOf(key to value)

    override fun dropKey(): Element<V> =
        Element(value)

    override fun dropValue(): Element<K> =
        Element(key)

    override fun <T> replaceKey(key: T): KeyValue<T, V> =
        KeyValue(key, value)

    override fun <T> replaceValue(value: T): KeyValue<K, T> =
        KeyValue(key, value)

    override fun toString(): String =
        super.toString()
}
