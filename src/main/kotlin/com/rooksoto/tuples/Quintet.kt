package com.rooksoto.tuples

data class Quintet<A, B, C, D, E>(
    val first: A,
    val second: B,
    val third: C,
    val fourth: D,
    val fifth: E
) : Tuple(),
    ConvertsToQuartet,
    CanAddElement,
    CanDropLastElement {

    override val size: Int =
        QUINTET_SIZE

    override fun iterator(): Iterator<*> =
        arrayOf(first, second, third, fourth, fifth)
            .iterator()

    override fun toQuartet(): Quartet<A, B, C, D> =
        Quartet(first, second, third, fourth)

    override fun toTriplet(): Triplet<A, B, C> =
        Triplet(first, second, third)

    override fun toPair(): Pair<A, B> =
        Pair(first, second)

    override fun toUnit(): Unit<A> =
        Unit(first)

    override fun <T> add(value: T) =
        Sextet(first, second, third, fourth, fifth, value)

    override fun dropLast(): Quartet<A, B, C, D> =
        toQuartet()

    override fun toString(): String =
        super.toString()
}
