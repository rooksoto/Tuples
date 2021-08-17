package com.rooksoto.tuples

data class LabelValue<L, V>(
    val label: L,
    val value: V
) : Tuple(),
    ConvertsToUnit,
    ConvertsToPair,
    ConvertsToKeyValue,
    ConvertsToMap {

    override val size: Int =
        UNIT_SIZE

    override fun iterator(): Iterator<V> =
        listOf(value)
            .iterator()

    override fun toUnit(): Unit<V> =
        Unit(value)

    override fun toPair(): Pair<L, V> =
        Pair(label, value)

    override fun toKeyValue(): KeyValue<L, V> =
        KeyValue(label, value)

    override fun toMap(): Map<L, V> =
        mapOf(label to value)

    override fun toString(): String =
        super.toString()
}
