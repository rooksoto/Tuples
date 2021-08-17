package com.rooksoto.tuples

import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldBeInstanceOf
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class QuintetTest : BaseTest() {

    private lateinit var testSubject: Quintet<*, *, *, *, *>

    @BeforeEach
    fun setUp() {
        testSubject = Quintet(
            testUtil.getRandomElement(),
            testUtil.getRandomElement(),
            testUtil.getRandomElement(),
            testUtil.getRandomElement(),
            testUtil.getRandomElement()
        )
    }

    @Test
    fun `Given a Quintet, When size, Then expected size returned`() {
        // GIVEN
        val expected = 5

        // WHEN
        val actual = testSubject.size

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Quintet, When count(), Then expected count returned`() {
        // GIVEN
        val expected = 5

        // WHEN
        val actual = testSubject.count()

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Quintet, When toList(), Then result is List of expected values`() {
        // GIVEN
        val expected = listOf(
            testSubject.first,
            testSubject.second,
            testSubject.third,
            testSubject.fourth,
            testSubject.fifth
        )

        // WHEN
        val actual = testSubject.toList()

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Quintet, When toString(), Then result is expected String`() {
        // GIVEN
        val expected = with(testSubject) {
            "Quintet[" +
                "(${first?.simpleName()}) -> $first : " +
                "(${second?.simpleName()}) -> $second : " +
                "(${third?.simpleName()}) -> $third : " +
                "(${fourth?.simpleName()}) -> $fourth : " +
                "(${fifth?.simpleName()}) -> $fifth" +
                "]"
        }

        // WHEN
        val actual = testSubject.toString()

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Quintet, When add(element), Then result is Sextet of expected elements`() {
        // GIVEN
        val addedElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.add(addedElement)

        // THEN
        result shouldBeInstanceOf Sextet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo testSubject.fifth
        result.sixth shouldBeEqualTo addedElement
    }

    @Test
    fun `Given a Quintet, When dropLast, Then result is Quartet of expected elements`() {
        // WHEN
        val result = testSubject.dropLast()

        // THEN
        result shouldBeInstanceOf Quartet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
    }
}
