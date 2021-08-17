package com.rooksoto.tuples

import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldBeInstanceOf
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class TripletTest : BaseTest() {

    private lateinit var testSubject: Triplet<*, *, *>

    @BeforeEach
    fun setUp() {
        testSubject = Triplet(
            testUtil.getRandomElement(),
            testUtil.getRandomElement(),
            testUtil.getRandomElement(),
        )
    }

    @Test
    fun `Given a Triplet, When size, Then expected size returned`() {
        // GIVEN
        val expected = 3

        // WHEN
        val actual = testSubject.size

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Triplet, When count(), Then expected count returned`() {
        // GIVEN
        val expected = 3

        // WHEN
        val actual = testSubject.count()

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Triplet, When toList(), Then result is List of expected values`() {
        // GIVEN
        val expected = listOf(
            testSubject.first,
            testSubject.second,
            testSubject.third
        )

        // WHEN
        val actual = testSubject.toList()

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Triplet, When toString(), Then result is expected String`() {
        // GIVEN
        val expected = with(testSubject) {
            "Triplet[" +
                "(${first?.simpleName()}) -> $first : " +
                "(${second?.simpleName()}) -> $second : " +
                "(${third?.simpleName()}) -> $third" +
                "]"
        }

        // WHEN
        val actual = testSubject.toString()

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Triplet, When add(element), Then result is Quartet of expected elements`() {
        // GIVEN
        val addedElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.add(addedElement)

        // THEN
        result shouldBeInstanceOf Quartet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo addedElement
    }

    @Test
    fun `Given a Triplet, When dropLast, Then result is Pair of expected elements`() {
        // WHEN
        val result = testSubject.dropLast()

        // THEN
        result shouldBeInstanceOf Pair::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
    }
}
