package com.rooksoto.tuples

internal interface CanAddElement {
    fun <T> add(value: T): Tuple
}

internal interface CanDropLastElement {
    fun dropLast(): Tuple
}

internal interface ConvertsToMap {
    fun toMap(): Map<*, *>
}

internal interface ConvertsToUnit {
    fun toUnit(): Unit<*>
}

internal interface ConvertsToLabelValue {
    fun toLabelValue(): LabelValue<*, *>
}

internal interface ConvertsToKeyValue {
    fun toKeyValue(): KeyValue<*, *>
}

internal interface ConvertsToPair : ConvertsToUnit {
    fun toPair(): Pair<*, *>
}

internal interface ConvertsToTriplet : ConvertsToPair {
    fun toTriplet(): Triplet<*, *, *>
}

internal interface ConvertsToQuartet : ConvertsToTriplet {
    fun toQuartet(): Quartet<*, *, *, *>
}

internal interface ConvertsToQuintet : ConvertsToQuartet {
    fun toQuintet(): Quintet<*, *, *, *, *>
}

internal interface ConvertsToSextet : ConvertsToQuintet {
    fun toSextet(): Sextet<*, *, *, *, *, *>
}

internal interface ConvertsToSeptet : ConvertsToSextet {
    fun toSeptet(): Septet<*, *, *, *, *, *, *>
}

internal interface ConvertsToOctet : ConvertsToSeptet {
    fun toOctet(): Octet<*, *, *, *, *, *, *, *>
}

internal interface ConvertsToEnnead : ConvertsToOctet {
    fun toEnnead(): Ennead<*, *, *, *, *, *, *, *, *>
}
