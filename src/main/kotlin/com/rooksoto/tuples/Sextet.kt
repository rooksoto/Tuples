package com.rooksoto.tuples

data class Sextet<A, B, C, D, E, F>(
    val first: A,
    val second: B,
    val third: C,
    val fourth: D,
    val fifth: E,
    val sixth: F,
) : Tuple(),
    ConvertsToQuintet,
    CanAddElement,
    CanDropLastElement {

    override val size: Int =
        SEXTET_SIZE

    override fun iterator(): Iterator<*> =
        arrayOf(first, second, third, fourth, fifth, sixth)
            .iterator()

    override fun toQuintet(): Quintet<A, B, C, D, E> =
        Quintet(first, second, third, fourth, fifth)

    override fun toQuartet(): Quartet<A, B, C, D> =
        Quartet(first, second, third, fourth)

    override fun toTriplet(): Triplet<A, B, C> =
        Triplet(first, second, third)

    override fun toPair(): Pair<A, B> =
        Pair(first, second)

    override fun toUnit(): Unit<A> =
        Unit(first)

    override fun <T> add(value: T) =
        Septet(first, second, third, fourth, fifth, sixth, value)

    override fun dropLast(): Quintet<A, B, C, D, E> =
        toQuintet()

    override fun toString(): String =
        super.toString()
}
