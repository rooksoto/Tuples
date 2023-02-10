package com.rooksoto.tuples

import com.rooksoto.tuples.constants.PAIR_SIZE
import com.rooksoto.tuples.exceptions.TupleIndexOutOfBoundsException
import com.rooksoto.tuples.interfaces.AddsElements
import com.rooksoto.tuples.interfaces.ConvertsToElement
import com.rooksoto.tuples.interfaces.ConvertsToKeyValue
import com.rooksoto.tuples.interfaces.ConvertsToLabelValue
import com.rooksoto.tuples.interfaces.ConvertsToMap
import com.rooksoto.tuples.interfaces.DropsLast
import com.rooksoto.tuples.interfaces.DropsSecond
import com.rooksoto.tuples.interfaces.InsertsThird
import com.rooksoto.tuples.interfaces.ReplacesLast
import com.rooksoto.tuples.interfaces.ReplacesSecond
import com.rooksoto.tuples.utils.simpleName

/**
 * A [Pair] is a [Tuple] that can store 2 elements.
 *
 * @param A The type of the first element in the tuple.
 * @param B The type of the second element in the tuple.
 * @property first The first element in the tuple.
 * @property second The second element in the tuple.
 */
data class Pair<A, B>(
    val first: A,
    val second: B
) : Tuple(),
    ConvertsToElement,
    ConvertsToKeyValue,
    ConvertsToLabelValue,
    ConvertsToMap,
    AddsElements,
    DropsLast,
    InsertsThird,
    DropsSecond,
    ReplacesLast,
    ReplacesSecond {

    override val size: Int =
        PAIR_SIZE

    override fun get(index: Int): Any? =
        when (index) {
            0 -> first
            1 -> second
            else -> throw TupleIndexOutOfBoundsException(simpleName(), index, size)
        }

    override fun toElement(): Element<A> =
        Element(first)

    override fun toKeyValue(): KeyValue<A, B> =
        KeyValue(first, second)

    override fun toLabelValue(): LabelValue<A, B> =
        LabelValue(first, second)

    override fun toMap(): Map<A, B> =
        mapOf(first to second)

    override fun <T> add(value: T): Triplet<A, B, T> =
        Triplet(first, second, value)

    override fun dropLast(): Element<A> =
        toElement()

    override fun <T> insertFirst(value: T): Triplet<T, A, B> =
        Triplet(value, first, second)

    override fun <T> insertSecond(value: T): Triplet<A, T, B> =
        Triplet(first, value, second)

    override fun <T> insertThird(value: T): Triplet<A, B, T> =
        add(value)

    override fun dropFirst(): Element<B> =
        Element(second)

    override fun dropSecond(): Element<A> =
        dropLast()

    override fun <T> replaceLast(value: T): Pair<A, T> =
        Pair(first, value)

    override fun <T> replaceFirst(value: T): Pair<T, B> =
        Pair(value, second)

    override fun <T> replaceSecond(value: T): Pair<A, T> =
        replaceLast(value)

    override fun toString(): String =
        super.toString()
}
