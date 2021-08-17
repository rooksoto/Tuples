package com.rooksoto.tuples

data class KeyValue<K, V>(
    val key: K,
    val value: V
) : Tuple(),
    ConvertsToUnit,
    ConvertsToPair,
    ConvertsToLabelValue,
    ConvertsToMap {

    override val size: Int =
        UNIT_SIZE

    override fun iterator(): Iterator<V> =
        listOf(value)
            .iterator()

    override fun toUnit(): Unit<V> =
        Unit(value)

    override fun toPair(): Pair<K, V> =
        Pair(key, value)

    override fun toLabelValue(): LabelValue<K, V> =
        LabelValue(key, value)

    override fun toMap(): Map<K, V> =
        mapOf(key to value)

    override fun toString(): String =
        super.toString()
}
