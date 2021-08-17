package com.rooksoto.tuples

import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldBeInstanceOf
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class SeptetTest : BaseTest() {

    private lateinit var testSubject: Septet<*, *, *, *, *, *, *>

    @BeforeEach
    fun setUp() {
        testSubject = Septet(
            testUtil.getRandomElement(),
            testUtil.getRandomElement(),
            testUtil.getRandomElement(),
            testUtil.getRandomElement(),
            testUtil.getRandomElement(),
            testUtil.getRandomElement(),
            testUtil.getRandomElement()
        )
    }

    @Test
    fun `Given a Septet, When size, Then expected size returned`() {
        // GIVEN
        val expected = 7

        // WHEN
        val actual = testSubject.size

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Septet, When count(), Then expected count returned`() {
        // GIVEN
        val expected = 7

        // WHEN
        val actual = testSubject.count()

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Septet, When toList(), Then result is List of expected values`() {
        // GIVEN
        val expected = listOf(
            testSubject.first,
            testSubject.second,
            testSubject.third,
            testSubject.fourth,
            testSubject.fifth,
            testSubject.sixth,
            testSubject.seventh
        )

        // WHEN
        val actual = testSubject.toList()

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Septet, When toString(), Then result is expected String`() {
        // GIVEN
        val expected = with(testSubject) {
            "Septet[" +
                "(${first?.simpleName()}) -> $first : " +
                "(${second?.simpleName()}) -> $second : " +
                "(${third?.simpleName()}) -> $third : " +
                "(${fourth?.simpleName()}) -> $fourth : " +
                "(${fifth?.simpleName()}) -> $fifth : " +
                "(${sixth?.simpleName()}) -> $sixth : " +
                "(${seventh?.simpleName()}) -> $seventh" +
                "]"
        }

        // WHEN
        val actual = testSubject.toString()

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Septet, When add(element), Then result is Octet of expected elements`() {
        // GIVEN
        val addedElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.add(addedElement)

        // THEN
        result shouldBeInstanceOf Octet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo testSubject.fifth
        result.sixth shouldBeEqualTo testSubject.sixth
        result.seventh shouldBeEqualTo testSubject.seventh
        result.eighth shouldBeEqualTo addedElement
    }

    @Test
    fun `Given a Septet, When dropLast, Then result is Sextet of expected elements`() {
        // WHEN
        val result = testSubject.dropLast()

        // THEN
        result shouldBeInstanceOf Sextet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo testSubject.fifth
        result.sixth shouldBeEqualTo testSubject.sixth
    }
}
