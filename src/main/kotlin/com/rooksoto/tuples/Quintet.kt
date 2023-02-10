package com.rooksoto.tuples

import com.rooksoto.tuples.constants.QUINTET_SIZE
import com.rooksoto.tuples.exceptions.TupleIndexOutOfBoundsException
import com.rooksoto.tuples.interfaces.AddsElements
import com.rooksoto.tuples.interfaces.ConvertsToQuartet
import com.rooksoto.tuples.interfaces.DropsFifth
import com.rooksoto.tuples.interfaces.DropsLast
import com.rooksoto.tuples.interfaces.InsertsSixth
import com.rooksoto.tuples.interfaces.ReplacesFifth
import com.rooksoto.tuples.interfaces.ReplacesLast
import com.rooksoto.tuples.utils.simpleName

/**
 * A [Quintet] is a [Tuple] that can store 5 elements.
 *
 * @param A The type of the first element in the tuple.
 * @param B The type of the second element in the tuple.
 * @param C The type of the third element in the tuple.
 * @param D The type of the fourth element in the tuple.
 * @param E The type of the fifth element in the tuple.
 * @property first The first element in the tuple.
 * @property second The second element in the tuple.
 * @property third The third element in the tuple.
 * @property fourth The fourth element in the tuple.
 * @property fifth The fifth element in the tuple.
 */
data class Quintet<A, B, C, D, E>(
    val first: A,
    val second: B,
    val third: C,
    val fourth: D,
    val fifth: E
) : Tuple(),
    ConvertsToQuartet,
    AddsElements,
    DropsLast,
    InsertsSixth,
    DropsFifth,
    ReplacesLast,
    ReplacesFifth {

    override val size: Int =
        QUINTET_SIZE

    override fun get(index: Int): Any? =
        when (index) {
            0 -> first
            1 -> second
            2 -> third
            3 -> fourth
            4 -> fifth
            else -> throw TupleIndexOutOfBoundsException(simpleName(), index, size)
        }

    override fun toQuartet(): Quartet<A, B, C, D> =
        Quartet(first, second, third, fourth)

    override fun toTriplet(): Triplet<A, B, C> =
        Triplet(first, second, third)

    override fun toPair(): Pair<A, B> =
        Pair(first, second)

    override fun toElement(): Element<A> =
        Element(first)

    override fun <T> add(value: T) =
        Sextet(first, second, third, fourth, fifth, value)

    override fun dropLast(): Quartet<A, B, C, D> =
        toQuartet()

    override fun <T> insertFirst(value: T): Sextet<T, A, B, C, D, E> =
        Sextet(value, first, second, third, fourth, fifth)

    override fun <T> insertSecond(value: T): Sextet<A, T, B, C, D, E> =
        Sextet(first, value, second, third, fourth, fifth)

    override fun <T> insertThird(value: T): Sextet<A, B, T, C, D, E> =
        Sextet(first, second, value, third, fourth, fifth)

    override fun <T> insertFourth(value: T): Sextet<A, B, C, T, D, E> =
        Sextet(first, second, third, value, fourth, fifth)

    override fun <T> insertFifth(value: T): Sextet<A, B, C, D, T, E> =
        Sextet(first, second, third, fourth, value, fifth)

    override fun <T> insertSixth(value: T): Sextet<A, B, C, D, E, T> =
        add(value)

    override fun dropFirst(): Quartet<B, C, D, E> =
        Quartet(second, third, fourth, fifth)

    override fun dropSecond(): Quartet<A, C, D, E> =
        Quartet(first, third, fourth, fifth)

    override fun dropThird(): Quartet<A, B, D, E> =
        Quartet(first, second, fourth, fifth)

    override fun dropFourth(): Quartet<A, B, C, E> =
        Quartet(first, second, third, fifth)

    override fun dropFifth(): Quartet<A, B, C, D> =
        dropLast()

    override fun <T> replaceLast(value: T): Quintet<A, B, C, D, T> =
        Quintet(first, second, third, fourth, value)

    override fun <T> replaceFirst(value: T): Quintet<T, B, C, D, E> =
        Quintet(value, second, third, fourth, fifth)

    override fun <T> replaceSecond(value: T): Quintet<A, T, C, D, E> =
        Quintet(first, value, third, fourth, fifth)

    override fun <T> replaceThird(value: T): Quintet<A, B, T, D, E> =
        Quintet(first, second, value, fourth, fifth)

    override fun <T> replaceFourth(value: T): Quintet<A, B, C, T, E> =
        Quintet(first, second, third, value, fifth)

    override fun <T> replaceFifth(value: T): Quintet<A, B, C, D, T> =
        replaceLast(value)

    override fun toString(): String =
        super.toString()
}
