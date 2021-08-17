package com.rooksoto.tuples

data class Quartet<A, B, C, D>(
    val first: A,
    val second: B,
    val third: C,
    val fourth: D
) : Tuple(),
    ConvertsToTriplet,
    CanAddElement,
    CanDropLastElement {

    override val size: Int =
        QUARTET_SIZE

    override fun iterator(): Iterator<*> =
        arrayOf(first, second, third, fourth)
            .iterator()

    override fun toTriplet(): Triplet<A, B, C> =
        Triplet(first, second, third)

    override fun toPair(): Pair<A, B> =
        Pair(first, second)

    override fun toUnit(): Unit<A> =
        Unit(first)

    override fun <T> add(value: T): Quintet<A, B, C, D, T> =
        Quintet(first, second, third, fourth, value)

    override fun dropLast(): Triplet<A, B, C> =
        toTriplet()

    override fun toString(): String =
        super.toString()
}
