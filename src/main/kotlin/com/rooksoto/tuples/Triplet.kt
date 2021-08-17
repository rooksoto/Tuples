package com.rooksoto.tuples

data class Triplet<A, B, C>(
    val first: A,
    val second: B,
    val third: C
) : Tuple(),
    ConvertsToPair,
    CanAddElement,
    CanDropLastElement {

    override val size: Int =
        TRIPLET_SIZE

    override fun iterator(): Iterator<*> =
        arrayOf(first, second, third)
            .iterator()

    override fun toPair(): Pair<A, B> =
        Pair(first, second)

    override fun toUnit(): Unit<A> =
        Unit(first)

    override fun <T> add(value: T): Quartet<A, B, C, T> =
        Quartet(first, second, third, value)

    override fun dropLast(): Pair<A, B> =
        toPair()

    override fun toString(): String =
        super.toString()
}
