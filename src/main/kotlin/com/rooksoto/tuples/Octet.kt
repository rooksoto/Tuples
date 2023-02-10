package com.rooksoto.tuples

import com.rooksoto.tuples.constants.OCTET_SIZE
import com.rooksoto.tuples.exceptions.TupleIndexOutOfBoundsException
import com.rooksoto.tuples.interfaces.AddsElements
import com.rooksoto.tuples.interfaces.ConvertsToSeptet
import com.rooksoto.tuples.interfaces.DropsEighth
import com.rooksoto.tuples.interfaces.DropsLast
import com.rooksoto.tuples.interfaces.InsertsNinth
import com.rooksoto.tuples.interfaces.ReplacesEighth
import com.rooksoto.tuples.interfaces.ReplacesLast
import com.rooksoto.tuples.utils.simpleName

/**
 * A [Octet] is a [Tuple] that can store 8 elements.
 *
 * @param A The type of the first element in the tuple.
 * @param B The type of the second element in the tuple.
 * @param C The type of the third element in the tuple.
 * @param D The type of the fourth element in the tuple.
 * @param E The type of the fifth element in the tuple.
 * @param F The type of the sixth element in the tuple.
 * @param G The type of the seventh element in the tuple.
 * @param H The type of the eighth element in the tuple.
 * @property first The first element in the tuple.
 * @property second The second element in the tuple.
 * @property third The third element in the tuple.
 * @property fourth The fourth element in the tuple.
 * @property fifth The fifth element in the tuple.
 * @property sixth The sixth element in the tuple.
 * @property seventh The seventh element in the tuple.
 * @property eighth The eighth element in the tuple.
 */
data class Octet<A, B, C, D, E, F, G, H>(
    val first: A,
    val second: B,
    val third: C,
    val fourth: D,
    val fifth: E,
    val sixth: F,
    val seventh: G,
    val eighth: H
) : Tuple(),
    ConvertsToSeptet,
    AddsElements,
    DropsLast,
    InsertsNinth,
    DropsEighth,
    ReplacesLast,
    ReplacesEighth {

    override val size: Int =
        OCTET_SIZE

    override fun get(index: Int): Any? =
        when (index) {
            0 -> first
            1 -> second
            2 -> third
            3 -> fourth
            4 -> fifth
            5 -> sixth
            6 -> seventh
            7 -> eighth
            else -> TupleIndexOutOfBoundsException(simpleName(), index, size)
        }

    override fun toSeptet(): Septet<A, B, C, D, E, F, G> =
        Septet(first, second, third, fourth, fifth, sixth, seventh)

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

    override fun <T> add(value: T): Ennead<A, B, C, D, E, F, G, H, T> =
        Ennead(first, second, third, fourth, fifth, sixth, seventh, eighth, value)

    override fun dropLast(): Septet<A, B, C, D, E, F, G> =
        toSeptet()

    override fun <T> insertFirst(value: T): Ennead<T, A, B, C, D, E, F, G, H> =
        Ennead(value, first, second, third, fourth, fifth, sixth, seventh, eighth)

    override fun <T> insertSecond(value: T): Ennead<A, T, B, C, D, E, F, G, H> =
        Ennead(first, value, second, third, fourth, fifth, sixth, seventh, eighth)

    override fun <T> insertThird(value: T): Ennead<A, B, T, C, D, E, F, G, H> =
        Ennead(first, second, value, third, fourth, fifth, sixth, seventh, eighth)

    override fun <T> insertFourth(value: T): Ennead<A, B, C, T, D, E, F, G, H> =
        Ennead(first, second, third, value, fourth, fifth, sixth, seventh, eighth)

    override fun <T> insertFifth(value: T): Ennead<A, B, C, D, T, E, F, G, H> =
        Ennead(first, second, third, fourth, value, fifth, sixth, seventh, eighth)

    override fun <T> insertSixth(value: T): Ennead<A, B, C, D, E, T, F, G, H> =
        Ennead(first, second, third, fourth, fifth, value, sixth, seventh, eighth)

    override fun <T> insertSeventh(value: T): Ennead<A, B, C, D, E, F, T, G, H> =
        Ennead(first, second, third, fourth, fifth, sixth, value, seventh, eighth)

    override fun <T> insertEighth(value: T): Ennead<A, B, C, D, E, F, G, T, H> =
        Ennead(first, second, third, fourth, fifth, sixth, seventh, value, eighth)

    override fun <T> insertNinth(value: T): Ennead<A, B, C, D, E, F, G, H, T> =
        add(value)

    override fun dropFirst(): Septet<B, C, D, E, F, G, H> =
        Septet(second, third, fourth, fifth, sixth, seventh, eighth)

    override fun dropSecond(): Septet<A, C, D, E, F, G, H> =
        Septet(first, third, fourth, fifth, sixth, seventh, eighth)

    override fun dropThird(): Septet<A, B, D, E, F, G, H> =
        Septet(first, second, fourth, fifth, sixth, seventh, eighth)

    override fun dropFourth(): Septet<A, B, C, E, F, G, H> =
        Septet(first, second, third, fifth, sixth, seventh, eighth)

    override fun dropFifth(): Septet<A, B, C, D, F, G, H> =
        Septet(first, second, third, fourth, sixth, seventh, eighth)

    override fun dropSixth(): Septet<A, B, C, D, E, G, H> =
        Septet(first, second, third, fourth, fifth, seventh, eighth)

    override fun dropSeventh(): Septet<A, B, C, D, E, F, H> =
        Septet(first, second, third, fourth, fifth, sixth, eighth)

    override fun dropEighth(): Septet<A, B, C, D, E, F, G> =
        dropLast()

    override fun <T> replaceLast(value: T): Octet<A, B, C, D, E, F, G, T> =
        Octet(first, second, third, fourth, fifth, sixth, seventh, value)

    override fun <T> replaceFirst(value: T): Octet<T, B, C, D, E, F, G, H> =
        Octet(value, second, third, fourth, fifth, sixth, seventh, eighth)

    override fun <T> replaceSecond(value: T): Octet<A, T, C, D, E, F, G, H> =
        Octet(first, value, third, fourth, fifth, sixth, seventh, eighth)

    override fun <T> replaceThird(value: T): Octet<A, B, T, D, E, F, G, H> =
        Octet(first, second, value, fourth, fifth, sixth, seventh, eighth)

    override fun <T> replaceFourth(value: T): Octet<A, B, C, T, E, F, G, H> =
        Octet(first, second, third, value, fifth, sixth, seventh, eighth)

    override fun <T> replaceFifth(value: T): Octet<A, B, C, D, T, F, G, H> =
        Octet(first, second, third, fourth, value, sixth, seventh, eighth)

    override fun <T> replaceSixth(value: T): Octet<A, B, C, D, E, T, G, H> =
        Octet(first, second, third, fourth, fifth, value, seventh, eighth)

    override fun <T> replaceSeventh(value: T): Octet<A, B, C, D, E, F, T, H> =
        Octet(first, second, third, fourth, fifth, sixth, value, eighth)

    override fun <T> replaceEighth(value: T): Octet<A, B, C, D, E, F, G, T> =
        replaceLast(value)

    override fun toString(): String =
        super.toString()
}
