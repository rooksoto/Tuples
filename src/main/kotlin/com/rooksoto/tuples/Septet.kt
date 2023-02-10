package com.rooksoto.tuples

import com.rooksoto.tuples.constants.SEPTET_SIZE
import com.rooksoto.tuples.exceptions.TupleIndexOutOfBoundsException
import com.rooksoto.tuples.interfaces.AddsElements
import com.rooksoto.tuples.interfaces.ConvertsToSextet
import com.rooksoto.tuples.interfaces.DropsLast
import com.rooksoto.tuples.interfaces.DropsSeventh
import com.rooksoto.tuples.interfaces.InsertsEighth
import com.rooksoto.tuples.interfaces.ReplacesLast
import com.rooksoto.tuples.interfaces.ReplacesSeventh
import com.rooksoto.tuples.utils.simpleName

/**
 * A [Septet] is a [Tuple] that can store 7 elements.
 *
 * @param A The type of the first element in the tuple.
 * @param B The type of the second element in the tuple.
 * @param C The type of the third element in the tuple.
 * @param D The type of the fourth element in the tuple.
 * @param E The type of the fifth element in the tuple.
 * @param F The type of the sixth element in the tuple.
 * @param G The type of the seventh element in the tuple.
 * @property first The first element in the tuple.
 * @property second The second element in the tuple.
 * @property third The third element in the tuple.
 * @property fourth The fourth element in the tuple.
 * @property fifth The fifth element in the tuple.
 * @property sixth The sixth element in the tuple.
 * @property seventh The seventh element in the tuple.
 */
data class Septet<A, B, C, D, E, F, G>(
    val first: A,
    val second: B,
    val third: C,
    val fourth: D,
    val fifth: E,
    val sixth: F,
    val seventh: G
) : Tuple(),
    ConvertsToSextet,
    AddsElements,
    DropsLast,
    InsertsEighth,
    DropsSeventh,
    ReplacesLast,
    ReplacesSeventh {

    override val size: Int =
        SEPTET_SIZE

    override fun get(index: Int): Any? =
        when (index) {
            0 -> first
            1 -> second
            2 -> third
            3 -> fourth
            4 -> fifth
            5 -> sixth
            6 -> seventh
            else -> TupleIndexOutOfBoundsException(simpleName(), index, size)
        }

    override fun toSextet(): Sextet<A, B, C, D, E, F> =
        Sextet(first, second, third, fourth, fifth, sixth)

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

    override fun <T> add(value: T): Octet<A, B, C, D, E, F, G, T> =
        Octet(first, second, third, fourth, fifth, sixth, seventh, value)

    override fun dropLast(): Sextet<A, B, C, D, E, F> =
        toSextet()

    override fun <T> insertFirst(value: T): Octet<T, A, B, C, D, E, F, G> =
        Octet(value, first, second, third, fourth, fifth, sixth, seventh)

    override fun <T> insertSecond(value: T): Octet<A, T, B, C, D, E, F, G> =
        Octet(first, value, second, third, fourth, fifth, sixth, seventh)

    override fun <T> insertThird(value: T): Octet<A, B, T, C, D, E, F, G> =
        Octet(first, second, value, third, fourth, fifth, sixth, seventh)

    override fun <T> insertFourth(value: T): Octet<A, B, C, T, D, E, F, G> =
        Octet(first, second, third, value, fourth, fifth, sixth, seventh)

    override fun <T> insertFifth(value: T): Octet<A, B, C, D, T, E, F, G> =
        Octet(first, second, third, fourth, value, fifth, sixth, seventh)

    override fun <T> insertSixth(value: T): Octet<A, B, C, D, E, T, F, G> =
        Octet(first, second, third, fourth, fifth, value, sixth, seventh)

    override fun <T> insertSeventh(value: T): Octet<A, B, C, D, E, F, T, G> =
        Octet(first, second, third, fourth, fifth, sixth, value, seventh)

    override fun <T> insertEighth(value: T): Octet<A, B, C, D, E, F, G, T> =
        add(value)

    override fun dropFirst(): Sextet<B, C, D, E, F, G> =
        Sextet(second, third, fourth, fifth, sixth, seventh)

    override fun dropSecond(): Sextet<A, C, D, E, F, G> =
        Sextet(first, third, fourth, fifth, sixth, seventh)

    override fun dropThird(): Sextet<A, B, D, E, F, G> =
        Sextet(first, second, fourth, fifth, sixth, seventh)

    override fun dropFourth(): Sextet<A, B, C, E, F, G> =
        Sextet(first, second, third, fifth, sixth, seventh)

    override fun dropFifth(): Sextet<A, B, C, D, F, G> =
        Sextet(first, second, third, fourth, sixth, seventh)

    override fun dropSixth(): Sextet<A, B, C, D, E, G> =
        Sextet(first, second, third, fourth, fifth, seventh)

    override fun dropSeventh(): Sextet<A, B, C, D, E, F> =
        dropLast()

    override fun <T> replaceLast(value: T): Septet<A, B, C, D, E, F, T> =
        Septet(first, second, third, fourth, fifth, sixth, value)

    override fun <T> replaceFirst(value: T): Septet<T, B, C, D, E, F, G> =
        Septet(value, second, third, fourth, fifth, sixth, seventh)

    override fun <T> replaceSecond(value: T): Septet<A, T, C, D, E, F, G> =
        Septet(first, value, third, fourth, fifth, sixth, seventh)

    override fun <T> replaceThird(value: T): Septet<A, B, T, D, E, F, G> =
        Septet(first, second, value, fourth, fifth, sixth, seventh)

    override fun <T> replaceFourth(value: T): Septet<A, B, C, T, E, F, G> =
        Septet(first, second, third, value, fifth, sixth, seventh)

    override fun <T> replaceFifth(value: T): Septet<A, B, C, D, T, F, G> =
        Septet(first, second, third, fourth, value, sixth, seventh)

    override fun <T> replaceSixth(value: T): Septet<A, B, C, D, E, T, G> =
        Septet(first, second, third, fourth, fifth, value, seventh)

    override fun <T> replaceSeventh(value: T): Septet<A, B, C, D, E, F, T> =
        replaceLast(value)

    override fun toString(): String =
        super.toString()
}
