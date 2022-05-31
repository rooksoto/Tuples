package com.rooksoto.tuples.utils

import com.rooksoto.tuples.Tuple

internal fun Any.simpleName(): String =
    this::class.java.simpleName

internal fun Tuple.compareByCapacity(other: Tuple): Int =
    (this.size - other.size).normalized()

internal fun Tuple.internalCompareTo(other: Tuple): Int =
    when {
        (size != other.size) -> compareByCapacity(other)
        else -> zip(other).firstInequalityOrEqual()
    }

internal fun Any?.internalCompareTo(other: Any?): Int =
    when {
        isNull() || other.isNull() -> compareNullable(other)
        this is Number && other is Number -> widenAndCompareTo(other)
        this is String && other is String -> compareTo(other)
        else -> toString().compareTo(other.toString())
    }

private fun Any?.compareNullable(other: Any?): Int =
    when {
        isNull() && other.isNotNull() -> -1
        isNotNull() && other.isNull() -> 1
        else -> 0
    }

internal fun Number.widenAndCompareTo(other: Number): Int =
    (toDouble() - other.toDouble()).normalized()

private fun Number.normalized(): Int =
    when {
        toDouble() > 0 -> 1
        toDouble() < 0 -> -1
        else -> 0
    }

private fun List<Pair<Any?, Any?>>.firstInequalityOrEqual(): Int {
    forEach { (first, second) ->
        val result = first.internalCompareTo(second)
        if (result != 0) return result.normalized()
    }
    return 0
}

private fun Any?.isNull(): Boolean =
    this == null

private fun Any?.isNotNull(): Boolean =
    !this.isNull()
