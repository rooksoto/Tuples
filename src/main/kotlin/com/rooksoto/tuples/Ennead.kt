package com.rooksoto.tuples

data class Ennead<A, B, C, D, E, F, G, H, I>(
    val first: A,
    val second: B,
    val third: C,
    val fourth: D,
    val fifth: E,
    val sixth: F,
    val seventh: G,
    val eighth: H,
    val ninth: I
) : Tuple(),
    ConvertsToOctet,
    CanAddElement,
    CanDropLastElement {

    override val size: Int =
        ENNEAD_SIZE

    override fun iterator(): Iterator<*> =
        arrayOf(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth)
            .iterator()

    override fun toOctet(): Octet<A, B, C, D, E, F, G, H> =
        Octet(first, second, third, fourth, fifth, sixth, seventh, eighth)

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

    override fun <T> add(value: T): Decade<A, B, C, D, E, F, G, H, I, T> =
        Decade(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, value)

    override fun dropLast(): Octet<A, B, C, D, E, F, G, H> =
        toOctet()

    override fun toString(): String =
        super.toString()
}
