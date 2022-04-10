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
import com.rooksoto.tuples.constants.DECADE_SIZE
import com.rooksoto.tuples.constants.ELEMENT_SIZE
import com.rooksoto.tuples.constants.EMPTY_SIZE
import com.rooksoto.tuples.constants.ENNEAD_SIZE
import com.rooksoto.tuples.constants.OCTET_SIZE
import com.rooksoto.tuples.constants.PAIR_SIZE
import com.rooksoto.tuples.constants.QUARTET_SIZE
import com.rooksoto.tuples.constants.QUINTET_SIZE
import com.rooksoto.tuples.constants.SEPTET_SIZE
import com.rooksoto.tuples.constants.SEXTET_SIZE
import com.rooksoto.tuples.constants.TRIPLET_SIZE
import com.rooksoto.tuples.exceptions.TupleSourceListEmptyException
import com.rooksoto.tuples.exceptions.TupleSourceListTooSmallException

/**
 * Creates a [Tuple] of appropriate capacity from a [List] of
 * upto to 10 elements.
 *
 * @receiver The [List] of elements from which to create
 * the [Tuple]
 * @return A [Tuple] comprising the elements in the [List]
 * @throws TupleSourceListTooSmallException if the source
 * [List] is empty
 */
fun <T> List<T>.toTuple(): Tuple =
    when (size) {
        EMPTY_SIZE -> throw TupleSourceListEmptyException
        ELEMENT_SIZE -> toElement()
        PAIR_SIZE -> toPair()
        TRIPLET_SIZE -> toTriplet()
        QUARTET_SIZE -> toQuartet()
        QUINTET_SIZE -> toQuintet()
        SEXTET_SIZE -> toSextet()
        SEPTET_SIZE -> toSeptet()
        OCTET_SIZE -> toOctet()
        ENNEAD_SIZE -> toEnnead()
        else -> toDecade()
    }

/**
 * Creates a [Element] comprising the first element in a
 * [List] of 1 or more elements
 *
 * @receiver The [List] of elements from which to create
 * the [Element]
 * @return A [Element] comprising the first element in the
 * [List]
 * @throws TupleSourceListTooSmallException if the source
 * [List] is empty
 */
fun <T> List<T>.toElement(): Element<T> =
    when {
        isEmpty() -> throw TupleSourceListEmptyException
        else -> Element(first())
    }

/**
 * Creates a [KeyValue] where the key and value represent
 * the first two elements in a [List] of 2 or more elements
 *
 * @receiver The [List] of elements from which to create
 * the [KeyValue]
 * @return A [KeyValue] comprising the first two elements in the
 * [List], where the first element is the key and the second
 * element is the value
 * @throws TupleSourceListTooSmallException if the source
 * [List] is empty
 * @throws TupleSourceListTooSmallException if the source
 * [List] has fewer than 2 elements
 */
fun <T> List<T>.toKeyValue(): KeyValue<T, T> =
    when {
        isEmpty() -> throw TupleSourceListEmptyException
        size < PAIR_SIZE -> throw TupleSourceListTooSmallException
        else -> KeyValue(this[0], this[1])
    }

/**
 * Creates a [LabelValue] where the key and value represent
 * the first two elements in a [List] of 2 or more elements
 *
 * @receiver The [List] of elements from which to create
 * the [KeyValue]
 * @return A [LabelValue] comprising the first two elements in the
 * [List], where the first element is the label and the second
 * element is the value
 * @throws TupleSourceListTooSmallException if the source
 * [List] is empty
 * @throws TupleSourceListTooSmallException if the source
 * [List] has fewer than 2 elements
 */
fun <T> List<T>.toLabelValue(): LabelValue<T, T> =
    when {
        isEmpty() -> throw TupleSourceListEmptyException
        size < PAIR_SIZE -> throw TupleSourceListTooSmallException
        else -> LabelValue(this[0], this[1])
    }

/**
 * Creates a [Pair] comprising the first two elements in a
 * [List] of 2 or more elements
 *
 * @receiver The [List] of elements from which to create
 * the [Pair]
 * @return A [Pair] comprising the first two elements in the
 * [List]
 * @throws TupleSourceListTooSmallException if the source
 * [List] is empty
 * @throws TupleSourceListTooSmallException if the source
 * [List] has fewer than 2 elements
 */
