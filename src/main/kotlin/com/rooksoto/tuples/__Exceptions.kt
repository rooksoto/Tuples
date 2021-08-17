package com.rooksoto.tuples

internal object TupleSourceListEmptyException :
    RuntimeException("Cannot initialize Tuple from an empty list.")

internal object TupleSourceListTooSmallException :
    RuntimeException("Source list contains too few elements.")
