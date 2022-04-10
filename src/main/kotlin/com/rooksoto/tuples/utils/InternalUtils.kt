package com.rooksoto.tuples.utils

import com.rooksoto.tuples.Tuple

internal fun Any.simpleName(): String =
    this::class.java.simpleName

internal fun Tuple.compareByCapacity(other: Tuple): Int =
    (this.size - other.size).normalized()

internal fun Number.widenAndCompareTo(other: Number): Int =
    (toDouble() - other.toDouble()).normalized()

internal fun Number.normalized(): Int =
    when {
        toDouble() > 0 -> 1
        toDouble() < 0 -> -1
        else -> 0
    }
