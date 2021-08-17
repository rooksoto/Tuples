package com.rooksoto.tuples

import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldBeInstanceOf
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class DecadeTest : BaseTest() {

    private lateinit var testSubject: Decade<*, *, *, *, *, *, *, *, *, *>

    @BeforeEach
    fun setUp() {
        testSubject = Decade(
            testUtil.getRandomElement(),
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
    fun `Given a Decade, When size, Then expected size returned`() {
        // GIVEN
        val expected = 10

        // WHEN
        val actual = testSubject.size

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Decade, When count(), Then expected count returned`() {
        // GIVEN
        val expected = 10

        // WHEN
        val actual = testSubject.count()

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Decade, When toList(), Then result is List of expected values`() {
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
            testSubject.ninth,
            testSubject.tenth
        )

        // WHEN
        val actual = testSubject.toList()

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Decade, When toString(), Then result is expected String`() {
        // GIVEN
        val expected = with(testSubject) {
            "Decade[" +
                "(${first?.simpleName()}) -> $first : " +
                "(${second?.simpleName()}) -> $second : " +
                "(${third?.simpleName()}) -> $third : " +
                "(${fourth?.simpleName()}) -> $fourth : " +
                "(${fifth?.simpleName()}) -> $fifth : " +
                "(${sixth?.simpleName()}) -> $sixth : " +
                "(${seventh?.simpleName()}) -> $seventh : " +
                "(${eighth?.simpleName()}) -> $eighth : " +
                "(${ninth?.simpleName()}) -> $ninth : " +
                "(${tenth?.simpleName()}) -> $tenth" +
                "]"
        }

        // WHEN
        val actual = testSubject.toString()

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Decade, When dropLast, Then result is Ennead of expected elements`() {
        // WHEN
        val result = testSubject.dropLast()

        // THEN
        result shouldBeInstanceOf Ennead::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo testSubject.fifth
        result.sixth shouldBeEqualTo testSubject.sixth
        result.seventh shouldBeEqualTo testSubject.seventh
        result.eighth shouldBeEqualTo testSubject.eighth
        result.ninth shouldBeEqualTo testSubject.ninth
    }
}
