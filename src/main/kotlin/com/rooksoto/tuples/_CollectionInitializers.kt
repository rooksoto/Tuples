package com.rooksoto.tuples

fun <T> List<T>.toTuple(): Tuple =
    when (size) {
        EMPTY_SIZE -> throw TupleSourceListEmptyException
        UNIT_SIZE -> toUnit()
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

fun <T> List<T>.toUnit(): Unit<T> =
    when {
        isEmpty() -> throw TupleSourceListEmptyException
        else -> Unit(first())
    }

fun <T> List<T>.toKeyValue(): KeyValue<T, T> =
    when {
        isEmpty() -> throw TupleSourceListEmptyException
        size < PAIR_SIZE -> throw TupleSourceListTooSmallException
        else -> KeyValue(this[0], this[1])
    }

fun <T> List<T>.toLabelValue(): LabelValue<T, T> =
    when {
        isEmpty() -> throw TupleSourceListEmptyException
        size < PAIR_SIZE -> throw TupleSourceListTooSmallException
        else -> LabelValue(this[0], this[1])
    }

fun <T> List<T>.toPair(): Pair<T, T> =
    when {
        isEmpty() -> throw TupleSourceListEmptyException
        size < PAIR_SIZE -> throw TupleSourceListTooSmallException
        else -> Pair(this[0], this[1])
    }

fun <T> List<T>.toTriplet(): Triplet<T, T, T> =
    when {
        isEmpty() -> throw TupleSourceListEmptyException
        size < TRIPLET_SIZE -> throw TupleSourceListTooSmallException
        else -> Triplet(this[0], this[1], this[2])
    }

fun <T> List<T>.toQuartet(): Quartet<T, T, T, T> =
    when {
        isEmpty() -> throw TupleSourceListEmptyException
        size < QUARTET_SIZE -> throw TupleSourceListTooSmallException
        else -> Quartet(this[0], this[1], this[2], this[3])
    }

fun <T> List<T>.toQuintet(): Quintet<T, T, T, T, T> =
    when {
        isEmpty() -> throw TupleSourceListEmptyException
        size < QUINTET_SIZE -> throw TupleSourceListTooSmallException
        else -> Quintet(this[0], this[1], this[2], this[3], this[4])
    }

fun <T> List<T>.toSextet(): Sextet<T, T, T, T, T, T> =
    when {
        isEmpty() -> throw TupleSourceListEmptyException
        size < SEXTET_SIZE -> throw TupleSourceListTooSmallException
        else -> Sextet(this[0], this[1], this[2], this[3], this[4], this[5])
    }

fun <T> List<T>.toSeptet(): Septet<T, T, T, T, T, T, T> =
    when {
        isEmpty() -> throw TupleSourceListEmptyException
        size < SEPTET_SIZE -> throw TupleSourceListTooSmallException
        else -> Septet(this[0], this[1], this[2], this[3], this[4], this[5], this[6])
    }

fun <T> List<T>.toOctet(): Octet<T, T, T, T, T, T, T, T> =
    when {
        isEmpty() -> throw TupleSourceListEmptyException
        size < OCTET_SIZE -> throw TupleSourceListTooSmallException
        else -> Octet(this[0], this[1], this[2], this[3], this[4], this[5], this[6], this[7])
    }

fun <T> List<T>.toEnnead(): Ennead<T, T, T, T, T, T, T, T, T> =
    when {
        isEmpty() -> throw TupleSourceListEmptyException
        size < ENNEAD_SIZE -> throw TupleSourceListTooSmallException
        else -> Ennead(this[0], this[1], this[2], this[3], this[4], this[5], this[6], this[7], this[8])
    }

fun <T> List<T>.toDecade(): Decade<T, T, T, T, T, T, T, T, T, T> =
    when {
        isEmpty() -> throw TupleSourceListEmptyException
        size < DECADE_SIZE -> throw TupleSourceListTooSmallException
        else -> Decade(this[0], this[1], this[2], this[3], this[4], this[5], this[6], this[7], this[8], this[9])
    }

inline fun <reified T> Collection<T>.toTuple() = toList().toTuple()
inline fun <reified T> Collection<T>.toUnit() = toList().toUnit()
inline fun <reified T> Collection<T>.toPair() = toList().toPair()
inline fun <reified T> Collection<T>.toKeyValue() = toList().toKeyValue()
inline fun <reified T> Collection<T>.toLabelValue() = toList().toLabelValue()
inline fun <reified T> Collection<T>.toTriplet() = toList().toTriplet()
inline fun <reified T> Collection<T>.toQuartet() = toList().toQuartet()
inline fun <reified T> Collection<T>.toQuintet() = toList().toQuintet()
inline fun <reified T> Collection<T>.toSextet() = toList().toSextet()
inline fun <reified T> Collection<T>.toSeptet() = toList().toSeptet()
inline fun <reified T> Collection<T>.toOctet() = toList().toOctet()
inline fun <reified T> Collection<T>.toEnnead() = toList().toEnnead()
inline fun <reified T> Collection<T>.toDecade() = toList().toDecade()
