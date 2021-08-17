package com.rooksoto.tuples

import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldBeInstanceOf
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class EnneadTest : BaseTest() {

    private lateinit var testSubject: Ennead<*, *, *, *, *, *, *, *, *>

    @BeforeEach
    fun setUp() {
        testSubject = Ennead(
            testUtil.getRandomElement(),
            testUtil.getRandomElement(),
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
    fun `Given a Ennead, When size, Then expected size returned`() {
        // GIVEN
        val expected = 9

        // WHEN
        val actual = testSubject.size

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Ennead, When count(), Then expected count returned`() {
        // GIVEN
        val expected = 9

        // WHEN
        val actual = testSubject.count()

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Ennead, When toList(), Then result is List of expected values`() {
        // GIVEN
        val expected = listOf(
            testSubject.first,
            testSubject.second,
            testSubject.third,
            testSubject.fourth,
            testSubject.fifth,
            testSubject.sixth,
            testSubject.seventh,
            testSubject.eighth,
            testSubject.ninth
        )

        // WHEN
        val actual = testSubject.toList()

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Ennead, When toString(), Then result is expected String`() {
        // GIVEN
        val expected = with(testSubject) {
            "Ennead[" +
                "(${first?.simpleName()}) -> $first : " +
                "(${second?.simpleName()}) -> $second : " +
                "(${third?.simpleName()}) -> $third : " +
                "(${fourth?.simpleName()}) -> $fourth : " +
                "(${fifth?.simpleName()}) -> $fifth : " +
                "(${sixth?.simpleName()}) -> $sixth : " +
                "(${seventh?.simpleName()}) -> $seventh : " +
                "(${eighth?.simpleName()}) -> $eighth : " +
                "(${ninth?.simpleName()}) -> $ninth" +
                "]"
        }

        // WHEN
        val actual = testSubject.toString()

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Ennead, When add(element), Then result is Decade of expected elements`() {
        // GIVEN
        val addedElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.add(addedElement)

        // THEN
        result shouldBeInstanceOf Decade::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo testSubject.fifth
        result.sixth shouldBeEqualTo testSubject.sixth
        result.seventh shouldBeEqualTo testSubject.seventh
        result.eighth shouldBeEqualTo testSubject.eighth
        result.ninth shouldBeEqualTo testSubject.ninth
        result.tenth shouldBeEqualTo addedElement
    }

    @Test
    fun `Given a Ennead, When dropLast, Then result is Octet of expected elements`() {
        // WHEN
        val result = testSubject.dropLast()

        // THEN
        result shouldBeInstanceOf Octet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo testSubject.fifth
        result.sixth shouldBeEqualTo testSubject.sixth
        result.seventh shouldBeEqualTo testSubject.seventh
        result.eighth shouldBeEqualTo testSubject.eighth
    }
}
