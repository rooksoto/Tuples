package com.rooksoto.tuples

import com.rooksoto.tuples.constants.ENNEAD_SIZE
import com.rooksoto.tuples.exceptions.TupleIndexOutOfBoundsException
import com.rooksoto.tuples.interfaces.AddsElements
import com.rooksoto.tuples.interfaces.ConvertsToOctet
import com.rooksoto.tuples.interfaces.DropsLast
import com.rooksoto.tuples.interfaces.DropsNinth
import com.rooksoto.tuples.interfaces.InsertsTenth
import com.rooksoto.tuples.interfaces.ReplacesLast
import com.rooksoto.tuples.interfaces.ReplacesNinth
import com.rooksoto.tuples.utils.simpleName

/**
 * A [Ennead] is a [Tuple] that can store 9 elements.
 *
 * @param A The type of the first element in the tuple.
 * @param B The type of the second element in the tuple.
 * @param C The type of the third element in the tuple.
 * @param D The type of the fourth element in the tuple.
 * @param E The type of the fifth element in the tuple.
 * @param F The type of the sixth element in the tuple.
 * @param G The type of the seventh element in the tuple.
 * @param H The type of the eighth element in the tuple.
 * @param I The type of the ninth element in the tuple.
 * @property first The first element in the tuple.
 * @property second The second element in the tuple.
 * @property third The third element in the tuple.
 * @property fourth The fourth element in the tuple.
 * @property fifth The fifth element in the tuple.
 * @property sixth The sixth element in the tuple.
 * @property seventh The seventh element in the tuple.
 * @property eighth The eighth element in the tuple.
 * @property ninth The ninth element in the tuple.
 */
