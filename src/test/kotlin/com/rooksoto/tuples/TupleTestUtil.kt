package com.rooksoto.tuples

import com.rooksoto.tuples.utils.simpleName
import java.util.UUID

/**
 * This class and all its members are for internal testing
 * only, and should not be used outside of the Tuples project.
 */
internal class TupleTestUtil {

    /**
     * Creates a random element of either [Int], [String], [UUID],
     * [RandomObject], [RandomClass], [RandomDataClass], or null.
     */
    internal fun getRandomElement(): Any? =
        when (listOf(1, 2, 3, 4, 5).random()) {
            1 -> getRandomInt()
            2 -> getRandomString()
            3 -> UUID.randomUUID()
            4 -> getRandomObject()
            else -> null
        }

    /**
     * Randomly returns 1 of the following 5 Ints:
     * 13, 21, 34, 55, or 89.
     */
    private fun getRandomInt(): Int =
        listOf(13, 21, 34, 55, 89)
            .random()

    /**
     * Randomly returns 1 of the following 5 Strings:
     * "StringOne", "StringTwo", "StringThree", "StringFour",
     * or "StringFive".
     */
    private fun getRandomString(): String =
        listOf("StringOne", "StringTwo", "StringThree", "StringFour", "StringFive")
            .random()

    /**
     * Randomly returns 1 object of type [RandomObject],
     * [RandomClass], or [RandomDataClass] with appropriate random
     * data.
     */
    private fun getRandomObject(): Any =
        listOf(
            RandomObject,
            RandomClass(getRandomString()),
            RandomDataClass(getRandomInt(), getRandomString())
        ).random()
}

internal sealed class RandomResult {
    override fun toString() = simpleName()
}

internal object RandomObject : RandomResult()

internal class RandomClass(
    val value: String?
) : RandomResult()

internal data class RandomDataClass(
    val intValue: Int?,
    val stringValue: String?
) : RandomResult()