fun <T> List<T>.toPair(): Pair<T, T> =
    when {
        isEmpty() -> throw TupleSourceListEmptyException
        size < PAIR_SIZE -> throw TupleSourceListTooSmallException
        else -> Pair(this[0], this[1])
    }

/**
 * Creates a [Triplet] comprising the first three elements in a
 * [List] of 3 or more elements
 *
 * @receiver The [List] of elements from which to create
 * the [Triplet]
 * @return A [Triplet] comprising the first three elements in the
 * [List]
 * @throws TupleSourceListTooSmallException if the source
 * [List] is empty
 * @throws TupleSourceListTooSmallException if the source
 * [List] has fewer than 3 elements
 */
fun <T> List<T>.toTriplet(): Triplet<T, T, T> =
    when {
        isEmpty() -> throw TupleSourceListEmptyException
        size < TRIPLET_SIZE -> throw TupleSourceListTooSmallException
        else -> Triplet(this[0], this[1], this[2])
    }

/**
 * Creates a [Quartet] comprising the first four elements in a
 * [List] of 4 or more elements
 *
 * @receiver The [List] of elements from which to create
 * the [Quartet]
 * @return A [Quartet] comprising the first four elements in the
 * [List]
 * @throws TupleSourceListTooSmallException if the source
 * [List] is empty
 * @throws TupleSourceListTooSmallException if the source
 * [List] has fewer than 4 elements
 */
fun <T> List<T>.toQuartet(): Quartet<T, T, T, T> =
    when {
        isEmpty() -> throw TupleSourceListEmptyException
        size < QUARTET_SIZE -> throw TupleSourceListTooSmallException
        else -> Quartet(this[0], this[1], this[2], this[3])
    }

/**
 * Creates a [Quintet] comprising the first five elements in a
 * [List] of 5 or more elements
 *
 * @receiver The [List] of elements from which to create
 * the [Quintet]
 * @return A [Quintet] comprising the first five elements in the
 * [List]
 * @throws TupleSourceListTooSmallException if the source
 * [List] is empty
 * @throws TupleSourceListTooSmallException if the source
 * [List] has fewer than 5 elements
 */
fun <T> List<T>.toQuintet(): Quintet<T, T, T, T, T> =
    when {
        isEmpty() -> throw TupleSourceListEmptyException
        size < QUINTET_SIZE -> throw TupleSourceListTooSmallException
        else -> Quintet(this[0], this[1], this[2], this[3], this[4])
    }

/**
 * Creates a [Sextet] comprising the first six elements in a
 * [List] of 6 or more elements
 *
 * @receiver The [List] of elements from which to create
 * the [Sextet]
 * @return A [Sextet] comprising the first six elements in the
 * [List]
 * @throws TupleSourceListTooSmallException if the source
 * [List] is empty
 * @throws TupleSourceListTooSmallException if the source
 * [List] has fewer than 6 elements
 */
fun <T> List<T>.toSextet(): Sextet<T, T, T, T, T, T> =
    when {
        isEmpty() -> throw TupleSourceListEmptyException
        size < SEXTET_SIZE -> throw TupleSourceListTooSmallException
        else -> Sextet(this[0], this[1], this[2], this[3], this[4], this[5])
    }

/**
 * Creates a [Septet] comprising the first seven elements in a
 * [List] of 7 or more elements
 *
 * @receiver The [List] of elements from which to create
 * the [Septet]
 * @return A [Septet] comprising the first seven elements in the
 * [List]
 * @throws TupleSourceListTooSmallException if the source
 * [List] is empty
 * @throws TupleSourceListTooSmallException if the source
 * [List] has fewer than 7 elements
 */
fun <T> List<T>.toSeptet(): Septet<T, T, T, T, T, T, T> =
    when {
        isEmpty() -> throw TupleSourceListEmptyException
        size < SEPTET_SIZE -> throw TupleSourceListTooSmallException
        else -> Septet(this[0], this[1], this[2], this[3], this[4], this[5], this[6])
    }

/**
 * Creates a [Octet] comprising the first eight elements in a
 * [List] of 8 or more elements
 *
 * @receiver The [List] of elements from which to create
 * the [Octet]
 * @return A [Octet] comprising the first eight elements in the
 * [List]
 * @throws TupleSourceListTooSmallException if the source
 * [List] is empty
 * @throws TupleSourceListTooSmallException if the source
 * [List] has fewer than 8 elements
 */
