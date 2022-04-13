package com.rooksoto.tuples.initializers

import com.rooksoto.tuples.Decade
import com.rooksoto.tuples.Element
import com.rooksoto.tuples.Ennead
import com.rooksoto.tuples.KeyValue
import com.rooksoto.tuples.LabelValue
import com.rooksoto.tuples.Octet
import com.rooksoto.tuples.Pair
import com.rooksoto.tuples.Quartet
import com.rooksoto.tuples.Quintet
import com.rooksoto.tuples.Septet
import com.rooksoto.tuples.Sextet
import com.rooksoto.tuples.Triplet
import com.rooksoto.tuples.Tuple

/**
 * Convenience function to create a [Tuple] of appropriate capacity,
 * comprising the specified elements, up to 10.
 *
 * @param args The elements from which to create the [Tuple]
 */
fun tupleOf(
    vararg args: Any?
): Tuple = args.toList().toTuple()

/**
 * Convenience function to create a [Element] comprising the specified
 * element.
 *
 * @param first The element in the resulting [Element]
 */
fun <A> elementOf(
    first: A
) = Element(first)

/**
 * Convenience function to create a [Pair] comprising the specified
 * elements.
 *
 * @param first The first element in the resulting [Pair]
 * @param second The second element in the resulting [Pair]
 */
fun <A, B> pairOf(
    first: A,
    second: B
) = Pair(first, second)

/**
 * Convenience function to create a [KeyValue] comprising the specified
 * elements.
 *
 * @param key The key in the resulting [KeyValue]
 * @param value The value in the resulting [KeyValue]
 */
fun <K, V> keyValueOf(
    key: K,
    value: V
) = KeyValue(key, value)

/**
 * Convenience function to create a [LabelValue] comprising the specified
 * elements.
 *
 * @param label The key in the resulting [LabelValue]
 * @param value The value in the resulting [LabelValue]
 */
fun <L, V> labelValueOf(
    label: L,
    value: V
) = LabelValue(label, value)

/**
 * Convenience function to create a [Triplet] comprising the specified
 * elements.
 *
 * @param first The first element in the resulting [Triplet]
 * @param second The second element in the resulting [Triplet]
 * @param third The third element in the resulting [Triplet]
 */
fun <A, B, C> tripletOf(
    first: A,
    second: B,
    third: C
) = Triplet(first, second, third)

/**
 * Convenience function to create a [Quartet] comprising the specified
 * elements.
 *
 * @param first The first element in the resulting [Quartet]
 * @param second The second element in the resulting [Quartet]
 * @param third The third element in the resulting [Quartet]
 * @param fourth The fourth element in the resulting [Quartet]
 */
fun <A, B, C, D> quartetOf(
    first: A,
    second: B,
    third: C,
    fourth: D,
) = Quartet(first, second, third, fourth)

/**
 * Convenience function to create a [Quintet] comprising the specified
 * elements.
 *
 * @param first The first element in the resulting [Quintet]
 * @param second The second element in the resulting [Quintet]
 * @param third The third element in the resulting [Quintet]
 * @param fourth The fourth element in the resulting [Quintet]
 * @param fifth The fifth element in the resulting [Quintet]
 */
fun <A, B, C, D, E> quintetOf(
    first: A,
    second: B,
    third: C,
    fourth: D,
    fifth: E
) = Quintet(first, second, third, fourth, fifth)

/**
 * Convenience function to create a [Sextet] comprising the specified
 * elements.
 *
 * @param first The first element in the resulting [Sextet]
 * @param second The second element in the resulting [Sextet]
 * @param third The third element in the resulting [Sextet]
 * @param fourth The fourth element in the resulting [Sextet]
 * @param fifth The fifth element in the resulting [Sextet]
 * @param sixth The sixth element in the resulting [Sextet]
 */
fun <A, B, C, D, E, F> sextetOf(
    first: A,
    second: B,
    third: C,
    fourth: D,
    fifth: E,
    sixth: F
) = Sextet(first, second, third, fourth, fifth, sixth)

/**
 * Convenience function to create a [Septet] comprising the specified
 * elements.
 *
 * @param first The first element in the resulting [Septet]
 * @param second The second element in the resulting [Septet]
 * @param third The third element in the resulting [Septet]
 * @param fourth The fourth element in the resulting [Septet]
 * @param fifth The fifth element in the resulting [Septet]
 * @param sixth The sixth element in the resulting [Septet]
 * @param seventh The seventh element in the resulting [Septet]
 */
fun <A, B, C, D, E, F, G> septetOf(
    first: A,
    second: B,
    third: C,
    fourth: D,
    fifth: E,
    sixth: F,
    seventh: G
) = Septet(first, second, third, fourth, fifth, sixth, seventh)

/**
 * Convenience function to create a [Octet] comprising the specified
 * elements.
 *
 * @param first The first element in the resulting [Octet]
 * @param second The second element in the resulting [Octet]
 * @param third The third element in the resulting [Octet]
 * @param fourth The fourth element in the resulting [Octet]
 * @param fifth The fifth element in the resulting [Octet]
 * @param sixth The sixth element in the resulting [Octet]
 * @param seventh The seventh element in the resulting [Octet]
 * @param eighth The eighth element in the resulting [Octet]
 */
fun <A, B, C, D, E, F, G, H> octetOf(
    first: A,
    second: B,
    third: C,
    fourth: D,
    fifth: E,
    sixth: F,
    seventh: G,
    eighth: H
) = Octet(first, second, third, fourth, fifth, sixth, seventh, eighth)

/**
 * Convenience function to create a [Ennead] comprising the specified
 * elements.
 *
 * @param first The first element in the resulting [Ennead]
 * @param second The second element in the resulting [Ennead]
 * @param third The third element in the resulting [Ennead]
 * @param fourth The fourth element in the resulting [Ennead]
 * @param fifth The fifth element in the resulting [Ennead]
 * @param sixth The sixth element in the resulting [Ennead]
 * @param seventh The seventh element in the resulting [Ennead]
 * @param eighth The eighth element in the resulting [Ennead]
 * @param ninth The ninth element in the resulting [Ennead]
 */
fun <A, B, C, D, E, F, G, H, I> enneadOf(
    first: A,
    second: B,
    third: C,
    fourth: D,
    fifth: E,
    sixth: F,
    seventh: G,
    eighth: H,
    ninth: I
) = Ennead(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth)

/**
 * Convenience function to create a [Decade] comprising the specified
 * elements.
 *
 * @param first The first element in the resulting [Decade]
 * @param second The second element in the resulting [Decade]
 * @param third The third element in the resulting [Decade]
 * @param fourth The fourth element in the resulting [Decade]
 * @param fifth The fifth element in the resulting [Decade]
 * @param sixth The sixth element in the resulting [Decade]
 * @param seventh The seventh element in the resulting [Decade]
 * @param eighth The eighth element in the resulting [Decade]
 * @param ninth The ninth element in the resulting [Decade]
 * @param tenth The tenth element in the resulting [Decade]
 */
fun <A, B, C, D, E, F, G, H, I, J> decadeOf(
    first: A,
    second: B,
    third: C,
    fourth: D,
    fifth: E,
    sixth: F,
    seventh: G,
    eighth: H,
    ninth: I,
    tenth: J
) = Decade(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth)
