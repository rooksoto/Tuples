package com.rooksoto.tuples.interfaces

import com.rooksoto.tuples.Tuple

internal interface ReplacesKey {

    /**
     * Replaces the element at the key position with the given [key].
     *
     * @param key The new key
     * @return A new KeyValue where the element at the key position has
     * been replaced with [key]
     */
    fun <T> replaceKey(key: T): Tuple
}

internal interface ReplacesLabel {

    /**
     * Replaces the element at the label position with the given [label].
     *
     * @param label The new label
     * @return A new LabelValue where the element at the label position has
     * been replaced with [label]
     */
    fun <T> replaceLabel(label: T): Tuple
}

internal interface ReplacesValue {

    /**
     * Replaces the element at the value position with the given [value].
     *
     * @param value The new value
     * @return A new KeyValue or LabelValue where the element at the value
     * position has been replaced with [value]
     */
    fun <T> replaceValue(value: T): Tuple
}

internal interface ReplacesLast {

    /**
     * Replaces the last element of the tuple with the given [value].
     *
     * @param value The value to replace the last element with
     * @return A new tuple of the same capacity where the last
     * element has been replaced with [value]
     */
    fun <T> replaceLast(value: T): Tuple
}

internal interface ReplacesFirst {

    /**
     * Replaces the first element of the tuple with the given [value].
     *
     * @param value The value to replace the first element with
     * @return A new tuple of the same capacity where the first
     * element has been replaced with [value]
     */
    fun <T> replaceFirst(value: T): Tuple
}

internal interface ReplacesSecond : ReplacesFirst {

    /**
     * Replaces the second element of the tuple with the given [value].
     *
     * @param value The value to replace the second element with
     * @return A new tuple of the same capacity where the second
     * element has been replaced with [value]
     */
    fun <T> replaceSecond(value: T): Tuple
}

internal interface ReplacesThird : ReplacesSecond {

    /**
     * Replaces the third element of the tuple with the given [value].
     *
     * @param value The value to replace the third element with
     * @return A new tuple of the same capacity where the third
     * element has been replaced with [value]
     */
    fun <T> replaceThird(value: T): Tuple
}

internal interface ReplacesFourth : ReplacesThird {

    /**
     * Replaces the fourth element of the tuple with the given [value].
     *
     * @param value The value to replace the fourth element with
     * @return A new tuple of the same capacity where the fourth
     * element has been replaced with [value]
     */
    fun <T> replaceFourth(value: T): Tuple
}

internal interface ReplacesFifth : ReplacesFourth {

    /**
     * Replaces the fifth element of the tuple with the given [value].
     *
     * @param value The value to replace the fifth element with
     * @return A new tuple of the same capacity where the fifth
     * element has been replaced with [value]
     */
    fun <T> replaceFifth(value: T): Tuple
}

internal interface ReplacesSixth : ReplacesFifth {

    /**
     * Replaces the sixth element of the tuple with the given [value].
     *
     * @param value The value to replace the sixth element with
     * @return A new tuple of the same capacity where the sixth
     * element has been replaced with [value]
     */
    fun <T> replaceSixth(value: T): Tuple
}

internal interface ReplacesSeventh : ReplacesSixth {

    /**
     * Replaces the seventh element of the tuple with the given [value].
     *
     * @param value The value to replace the seventh element with
     * @return A new tuple of the same capacity where the seventh
     * element has been replaced with [value]
     */
    fun <T> replaceSeventh(value: T): Tuple
}

internal interface ReplacesEighth : ReplacesSeventh {

    /**
     * Replaces the eighth element of the tuple with the given [value].
     *
     * @param value The value to replace the eighth element with
     * @return A new tuple of the same capacity where the eighth
     * element has been replaced with [value]
     */
    fun <T> replaceEighth(value: T): Tuple
}

internal interface ReplacesNinth : ReplacesEighth {

    /**
     * Replaces the ninth element of the tuple with the given [value].
     *
     * @param value The value to replace the ninth element with
     * @return A new tuple of the same capacity where the ninth
     * element has been replaced with [value]
     */
    fun <T> replaceNinth(value: T): Tuple
}

internal interface ReplacesTenth : ReplacesNinth {

    /**
     * Replaces the tenth element of the tuple with the given [value].
     *
     * @param value The value to replace the tenth element with
     * @return A new tuple of the same capacity where the tenth
     * element has been replaced with [value]
     */
    fun <T> replaceTenth(value: T): Tuple
}
