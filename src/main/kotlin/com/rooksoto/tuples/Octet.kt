package com.rooksoto.tuples

data class Octet<A, B, C, D, E, F, G, H>(
    val first: A,
    val second: B,
    val third: C,
    val fourth: D,
    val fifth: E,
    val sixth: F,
    val seventh: G,
    val eighth: H
) : Tuple(),
    ConvertsToSeptet,
    CanAddElement,
    CanDropLastElement {

    override val size: Int =
        OCTET_SIZE

    override fun iterator(): Iterator<*> =
        arrayOf(first, second, third, fourth, fifth, sixth, seventh, eighth)
            .iterator()

    override fun toSeptet(): Septet<A, B, C, D, E, F, G> =
        Septet(first, second, third, fourth, fifth, sixth, seventh)

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

    override fun <T> add(value: T): Ennead<A, B, C, D, E, F, G, H, T> =
        Ennead(first, second, third, fourth, fifth, sixth, seventh, eighth, value)

    override fun dropLast(): Septet<A, B, C, D, E, F, G> =
        toSeptet()

    override fun toString(): String =
        super.toString()
}