fun <T> List<T>.toOctet(): Octet<T, T, T, T, T, T, T, T> =
    when {
        isEmpty() -> throw TupleSourceListEmptyException
        size < OCTET_SIZE -> throw TupleSourceListTooSmallException
        else -> Octet(this[0], this[1], this[2], this[3], this[4], this[5], this[6], this[7])
    }

/**
 * Creates a [Ennead] comprising the first nine elements in a
 * [List] of 9 or more elements
 *
 * @receiver The [List] of elements from which to create
 * the [Ennead]
 * @return A [Ennead] comprising the first nine elements in the
 * [List]
 * @throws TupleSourceListTooSmallException if the source
 * [List] is empty
 * @throws TupleSourceListTooSmallException if the source
 * [List] has fewer than 9 elements
 */
fun <T> List<T>.toEnnead(): Ennead<T, T, T, T, T, T, T, T, T> =
    when {
        isEmpty() -> throw TupleSourceListEmptyException
        size < ENNEAD_SIZE -> throw TupleSourceListTooSmallException
        else -> Ennead(this[0], this[1], this[2], this[3], this[4], this[5], this[6], this[7], this[8])
    }

/**
 * Creates a [Decade] comprising the first ten elements in a
 * [List] of 10 or more elements
 *
 * @receiver The [List] of elements from which to create
 * the [Decade]
 * @return A [Decade] comprising the first ten elements in the
 * [List]
 * @throws TupleSourceListTooSmallException if the source
 * [List] is empty
 * @throws TupleSourceListTooSmallException if the source
 * [List] has fewer than 10 elements
 */
fun <T> List<T>.toDecade(): Decade<T, T, T, T, T, T, T, T, T, T> =
    when {
        isEmpty() -> throw TupleSourceListEmptyException
        size < DECADE_SIZE -> throw TupleSourceListTooSmallException
        else -> Decade(this[0], this[1], this[2], this[3], this[4], this[5], this[6], this[7], this[8], this[9])
    }

/**
 * Creates a [Tuple] of appropriate capacity from a [Collection] of
 * upto to 10 elements.
 *
 * @receiver The [Collection] of elements from which to create
 * the [Tuple]
 * @return A [Tuple] comprising the elements in the [List]
 * @throws TupleSourceListTooSmallException if the source
 * [Collection] is empty
 */
inline fun <reified T> Collection<T>.toTuple() = toList().toTuple()

/**
 * Creates a [Element] comprising the first element in a
 * [Collection] of 1 or more elements
 *
 * @receiver The [Collection] of elements from which to create
 * the [Element]
 * @return A [Element] comprising the first element in the
 * [Collection]
 * @throws TupleSourceListTooSmallException if the source
 * [Collection] is empty
 */
inline fun <reified T> Collection<T>.toElement() = toList().toElement()

/**
 * Creates a [KeyValue] where the key and value represent
 * the first two elements in a [Collection] of 2 or more elements
 *
 * @receiver The [Collection] of elements from which to create
 * the [KeyValue]
 * @return A [KeyValue] comprising the first two elements in the
 * [Collection], where the first element is the key and the second
 * element is the value
 * @throws TupleSourceListTooSmallException if the source
 * [Collection] is empty
 * @throws TupleSourceListTooSmallException if the source
 * [Collection] has fewer than 2 elements
 */
inline fun <reified T> Collection<T>.toKeyValue() = toList().toKeyValue()

/**
 * Creates a [LabelValue] where the key and value represent
 * the first two elements in a [Collection] of 2 or more elements
 *
 * @receiver The [Collection] of elements from which to create
 * the [KeyValue]
 * @return A [LabelValue] comprising the first two elements in the
 * [Collection], where the first element is the label and the second
 * element is the value
 * @throws TupleSourceListTooSmallException if the source
 * [Collection] is empty
 * @throws TupleSourceListTooSmallException if the source
 * [Collection] has fewer than 2 elements
 */
inline fun <reified T> Collection<T>.toLabelValue() = toList().toLabelValue()

/**
 * Creates a [Pair] comprising the first two elements in a
 * [Collection] of 2 or more elements
 *
 * @receiver The [Collection] of elements from which to create
 * the [Pair]
 * @return A [Pair] comprising the first two elements in the
 * [Collection]
 * @throws TupleSourceListTooSmallException if the source
 * [Collection] is empty
 * @throws TupleSourceListTooSmallException if the source
 * [Collection] has fewer than 2 elements
 */
