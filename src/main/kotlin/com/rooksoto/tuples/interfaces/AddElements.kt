package com.rooksoto.tuples.interfaces

import com.rooksoto.tuples.KeyValue
import com.rooksoto.tuples.LabelValue
import com.rooksoto.tuples.Tuple

internal interface CanAddKey {

    /**
     * Creates a new [KeyValue] with [key] in key
     * position and existing value in value position.
     *
     * @param key The key to add
     * @return A new [KeyValue] with [key] as key
     * and existing value as value
     */
    fun <T> addKey(key: T): Tuple
}

internal interface CanAddLabel {

    /**
     * Creates a new [LabelValue] with [label] in label
     * position and existing value in value position.
     *
     * @param label The label to add
     * @return A new [LabelValue] with [label] as label
     * and existing value as value
     */
    fun <T> addLabel(label: T): Tuple
}

internal interface CanAddValue {

    /**
     * Creates a new [KeyValue] with [toValue] in value
     * position and existing value in key position.
     *
     * @param toValue The value to insert
     * @return A new [KeyValue] with [toValue] as value
     * and existing value as key
     */
    fun <T> asKey(toValue: T): Tuple

    /**
     * Creates a new [LabelValue] with [toValue] in value
     * position and existing value in label position.
     *
     * @param toValue The value to insert
     * @return A new [KeyValue] with [toValue] as value
     * and existing value as label
     */
    fun <T> asLabel(toValue: T): Tuple
}

internal interface AddsElements {

    /**
     * Creates a new, larger [Tuple] by inserting a value
     * at the end of this [Tuple].
     *
     * @param value The value to insert
     * @return A new [Tuple] with new [value] inserted
     * after the final existing value
     */
    fun <T> add(value: T): Tuple
}

internal interface InsertsFirst {

    /**
     * Creates a new, larger [Tuple] by inserting a value
     * at the first ordinal position.
     *
     * @param value The value to insert
     * @return A new [Tuple] with new [value] inserted
     * at the first ordinal position
     */
    fun <T> insertFirst(value: T): Tuple
}

internal interface InsertsSecond : InsertsFirst {

    /**
     * Creates a new, larger [Tuple] by inserting a value
     * at the second ordinal position.
     *
     * @param value The value to insert
     * @return A new [Tuple] with new [value] inserted
     * at the second ordinal position
     */
    fun <T> insertSecond(value: T): Tuple
}

internal interface InsertsThird : InsertsSecond {

    /**
     * Creates a new, larger [Tuple] by inserting a value
     * at the third ordinal position.
     *
     * @param value The value to insert
     * @return A new [Tuple] with new [value] inserted
     * at the third ordinal position
     */
    fun <T> insertThird(value: T): Tuple
}

internal interface InsertsFourth : InsertsThird {

    /**
     * Creates a new, larger [Tuple] by inserting a value
     * at the fourth ordinal position.
     *
     * @param value The value to insert
     * @return A new [Tuple] with new [value] inserted
     * at the fourth ordinal position
     */
    fun <T> insertFourth(value: T): Tuple
}

internal interface InsertsFifth : InsertsFourth {

    /**
     * Creates a new, larger [Tuple] by inserting a value
     * at the fifth ordinal position.
     *
     * @param value The value to insert
     * @return A new [Tuple] with new [value] inserted
     * at the fifth ordinal position
     */
    fun <T> insertFifth(value: T): Tuple
}

internal interface InsertsSixth : InsertsFifth {

    /**
     * Creates a new, larger [Tuple] by inserting a value
     * at the sixth ordinal position.
     *
     * @param value The value to insert
     * @return A new [Tuple] with new [value] inserted
     * at the sixth ordinal position
     */
    fun <T> insertSixth(value: T): Tuple
}

internal interface InsertsSeventh : InsertsSixth {

    /**
     * Creates a new, larger [Tuple] by inserting a value
     * at the seventh ordinal position.
     *
     * @param value The value to insert
     * @return A new [Tuple] with new [value] inserted
     * at the seventh ordinal position
     */
    fun <T> insertSeventh(value: T): Tuple
}

internal interface InsertsEighth : InsertsSeventh {

    /**
     * Creates a new, larger [Tuple] by inserting a value
     * at the eighth ordinal position.
     *
     * @param value The value to insert
     * @return A new [Tuple] with new [value] inserted
     * at the eighth ordinal position
     */
    fun <T> insertEighth(value: T): Tuple
}

internal interface InsertsNinth : InsertsEighth {

    /**
     * Creates a new, larger [Tuple] by inserting a value
     * at the ninth ordinal position.
     *
     * @param value The value to insert
     * @return A new [Tuple] with new [value] inserted
     * at the ninth ordinal position
     */
    fun <T> insertNinth(value: T): Tuple
}

internal interface InsertsTenth : InsertsNinth {

    /**
     * Creates a new, larger [Tuple] by inserting a value
     * at the tenth ordinal position.
     *
     * @param value The value to insert
     * @return A new [Tuple] with new [value] inserted
     * at the tenth ordinal position
     */
    fun <T> insertTenth(value: T): Tuple
}
