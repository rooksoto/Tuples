package com.rooksoto.tuples.interfaces

import com.rooksoto.tuples.Tuple

internal interface DropsKey {

    /**
     * Drops the key from a KeyValue.
     *
     * @return an element containing only the value
     */
    fun dropKey(): Tuple
}

internal interface DropsLabel {

    /**
     * Drops the label from a LabelValue.
     *
     * @return an element containing only the value
     */
    fun dropLabel(): Tuple
}

internal interface DropsValue {

    /**
     * Drops the value from a KeyValue or LabelValue.
     *
     * @return an element containing only the key or label
     */
    fun dropValue(): Tuple
}

internal interface DropsLast {

    /**
     * Creates a new, smaller [Tuple] by dropping the last
     * element.
     *
     * @return a new [Tuple] with the last element removed
     */
    fun dropLast(): Tuple
}

internal interface DropsFirst {

    /**
     * Creates a new, smaller [Tuple] by dropping the first
     * element. Any Elements to the right of the dropped
     * element will be shifted left.
     *
     * @return a new [Tuple] with the first element removed
     */
    fun dropFirst(): Tuple
}

internal interface DropsSecond : DropsFirst {

    /**
     * Creates a new, smaller [Tuple] by dropping the second
     * element. Any Elements to the right of the dropped
     * element will be shifted left.
     *
     * @return a new [Tuple] with the second element removed
     */
    fun dropSecond(): Tuple
}

internal interface DropsThird : DropsSecond {

    /**
     * Creates a new, smaller [Tuple] by dropping the third
     * element. Any Elements to the right of the dropped
     * element will be shifted left.
     *
     * @return a new [Tuple] with the third element removed
     */
    fun dropThird(): Tuple
}

internal interface DropsFourth : DropsThird {

    /**
     * Creates a new, smaller [Tuple] by dropping the fourth
     * element. Any Elements to the right of the dropped
     * element will be shifted left.
     *
     * @return a new [Tuple] with the fourth element removed
     */
    fun dropFourth(): Tuple
}

internal interface DropsFifth : DropsFourth {

    /**
     * Creates a new, smaller [Tuple] by dropping the fifth
     * element. Any Elements to the right of the dropped
     * element will be shifted left.
     *
     * @return a new [Tuple] with the fifth element removed
     */
    fun dropFifth(): Tuple
}

internal interface DropsSixth : DropsFifth {

    /**
     * Creates a new, smaller [Tuple] by dropping the sixth
     * element. Any Elements to the right of the dropped
     * element will be shifted left.
     *
     * @return a new [Tuple] with the sixth element removed
     */
    fun dropSixth(): Tuple
}

internal interface DropsSeventh : DropsSixth {

    /**
     * Creates a new, smaller [Tuple] by dropping the seventh
     * element. Any Elements to the right of the dropped
     * element will be shifted left.
     *
     * @return a new [Tuple] with the seventh element removed
     */
    fun dropSeventh(): Tuple
}

internal interface DropsEighth : DropsSeventh {

    /**
     * Creates a new, smaller [Tuple] by dropping the eighth
     * element. Any Elements to the right of the dropped
     * element will be shifted left.
     *
     * @return a new [Tuple] with the eighth element removed
     */
    fun dropEighth(): Tuple
}

internal interface DropsNinth : DropsEighth {

    /**
     * Creates a new, smaller [Tuple] by dropping the ninth
     * element. Any Elements to the right of the dropped
     * element will be shifted left.
     *
     * @return a new [Tuple] with the ninth element removed
     */
    fun dropNinth(): Tuple
}

internal interface DropsTenth : DropsNinth {

    /**
     * Creates a new, smaller [Tuple] by dropping the tenth
     * element. Any Elements to the right of the dropped
     * element will be shifted left.
     *
     * @return a new [Tuple] with the tenth element removed
     */
    fun dropTenth(): Tuple
}
