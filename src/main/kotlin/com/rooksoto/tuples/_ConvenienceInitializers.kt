package com.rooksoto.tuples

fun tupleOf(
    vararg args: Any?
): Tuple = args.toList().toTuple()

fun <A> unitOf(
    first: A
) = Unit(first)

fun <A, B> pairOf(
    first: A,
    second: B
) = Pair(first, second)

fun <K, V> keyValueOf(
    key: K,
    value: V
) = KeyValue(key, value)

fun <L, V> labelValueOf(
    label: L,
    value: V
) = LabelValue(label, value)

fun <A, B, C> tripletOf(
    first: A,
    second: B,
    third: C
) = Triplet(first, second, third)

fun <A, B, C, D> quartetOf(
    first: A,
    second: B,
    third: C,
    fourth: D,
) = Quartet(first, second, third, fourth)

fun <A, B, C, D, E> quintetOf(
    first: A,
    second: B,
    third: C,
    fourth: D,
    fifth: E
) = Quintet(first, second, third, fourth, fifth)

fun <A, B, C, D, E, F> sextetOf(
    first: A,
    second: B,
    third: C,
    fourth: D,
    fifth: E,
    sixth: F
) = Sextet(first, second, third, fourth, fifth, sixth)

fun <A, B, C, D, E, F, G> septetOf(
    first: A,
    second: B,
    third: C,
    fourth: D,
    fifth: E,
    sixth: F,
    seventh: G
) = Septet(first, second, third, fourth, fifth, sixth, seventh)

fun <A, B, C, D, E, F, G, H> octetOf(
    first: A,
    second: B,
    third: C,
    fourth: D,
    fifth: E,
    sixth: F,
    seventh: G,
    eighth: H
) = Octet(first, second, third, fourth, fifth, sixth, seventh, eighth)

fun <A, B, C, D, E, F, G, H, I> enneadOf(
    first: A,
    second: B,
    third: C,
    fourth: D,
    fifth: E,
    sixth: F,
    seventh: G,
    eighth: H,
    ninth: I
) = Ennead(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth)

fun <A, B, C, D, E, F, G, H, I, J> decadeOf(
    first: A,
    second: B,
    third: C,
    fourth: D,
    fifth: E,
    sixth: F,
    seventh: G,
    eighth: H,
    ninth: I,
    tenth: J
) = Decade(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth)
