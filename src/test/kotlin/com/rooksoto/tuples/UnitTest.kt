package com.rooksoto.tuples

import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldBeInstanceOf
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class UnitTest : BaseTest() {

    private lateinit var testSubject: Unit<*>

    @BeforeEach
    fun setUp() {
        testSubject = Unit(
            testUtil.getRandomElement()
        )
    }

    @Test
    fun `Given a Unit, When size, Then expected size returned`() {
        // GIVEN
        val expected = 1

        // WHEN
        val actual = testSubject.size

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Unit, When count(), Then expected count returned`() {
        // GIVEN
        val expected = 1

        // WHEN
        val actual = testSubject.count()

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Unit, When toList(), Then result is List of expected values`() {
        // GIVEN
        val expected = listOf(
            testSubject.first
        )

        // WHEN
        val actual = testSubject.toList()

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Unit, When toString(), Then result is expected String`() {
        // GIVEN
        val expected = with(testSubject) {
            "Unit[(${first?.simpleName()}) -> $first]"
        }

        // WHEN
        val actual = testSubject.toString()

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Unit, When add(element), Then result is Pair of expected elements`() {
        // GIVEN
        val addedElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.add(addedElement)

        // THEN
        result shouldBeInstanceOf Pair::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo addedElement
    }
}