data class Ennead<A, B, C, D, E, F, G, H, I>(
    val first: A,
    val second: B,
    val third: C,
    val fourth: D,
    val fifth: E,
    val sixth: F,
    val seventh: G,
    val eighth: H,
    val ninth: I
) : Tuple(),
    ConvertsToOctet,
    AddsElements,
    DropsLast,
    InsertsTenth,
    DropsNinth,
    ReplacesLast,
    ReplacesNinth {

    override val size: Int =
        ENNEAD_SIZE

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
            8 -> ninth
            else -> TupleIndexOutOfBoundsException(simpleName(), index, size)
        }

    override fun iterator(): Iterator<*> =
        arrayOf(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth)
            .iterator()

    override fun toOctet(): Octet<A, B, C, D, E, F, G, H> =
        Octet(first, second, third, fourth, fifth, sixth, seventh, eighth)

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

    override fun <T> add(value: T): Decade<A, B, C, D, E, F, G, H, I, T> =
        Decade(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, value)

    override fun dropLast(): Octet<A, B, C, D, E, F, G, H> =
        toOctet()

    override fun <T> insertFirst(value: T): Decade<T, A, B, C, D, E, F, G, H, I> =
        Decade(value, first, second, third, fourth, fifth, sixth, seventh, eighth, ninth)

    override fun <T> insertSecond(value: T): Decade<A, T, B, C, D, E, F, G, H, I> =
        Decade(first, value, second, third, fourth, fifth, sixth, seventh, eighth, ninth)

    override fun <T> insertThird(value: T): Decade<A, B, T, C, D, E, F, G, H, I> =
        Decade(first, second, value, third, fourth, fifth, sixth, seventh, eighth, ninth)

    override fun <T> insertFourth(value: T): Decade<A, B, C, T, D, E, F, G, H, I> =
        Decade(first, second, third, value, fourth, fifth, sixth, seventh, eighth, ninth)

    override fun <T> insertFifth(value: T): Decade<A, B, C, D, T, E, F, G, H, I> =
        Decade(first, second, third, fourth, value, fifth, sixth, seventh, eighth, ninth)

    override fun <T> insertSixth(value: T): Decade<A, B, C, D, E, T, F, G, H, I> =
        Decade(first, second, third, fourth, fifth, value, sixth, seventh, eighth, ninth)

    override fun <T> insertSeventh(value: T): Decade<A, B, C, D, E, F, T, G, H, I> =
        Decade(first, second, third, fourth, fifth, sixth, value, seventh, eighth, ninth)

    override fun <T> insertEighth(value: T): Decade<A, B, C, D, E, F, G, T, H, I> =
        Decade(first, second, third, fourth, fifth, sixth, seventh, value, eighth, ninth)

    override fun <T> insertNinth(value: T): Decade<A, B, C, D, E, F, G, H, T, I> =
        Decade(first, second, third, fourth, fifth, sixth, seventh, eighth, value, ninth)

    override fun <T> insertTenth(value: T): Decade<A, B, C, D, E, F, G, H, I, T> =
        add(value)

    override fun dropFirst(): Octet<B, C, D, E, F, G, H, I> =
        Octet(second, third, fourth, fifth, sixth, seventh, eighth, ninth)

    override fun dropSecond(): Octet<A, C, D, E, F, G, H, I> =
        Octet(first, third, fourth, fifth, sixth, seventh, eighth, ninth)

    override fun dropThird(): Octet<A, B, D, E, F, G, H, I> =
        Octet(first, second, fourth, fifth, sixth, seventh, eighth, ninth)

    override fun dropFourth(): Octet<A, B, C, E, F, G, H, I> =
        Octet(first, second, third, fifth, sixth, seventh, eighth, ninth)

    override fun dropFifth(): Octet<A, B, C, D, F, G, H, I> =
        Octet(first, second, third, fourth, sixth, seventh, eighth, ninth)

    override fun dropSixth(): Octet<A, B, C, D, E, G, H, I> =
        Octet(first, second, third, fourth, fifth, seventh, eighth, ninth)

    override fun dropSeventh(): Octet<A, B, C, D, E, F, H, I> =
        Octet(first, second, third, fourth, fifth, sixth, eighth, ninth)

    override fun dropEighth(): Octet<A, B, C, D, E, F, G, I> =
        Octet(first, second, third, fourth, fifth, sixth, seventh, ninth)

    override fun dropNinth(): Octet<A, B, C, D, E, F, G, H> =
        dropLast()

    override fun <T> replaceLast(value: T): Ennead<A, B, C, D, E, F, G, H, T> =
        Ennead(first, second, third, fourth, fifth, sixth, seventh, eighth, value)

    override fun <T> replaceFirst(value: T): Ennead<T, B, C, D, E, F, G, H, I> =
        Ennead(value, second, third, fourth, fifth, sixth, seventh, eighth, ninth)

    override fun <T> replaceSecond(value: T): Ennead<A, T, C, D, E, F, G, H, I> =
        Ennead(first, value, third, fourth, fifth, sixth, seventh, eighth, ninth)

    override fun <T> replaceThird(value: T): Ennead<A, B, T, D, E, F, G, H, I> =
        Ennead(first, second, value, fourth, fifth, sixth, seventh, eighth, ninth)

    override fun <T> replaceFourth(value: T): Ennead<A, B, C, T, E, F, G, H, I> =
        Ennead(first, second, third, value, fifth, sixth, seventh, eighth, ninth)

    override fun <T> replaceFifth(value: T): Ennead<A, B, C, D, T, F, G, H, I> =
        Ennead(first, second, third, fourth, value, sixth, seventh, eighth, ninth)

    override fun <T> replaceSixth(value: T): Ennead<A, B, C, D, E, T, G, H, I> =
        Ennead(first, second, third, fourth, fifth, value, seventh, eighth, ninth)

    override fun <T> replaceSeventh(value: T): Ennead<A, B, C, D, E, F, T, H, I> =
        Ennead(first, second, third, fourth, fifth, sixth, value, eighth, ninth)

    override fun <T> replaceEighth(value: T): Ennead<A, B, C, D, E, F, G, T, I> =
        Ennead(first, second, third, fourth, fifth, sixth, seventh, value, ninth)

    override fun <T> replaceNinth(value: T): Ennead<A, B, C, D, E, F, G, H, T> =
        replaceLast(value)

    override fun toString(): String =
        super.toString()
}
