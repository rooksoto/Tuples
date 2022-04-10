package com.rooksoto.tuples.interfaces

import com.rooksoto.tuples.Element
import com.rooksoto.tuples.Ennead
import com.rooksoto.tuples.KeyValue
import com.rooksoto.tuples.LabelValue
import com.rooksoto.tuples.Octet
import com.rooksoto.tuples.Pair
import com.rooksoto.tuples.Quartet
import com.rooksoto.tuples.Quintet
import com.rooksoto.tuples.Septet
import com.rooksoto.tuples.Sextet
import com.rooksoto.tuples.Triplet

internal interface ConvertsToMap {

    /**
     * Converts this tuple to a [Map].
     *
     * @return A [Map] containing the elements of this tuple,
     * where the first is the key and the second is the value
     */
    fun toMap(): Map<*, *>
}

internal interface ConvertsToElement {

    /**
     * Converts this tuple to an [Element].
     * NOTE: If the size of the tuple is greater than 1,
     * excess elements will be ignored.
     *
     * @return An [Element] containing the first element of
     * this tuple
     */
    fun toElement(): Element<*>
}

internal interface ConvertsToLabelValue {

    /**
     * Converts this tuple to a [LabelValue].
     *
     * @return A [LabelValue] containing the elements of this tuple,
     * where the first is the label and the second is the value
     */
    fun toLabelValue(): LabelValue<*, *>
}

internal interface ConvertsToKeyValue {

    /**
     * Converts this tuple to a [KeyValue].
     *
     * @return A [KeyValue] containing the elements of this tuple,
     * where the first is the key and the second is the value
     */
    fun toKeyValue(): KeyValue<*, *>
}

internal interface ConvertsToPair : ConvertsToElement {

    /**
     * Converts this tuple to a [Pair].
     * NOTE: If the size of the tuple is greater than 2,
     * excess elements will be ignored.
     *
     * @return A [Pair] containing the first 2 elements of
     * this tuple
     */
    fun toPair(): Pair<*, *>
}

internal interface ConvertsToTriplet : ConvertsToPair {

    /**
     * Converts this tuple to a [Triplet].
     * NOTE: If the size of the tuple is greater than 3,
     * excess elements will be ignored.
     *
     * @return A [Triplet] containing the first 3 elements of
     * this tuple
     */
    fun toTriplet(): Triplet<*, *, *>
}

internal interface ConvertsToQuartet : ConvertsToTriplet {

    /**
     * Converts this tuple to a [Quartet].
     * NOTE: If the size of the tuple is greater than 4,
     * excess elements will be ignored.
     *
     * @return A [Quartet] containing the first 4 elements of
     * this tuple
     */
    fun toQuartet(): Quartet<*, *, *, *>
}

internal interface ConvertsToQuintet : ConvertsToQuartet {

    /**
     * Converts this tuple to a [Quintet].
     * NOTE: If the size of the tuple is greater than 5,
     * excess elements will be ignored.
     *
     * @return A [Quintet] containing the first 5 elements of
     * this tuple
     */
    fun toQuintet(): Quintet<*, *, *, *, *>
}

internal interface ConvertsToSextet : ConvertsToQuintet {

    /**
     * Converts this tuple to a [Sextet].
     * NOTE: If the size of the tuple is greater than 6,
     * excess elements will be ignored.
     *
     * @return A [Sextet] containing the first 6 elements of
     * this tuple
     */
    fun toSextet(): Sextet<*, *, *, *, *, *>
}

internal interface ConvertsToSeptet : ConvertsToSextet {

    /**
     * Converts this tuple to a [Septet].
     * NOTE: If the size of the tuple is greater than 7,
     * excess elements will be ignored.
     *
     * @return A [Septet] containing the first 7 elements of
     * this tuple
     */
    fun toSeptet(): Septet<*, *, *, *, *, *, *>
}

internal interface ConvertsToOctet : ConvertsToSeptet {

    /**
     * Converts this tuple to an [Octet].
     * NOTE: If the size of the tuple is greater than 8,
     * excess elements will be ignored.
     *
     * @return An [Octet] containing the first 8 elements of
     * this tuple
     */
    fun toOctet(): Octet<*, *, *, *, *, *, *, *>
}

internal interface ConvertsToEnnead : ConvertsToOctet {

    /**
     * Converts this tuple to an [Ennead].
     * NOTE: If the size of the tuple is greater than 9,
     * excess elements will be ignored.
     *
     * @return An [Ennead] containing the first 9 elements of
     * this tuple
     */
    fun toEnnead(): Ennead<*, *, *, *, *, *, *, *, *>
}
