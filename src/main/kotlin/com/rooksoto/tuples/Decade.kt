package com.rooksoto.tuples

import com.rooksoto.tuples.constants.DECADE_SIZE
import com.rooksoto.tuples.exceptions.TupleIndexOutOfBoundsException
import com.rooksoto.tuples.interfaces.ConvertsToEnnead
import com.rooksoto.tuples.interfaces.DropsLast
import com.rooksoto.tuples.interfaces.DropsTenth
import com.rooksoto.tuples.interfaces.ReplacesLast
import com.rooksoto.tuples.interfaces.ReplacesTenth
import com.rooksoto.tuples.utils.simpleName

/**
 * A [Decade] is a [Tuple] that can store 10 elements.
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
 * @param J The type of the tenth element in the tuple.
 * @property first The first element in the tuple.
 * @property second The second element in the tuple.
 * @property third The third element in the tuple.
 * @property fourth The fourth element in the tuple.
 * @property fifth The fifth element in the tuple.
 * @property sixth The sixth element in the tuple.
 * @property seventh The seventh element in the tuple.
 * @property eighth The eighth element in the tuple.
 * @property ninth The ninth element in the tuple.
 * @property tenth The tenth element in the tuple.
 */
data class Decade<A, B, C, D, E, F, G, H, I, J>(
    val first: A,
    val second: B,
    val third: C,
    val fourth: D,
    val fifth: E,
    val sixth: F,
    val seventh: G,
    val eighth: H,
    val ninth: I,
    val tenth: J
) : Tuple(),
    ConvertsToEnnead,
    DropsLast,
    DropsTenth,
    ReplacesLast,
    ReplacesTenth {

    override val size: Int =
        DECADE_SIZE

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
            9 -> tenth
            else -> TupleIndexOutOfBoundsException(simpleName(), index, size)
        }

    override fun toEnnead(): Ennead<A, B, C, D, E, F, G, H, I> =
        Ennead(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth)

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

    override fun dropLast(): Ennead<A, B, C, D, E, F, G, H, I> =
        toEnnead()

    override fun dropFirst(): Ennead<B, C, D, E, F, G, H, I, J> =
        Ennead(second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth)

    override fun dropSecond(): Ennead<A, C, D, E, F, G, H, I, J> =
        Ennead(first, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth)

    override fun dropThird(): Ennead<A, B, D, E, F, G, H, I, J> =
        Ennead(first, second, fourth, fifth, sixth, seventh, eighth, ninth, tenth)

    override fun dropFourth(): Ennead<A, B, C, E, F, G, H, I, J> =
        Ennead(first, second, third, fifth, sixth, seventh, eighth, ninth, tenth)

    override fun dropFifth(): Ennead<A, B, C, D, F, G, H, I, J> =
        Ennead(first, second, third, fourth, sixth, seventh, eighth, ninth, tenth)

    override fun dropSixth(): Ennead<A, B, C, D, E, G, H, I, J> =
        Ennead(first, second, third, fourth, fifth, seventh, eighth, ninth, tenth)

    override fun dropSeventh(): Ennead<A, B, C, D, E, F, H, I, J> =
        Ennead(first, second, third, fourth, fifth, sixth, eighth, ninth, tenth)

    override fun dropEighth(): Ennead<A, B, C, D, E, F, G, I, J> =
        Ennead(first, second, third, fourth, fifth, sixth, seventh, ninth, tenth)

    override fun dropNinth(): Ennead<A, B, C, D, E, F, G, H, J> =
        Ennead(first, second, third, fourth, fifth, sixth, seventh, eighth, tenth)

    override fun dropTenth(): Ennead<A, B, C, D, E, F, G, H, I> =
        dropLast()

    override fun <T> replaceLast(value: T): Decade<A, B, C, D, E, F, G, H, I, T> =
        Decade(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, value)

    override fun <T> replaceFirst(value: T): Decade<T, B, C, D, E, F, G, H, I, J> =
        Decade(value, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth)

    override fun <T> replaceSecond(value: T): Decade<A, T, C, D, E, F, G, H, I, J> =
        Decade(first, value, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth)

    override fun <T> replaceThird(value: T): Decade<A, B, T, D, E, F, G, H, I, J> =
        Decade(first, second, value, fourth, fifth, sixth, seventh, eighth, ninth, tenth)

    override fun <T> replaceFourth(value: T): Decade<A, B, C, T, E, F, G, H, I, J> =
        Decade(first, second, third, value, fifth, sixth, seventh, eighth, ninth, tenth)

    override fun <T> replaceFifth(value: T): Decade<A, B, C, D, T, F, G, H, I, J> =
        Decade(first, second, third, fourth, value, sixth, seventh, eighth, ninth, tenth)

    override fun <T> replaceSixth(value: T): Decade<A, B, C, D, E, T, G, H, I, J> =
        Decade(first, second, third, fourth, fifth, value, seventh, eighth, ninth, tenth)

    override fun <T> replaceSeventh(value: T): Decade<A, B, C, D, E, F, T, H, I, J> =
        Decade(first, second, third, fourth, fifth, sixth, value, eighth, ninth, tenth)

    override fun <T> replaceEighth(value: T): Decade<A, B, C, D, E, F, G, T, I, J> =
        Decade(first, second, third, fourth, fifth, sixth, seventh, value, ninth, tenth)

    override fun <T> replaceNinth(value: T): Decade<A, B, C, D, E, F, G, H, T, J> =
        Decade(first, second, third, fourth, fifth, sixth, seventh, eighth, value, tenth)

    override fun <T> replaceTenth(value: T): Decade<A, B, C, D, E, F, G, H, I, T> =
        replaceLast(value)

    override fun toString(): String =
        super.toString()
}
