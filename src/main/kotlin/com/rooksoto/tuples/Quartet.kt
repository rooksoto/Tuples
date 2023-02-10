package com.rooksoto.tuples

import com.rooksoto.tuples.constants.QUARTET_SIZE
import com.rooksoto.tuples.exceptions.TupleIndexOutOfBoundsException
import com.rooksoto.tuples.interfaces.AddsElements
import com.rooksoto.tuples.interfaces.ConvertsToTriplet
import com.rooksoto.tuples.interfaces.DropsFourth
import com.rooksoto.tuples.interfaces.DropsLast
import com.rooksoto.tuples.interfaces.InsertsFifth
import com.rooksoto.tuples.interfaces.ReplacesFourth
import com.rooksoto.tuples.interfaces.ReplacesLast
import com.rooksoto.tuples.utils.simpleName

/**
 * A [Quartet] is a [Tuple] that can store 4 elements.
 *
 * @param A The type of the first element in the tuple.
 * @param B The type of the second element in the tuple.
 * @param C The type of the third element in the tuple.
 * @param D The type of the fourth element in the tuple.
 * @property first The first element in the tuple.
 * @property second The second element in the tuple.
 * @property third The third element in the tuple.
 * @property fourth The fourth element in the tuple.
 */
data class Quartet<A, B, C, D>(
    val first: A,
    val second: B,
    val third: C,
    val fourth: D
) : Tuple(),
    ConvertsToTriplet,
    AddsElements,
    DropsLast,
    InsertsFifth,
    DropsFourth,
    ReplacesLast,
    ReplacesFourth {

    override val size: Int =
        QUARTET_SIZE

    override fun get(index: Int): Any? =
        when (index) {
            0 -> first
            1 -> second
            2 -> third
            3 -> fourth
            else -> throw TupleIndexOutOfBoundsException(simpleName(), index, size)
        }

    override fun toTriplet(): Triplet<A, B, C> =
        Triplet(first, second, third)

    override fun toPair(): Pair<A, B> =
        Pair(first, second)

    override fun toElement(): Element<A> =
        Element(first)

    override fun <T> add(value: T): Quintet<A, B, C, D, T> =
        Quintet(first, second, third, fourth, value)

    override fun dropLast(): Triplet<A, B, C> =
        toTriplet()

    override fun <T> insertFirst(value: T): Quintet<T, A, B, C, D> =
        Quintet(value, first, second, third, fourth)

    override fun <T> insertSecond(value: T): Quintet<A, T, B, C, D> =
        Quintet(first, value, second, third, fourth)

    override fun <T> insertThird(value: T): Quintet<A, B, T, C, D> =
        Quintet(first, second, value, third, fourth)

    override fun <T> insertFourth(value: T): Quintet<A, B, C, T, D> =
        Quintet(first, second, third, value, fourth)

    override fun <T> insertFifth(value: T): Quintet<A, B, C, D, T> =
        add(value)

    override fun dropFirst(): Triplet<B, C, D> =
        Triplet(second, third, fourth)

    override fun dropSecond(): Triplet<A, C, D> =
        Triplet(first, third, fourth)

    override fun dropThird(): Triplet<A, B, D> =
        Triplet(first, second, fourth)

    override fun dropFourth(): Triplet<A, B, C> =
        dropLast()

    override fun <T> replaceLast(value: T): Quartet<A, B, C, T> =
        Quartet(first, second, third, value)

    override fun <T> replaceFirst(value: T): Quartet<T, B, C, D> =
        Quartet(value, second, third, fourth)

    override fun <T> replaceSecond(value: T): Quartet<A, T, C, D> =
        Quartet(first, value, third, fourth)

    override fun <T> replaceThird(value: T): Quartet<A, B, T, D> =
        Quartet(first, second, value, fourth)

    override fun <T> replaceFourth(value: T): Quartet<A, B, C, T> =
        replaceLast(value)

    override fun toString(): String =
        super.toString()
}
