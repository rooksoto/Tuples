package com.rooksoto.tuples

data class Pair<A, B>(
    val first: A,
    val second: B
) : Tuple(),
    ConvertsToUnit,
    ConvertsToKeyValue,
    ConvertsToLabelValue,
    ConvertsToMap,
    CanAddElement,
    CanDropLastElement {

    override val size: Int =
        PAIR_SIZE

    override fun iterator(): Iterator<*> =
        arrayOf(first, second)
            .iterator()

    override fun toUnit(): Unit<A> =
        Unit(first)

    override fun toKeyValue(): KeyValue<A, B> =
        KeyValue(first, second)

    override fun toLabelValue(): LabelValue<A, B> =
        LabelValue(first, second)

    override fun toMap(): Map<A, B> =
        mapOf(first to second)

    override fun <T> add(value: T): Triplet<A, B, T> =
        Triplet(first, second, value)

    override fun dropLast(): Unit<A> =
        toUnit()

    override fun toString(): String =
        super.toString()
}
