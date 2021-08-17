package com.rooksoto.tuples

data class Unit<A>(
    val first: A
) : Tuple(),
    CanAddElement {

    override val size: Int =
        UNIT_SIZE

    override fun iterator(): Iterator<A> =
        listOf(first)
            .iterator()

    override fun <T> add(value: T): Pair<A, T> =
        Pair(first, value)

    override fun toString(): String =
        super.toString()
}
