package com.rooksoto.tuples.util

import com.rooksoto.tuples.Decade
import com.rooksoto.tuples.Ennead
import com.rooksoto.tuples.KeyValue
import com.rooksoto.tuples.LabelValue
import com.rooksoto.tuples.Octet
import com.rooksoto.tuples.Quartet
import com.rooksoto.tuples.Quintet
import com.rooksoto.tuples.Septet
import com.rooksoto.tuples.Sextet
import com.rooksoto.tuples.Triplet
import com.rooksoto.tuples.Unit

internal const val keyArgument = "keyArgument"
internal const val labelArgument = "labelArgument"
internal const val valueArgument = "valueArgument"
internal const val firstArgument = "firstArgument"
internal const val secondArgument = "secondArgument"
internal const val thirdArgument = "thirdArgument"
internal const val fourthArgument = "fourthArgument"
internal const val fifthArgument = "fifthArgument"
internal const val sixthArgument = "sixthArgument"
internal const val seventhArgument = "seventhArgument"
internal const val eighthArgument = "eighthArgument"
internal const val ninthArgument = "ninthArgument"
internal const val tenthArgument = "tenthArgument"

internal val testUnit = Unit(
    firstArgument
)
internal val testPair = Pair(
    firstArgument,
    secondArgument
)
internal val testKeyValue = KeyValue(
    keyArgument,
    valueArgument
)
internal val testLabelValue = LabelValue(
    labelArgument,
    valueArgument
)
internal val testTriplet = Triplet(
    firstArgument,
    secondArgument,
    thirdArgument
)
internal val testQuartet = Quartet(
    firstArgument,
    secondArgument,
    thirdArgument,
    fourthArgument
)
internal val testQuintet = Quintet(
    firstArgument,
    secondArgument,
    thirdArgument,
    fourthArgument,
    fifthArgument
)
internal val testSextet = Sextet(
    firstArgument,
    secondArgument,
    thirdArgument,
    fourthArgument,
    fifthArgument,
    sixthArgument
)
internal val testSeptet = Septet(
    firstArgument,
    secondArgument,
    thirdArgument,
    fourthArgument,
    fifthArgument,
    sixthArgument,
    seventhArgument
)
internal val testOctet = Octet(
    firstArgument,
    secondArgument,
    thirdArgument,
    fourthArgument,
    fifthArgument,
    sixthArgument,
    seventhArgument,
    eighthArgument
)
internal val testEnnead = Ennead(
    firstArgument,
    secondArgument,
    thirdArgument,
    fourthArgument,
    fifthArgument,
    sixthArgument,
    seventhArgument,
    eighthArgument,
    ninthArgument
)
internal val testDecade = Decade(
    firstArgument,
    secondArgument,
    thirdArgument,
    fourthArgument,
    fifthArgument,
    sixthArgument,
    seventhArgument,
    eighthArgument,
    ninthArgument,
    tenthArgument
)
