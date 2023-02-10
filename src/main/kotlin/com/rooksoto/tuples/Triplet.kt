package com.rooksoto.tuples

import com.rooksoto.tuples.constants.TRIPLET_SIZE
import com.rooksoto.tuples.exceptions.TupleIndexOutOfBoundsException
import com.rooksoto.tuples.interfaces.AddsElements
import com.rooksoto.tuples.interfaces.ConvertsToPair
import com.rooksoto.tuples.interfaces.DropsLast
import com.rooksoto.tuples.interfaces.DropsThird
import com.rooksoto.tuples.interfaces.InsertsFourth
import com.rooksoto.tuples.interfaces.ReplacesLast
import com.rooksoto.tuples.interfaces.ReplacesThird
import com.rooksoto.tuples.utils.simpleName

/**
 * A [Triplet] is a [Tuple] that can store 3 elements.
 *
 * @param A The type of the first element in the tuple.
 * @param B The type of the second element in the tuple.
 * @param C The type of the third element in the tuple.
 * @property first The first element in the tuple.
 * @property second The second element in the tuple.
 * @property third The third element in the tuple.
 */
data class Triplet<A, B, C>(
    val first: A,
    val second: B,
    val third: C
) : Tuple(),
    ConvertsToPair,
    AddsElements,
    DropsLast,
    InsertsFourth,
    DropsThird,
    ReplacesLast,
    ReplacesThird {

    override val size: Int =
        TRIPLET_SIZE

    override fun get(index: Int): Any? =
        when (index) {
            0 -> first
            1 -> second
            2 -> third
            else -> throw TupleIndexOutOfBoundsException(simpleName(), index, size)
        }

    override fun toPair(): Pair<A, B> =
        Pair(first, second)

    override fun toElement(): Element<A> =
        Element(first)

    override fun <T> add(value: T): Quartet<A, B, C, T> =
        Quartet(first, second, third, value)

    override fun dropLast(): Pair<A, B> =
        toPair()

    override fun <T> insertFirst(value: T): Quartet<T, A, B, C> =
        Quartet(value, first, second, third)

    override fun <T> insertSecond(value: T): Quartet<A, T, B, C> =
        Quartet(first, value, second, third)

    override fun <T> insertThird(value: T): Quartet<A, B, T, C> =
        Quartet(first, second, value, third)

    override fun <T> insertFourth(value: T): Quartet<A, B, C, T> =
        add(value)

    override fun dropFirst(): Pair<B, C> =
        Pair(second, third)

    override fun dropSecond(): Pair<A, C> =
        Pair(first, third)

    override fun dropThird(): Pair<A, B> =
        dropLast()

    override fun <T> replaceLast(value: T): Triplet<A, B, T> =
        Triplet(first, second, value)

    override fun <T> replaceFirst(value: T): Triplet<T, B, C> =
        Triplet(value, second, third)

    override fun <T> replaceSecond(value: T): Triplet<A, T, C> =
        Triplet(first, value, third)

    override fun <T> replaceThird(value: T): Triplet<A, B, T> =
        replaceLast(value)

    override fun toString(): String =
        super.toString()
}