inline fun <reified T> Collection<T>.toPair() = toList().toPair()

/**
 * Creates a [Triplet] comprising the first three elements in a
 * [Collection] of 3 or more elements
 *
 * @receiver The [Collection] of elements from which to create
 * the [Triplet]
 * @return A [Triplet] comprising the first three elements in the
 * [Collection]
 * @throws TupleSourceListTooSmallException if the source
 * [Collection] is empty
 * @throws TupleSourceListTooSmallException if the source
 * [Collection] has fewer than 3 elements
 */
inline fun <reified T> Collection<T>.toTriplet() = toList().toTriplet()

/**
 * Creates a [Quartet] comprising the first four elements in a
 * [Collection] of 4 or more elements
 *
 * @receiver The [Collection] of elements from which to create
 * the [Quartet]
 * @return A [Quartet] comprising the first four elements in the
 * [Collection]
 * @throws TupleSourceListTooSmallException if the source
 * [Collection] is empty
 * @throws TupleSourceListTooSmallException if the source
 * [Collection] has fewer than 4 elements
 */
inline fun <reified T> Collection<T>.toQuartet() = toList().toQuartet()

/**
 * Creates a [Quintet] comprising the first five elements in a
 * [Collection] of 5 or more elements
 *
 * @receiver The [Collection] of elements from which to create
 * the [Quintet]
 * @return A [Quintet] comprising the first five elements in the
 * [Collection]
 * @throws TupleSourceListTooSmallException if the source
 * [Collection] is empty
 * @throws TupleSourceListTooSmallException if the source
 * [Collection] has fewer than 5 elements
 */
inline fun <reified T> Collection<T>.toQuintet() = toList().toQuintet()

/**
 * Creates a [Sextet] comprising the first six elements in a
 * [Collection] of 6 or more elements
 *
 * @receiver The [Collection] of elements from which to create
 * the [Sextet]
 * @return A [Sextet] comprising the first six elements in the
 * [Collection]
 * @throws TupleSourceListTooSmallException if the source
 * [Collection] is empty
 * @throws TupleSourceListTooSmallException if the source
 * [Collection] has fewer than 6 elements
 */
inline fun <reified T> Collection<T>.toSextet() = toList().toSextet()

/**
 * Creates a [Septet] comprising the first seven elements in a
 * [Collection] of 7 or more elements
 *
 * @receiver The [Collection] of elements from which to create
 * the [Septet]
 * @return A [Septet] comprising the first seven elements in the
 * [Collection]
 * @throws TupleSourceListTooSmallException if the source
 * [Collection] is empty
 * @throws TupleSourceListTooSmallException if the source
 * [Collection] has fewer than 7 elements
 */
inline fun <reified T> Collection<T>.toSeptet() = toList().toSeptet()

/**
 * Creates a [Octet] comprising the first eight elements in a
 * [Collection] of 8 or more elements
 *
 * @receiver The [Collection] of elements from which to create
 * the [Octet]
 * @return A [Octet] comprising the first eight elements in the
 * [Collection]
 * @throws TupleSourceListTooSmallException if the source
 * [Collection] is empty
 * @throws TupleSourceListTooSmallException if the source
 * [Collection] has fewer than 8 elements
 */
inline fun <reified T> Collection<T>.toOctet() = toList().toOctet()

/**
 * Creates a [Ennead] comprising the first nine elements in a
 * [Collection] of 9 or more elements
 *
 * @receiver The [Collection] of elements from which to create
 * the [Ennead]
 * @return A [Ennead] comprising the first nine elements in the
 * [Collection]
 * @throws TupleSourceListTooSmallException if the source
 * [Collection] is empty
 * @throws TupleSourceListTooSmallException if the source
 * [Collection] has fewer than 9 elements
 */
inline fun <reified T> Collection<T>.toEnnead() = toList().toEnnead()

/**
 * Creates a [Decade] comprising the first ten elements in a
 * [Collection] of 10 or more elements
 *
 * @receiver The [Collection] of elements from which to create
 * the [Decade]
 * @return A [Decade] comprising the first ten elements in the
 * [Collection]
 * @throws TupleSourceListTooSmallException if the source
 * [Collection] is empty
 * @throws TupleSourceListTooSmallException if the source
 * [Collection] has fewer than 10 elements
 */
inline fun <reified T> Collection<T>.toDecade() = toList().toDecade()
