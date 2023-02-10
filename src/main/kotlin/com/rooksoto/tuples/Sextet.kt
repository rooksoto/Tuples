package com.rooksoto.tuples

import com.rooksoto.tuples.constants.SEXTET_SIZE
import com.rooksoto.tuples.exceptions.TupleIndexOutOfBoundsException
import com.rooksoto.tuples.interfaces.AddsElements
import com.rooksoto.tuples.interfaces.ConvertsToQuintet
import com.rooksoto.tuples.interfaces.DropsLast
import com.rooksoto.tuples.interfaces.DropsSixth
import com.rooksoto.tuples.interfaces.InsertsSeventh
import com.rooksoto.tuples.interfaces.ReplacesLast
import com.rooksoto.tuples.interfaces.ReplacesSixth
import com.rooksoto.tuples.utils.simpleName

/**
 * A [Sextet] is a [Tuple] that can store 6 elements.
 *
 * @param A The type of the first element in the tuple.
 * @param B The type of the second element in the tuple.
 * @param C The type of the third element in the tuple.
 * @param D The type of the fourth element in the tuple.
 * @param E The type of the fifth element in the tuple.
 * @param F The type of the sixth element in the tuple.
 * @property first The first element in the tuple.
 * @property second The second element in the tuple.
 * @property third The third element in the tuple.
 * @property fourth The fourth element in the tuple.
 * @property fifth The fifth element in the tuple.
 * @property sixth The sixth element in the tuple.
 */
data class Sextet<A, B, C, D, E, F>(
    val first: A,
    val second: B,
    val third: C,
    val fourth: D,
    val fifth: E,
    val sixth: F,
) : Tuple(),
    ConvertsToQuintet,
    AddsElements,
    DropsLast,
    InsertsSeventh,
    DropsSixth,
    ReplacesLast,
    ReplacesSixth {

    override val size: Int =
        SEXTET_SIZE

    override fun get(index: Int): Any? =
        when (index) {
            0 -> first
            1 -> second
            2 -> third
            3 -> fourth
            4 -> fifth
            5 -> sixth
            else -> TupleIndexOutOfBoundsException(simpleName(), index, size)
        }

    override fun toQuintet(): Quintet<A, B, C, D, E> =
        Quintet(first, second, third, fourth, fifth)

    override fun toQuartet(): Quartet<A, B, C, D> =
        Quartet(first, second, third, fourth)

    override fun toTriplet(): Triplet<A, B, C> =
        Triplet(first, second, third)

    override fun toPair(): Pair<A, B> =
        Pair(first, second)

    override fun toElement(): Element<A> =
        Element(first)

    override fun <T> add(value: T) =
        Septet(first, second, third, fourth, fifth, sixth, value)

    override fun dropLast(): Quintet<A, B, C, D, E> =
        toQuintet()

    override fun <T> insertFirst(value: T): Septet<T, A, B, C, D, E, F> =
        Septet(value, first, second, third, fourth, fifth, sixth)

    override fun <T> insertSecond(value: T): Septet<A, T, B, C, D, E, F> =
        Septet(first, value, second, third, fourth, fifth, sixth)

    override fun <T> insertThird(value: T): Septet<A, B, T, C, D, E, F> =
        Septet(first, second, value, third, fourth, fifth, sixth)

    override fun <T> insertFourth(value: T): Septet<A, B, C, T, D, E, F> =
        Septet(first, second, third, value, fourth, fifth, sixth)

    override fun <T> insertFifth(value: T): Septet<A, B, C, D, T, E, F> =
        Septet(first, second, third, fourth, value, fifth, sixth)

    override fun <T> insertSixth(value: T): Septet<A, B, C, D, E, T, F> =
        Septet(first, second, third, fourth, fifth, value, sixth)

    override fun <T> insertSeventh(value: T): Septet<A, B, C, D, E, F, T> =
        add(value)

    override fun dropFirst(): Quintet<B, C, D, E, F> =
        Quintet(second, third, fourth, fifth, sixth)

    override fun dropSecond(): Quintet<A, C, D, E, F> =
        Quintet(first, third, fourth, fifth, sixth)

    override fun dropThird(): Quintet<A, B, D, E, F> =
        Quintet(first, second, fourth, fifth, sixth)

    override fun dropFourth(): Quintet<A, B, C, E, F> =
        Quintet(first, second, third, fifth, sixth)

    override fun dropFifth(): Quintet<A, B, C, D, F> =
        Quintet(first, second, third, fourth, sixth)

    override fun dropSixth(): Quintet<A, B, C, D, E> =
        dropLast()

    override fun <T> replaceLast(value: T): Sextet<A, B, C, D, E, T> =
        Sextet(first, second, third, fourth, fifth, value)

    override fun <T> replaceFirst(value: T): Sextet<T, B, C, D, E, F> =
        Sextet(value, second, third, fourth, fifth, sixth)

    override fun <T> replaceSecond(value: T): Sextet<A, T, C, D, E, F> =
        Sextet(first, value, third, fourth, fifth, sixth)

    override fun <T> replaceThird(value: T): Sextet<A, B, T, D, E, F> =
        Sextet(first, second, value, fourth, fifth, sixth)

    override fun <T> replaceFourth(value: T): Sextet<A, B, C, T, E, F> =
        Sextet(first, second, third, value, fifth, sixth)

    override fun <T> replaceFifth(value: T): Sextet<A, B, C, D, T, F> =
        Sextet(first, second, third, fourth, value, sixth)

    override fun <T> replaceSixth(value: T): Sextet<A, B, C, D, E, T> =
        replaceLast(value)

    override fun toString(): String =
        super.toString()
}
