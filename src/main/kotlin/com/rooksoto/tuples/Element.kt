package com.rooksoto.tuples

import com.rooksoto.tuples.constants.ELEMENT_SIZE
import com.rooksoto.tuples.exceptions.TupleIndexOutOfBoundsException
import com.rooksoto.tuples.interfaces.AddsElements
import com.rooksoto.tuples.interfaces.CanAddKey
import com.rooksoto.tuples.interfaces.CanAddLabel
import com.rooksoto.tuples.interfaces.CanAddValue
import com.rooksoto.tuples.interfaces.InsertsFirst
import com.rooksoto.tuples.interfaces.InsertsSecond
import com.rooksoto.tuples.interfaces.ReplacesFirst
import com.rooksoto.tuples.interfaces.ReplacesLast
import com.rooksoto.tuples.utils.simpleName

/**
 * A [Element] is a [Tuple] that can store 1 element.
 *
 * @param A The type of the first element in the tuple.
 * @property first The first element in the tuple.
 */
data class Element<A>(
    val first: A
) : Tuple(),
    AddsElements,
    InsertsFirst,
    InsertsSecond,
    CanAddKey,
    CanAddLabel,
    CanAddValue,
    ReplacesLast,
    ReplacesFirst {

    override val size: Int =
        ELEMENT_SIZE

    override fun get(index: Int): Any? =
        when (index) {
            0 -> first
            else -> throw TupleIndexOutOfBoundsException(simpleName(), index, size)
        }

    override fun <T> add(value: T): Pair<A, T> =
        Pair(first, value)

    override fun <T> insertFirst(value: T): Pair<T, A> =
        Pair(value, first)

    override fun <T> insertSecond(value: T): Pair<A, T> =
        add(value)

    override fun <T> addKey(key: T): KeyValue<T, A> =
        KeyValue(key, first)

    override fun <T> addLabel(label: T): LabelValue<T, A> =
        LabelValue(label, first)

    override fun <T> asKey(toValue: T): KeyValue<A, T> =
        KeyValue(first, toValue)

    override fun <T> asLabel(toValue: T): LabelValue<A, T> =
        LabelValue(first, toValue)

    override fun <T> replaceLast(value: T): Element<T> =
        Element(value)

    override fun <T> replaceFirst(value: T): Element<T> =
        replaceLast(value)

    override fun toString(): String =
        super.toString()
}
