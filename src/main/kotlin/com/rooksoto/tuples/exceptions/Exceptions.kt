package com.rooksoto.tuples.exceptions

internal object TupleSourceListEmptyException :
    RuntimeException("Cannot initialize Tuple from an empty list.")

internal object TupleSourceListTooSmallException :
    RuntimeException("Source list contains too few elements.")

internal class TupleIndexOutOfBoundsException(tupleName: String, index: Int, size: Int) :
    IndexOutOfBoundsException("$tupleName: Index $index is out of bounds for size $size.")
