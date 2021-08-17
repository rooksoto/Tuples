package com.rooksoto.tuples

data class Septet<A, B, C, D, E, F, G>(
    val first: A,
    val second: B,
    val third: C,
    val fourth: D,
    val fifth: E,
    val sixth: F,
    val seventh: G
) : Tuple(),
    ConvertsToSextet,
    CanAddElement,
    CanDropLastElement {

    override val size: Int =
        SEPTET_SIZE

    override fun iterator(): Iterator<*> =
        arrayOf(first, second, third, fourth, fifth, sixth, seventh)
            .iterator()

    override fun toSextet(): Sextet<A, B, C, D, E, F> =
        Sextet(first, second, third, fourth, fifth, sixth)

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

    override fun <T> add(value: T): Octet<A, B, C, D, E, F, G, T> =
        Octet(first, second, third, fourth, fifth, sixth, seventh, value)

    override fun dropLast(): Sextet<A, B, C, D, E, F> =
        toSextet()

    override fun toString(): String =
        super.toString()
}
