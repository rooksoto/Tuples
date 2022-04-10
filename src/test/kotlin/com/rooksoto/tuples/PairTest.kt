package com.rooksoto.tuples

import com.rooksoto.tuples.utils.simpleName
import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldBeInstanceOf
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class PairTest : BaseTest() {

    private lateinit var testSubject: Pair<*, *>

    @BeforeEach
    fun setUp() {
        testSubject = Pair(
            testUtil.getRandomElement(),
            testUtil.getRandomElement()
        )
    }

    @Test
    fun `Given a Pair, When size, Then expected size returned`() {
        // GIVEN
        val expected = 2

        // WHEN
        val actual = testSubject.size

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Pair, When count(), Then expected count returned`() {
        // GIVEN
        val expected = 2

        // WHEN
        val actual = testSubject.count()

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Pair, when contains, then expected result returned`() {
        // GIVEN
        val expected = true

        // WHEN
        val actual = testSubject.contains(testSubject.first)

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Pair, when containsAll, then expected result returned`() {
        // GIVEN
        val expected = true

        // WHEN
        val actual = testSubject.containsAll(listOf(testSubject.first, testSubject.last()))

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Pair, when get(0) via indexing, then first returned`() {
        // GIVEN
        val expected = testSubject.first

        // WHEN
        val actual = testSubject[0]

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Pair, when get(1) via indexing, then second returned`() {
        // GIVEN
        val expected = testSubject.second

        // WHEN
        val actual = testSubject[1]

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Pair, When toList(), Then result is List of expected values`() {
        // GIVEN
        val expected = listOf(
            testSubject.first,
            testSubject.second
        )

        // WHEN
        val actual = testSubject.toList()

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Pair, When toString(), Then result is expected String`() {
        // GIVEN
        val expected = with(testSubject) {
            "Pair: [" +
                "(${first?.simpleName()}) -> $first, " +
                "(${second?.simpleName()}) -> $second" +
                "]"
        }

        // WHEN
        val actual = testSubject.toString()

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Pair, When add(element), Then result is Triplet of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.add(newElement)

        // THEN
        result shouldBeInstanceOf Triplet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo newElement
    }

    @Test
    fun `Given a Pair, When dropLast, Then result is Element of expected elements`() {
        // WHEN
        val result = testSubject.dropLast()

        // THEN
        result shouldBeInstanceOf Element::class
        result.first shouldBeEqualTo testSubject.first
    }

    @Test
    fun `Given a Pair, When insertFirst(element), Then result is Triplet of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.insertFirst(newElement)

        // THEN
        result shouldBeInstanceOf Triplet::class
        result.first shouldBeEqualTo newElement
        result.second shouldBeEqualTo testSubject.first
        result.third shouldBeEqualTo testSubject.second
    }

    @Test
    fun `Given a Pair, When insertSecond(element), Then result is Triplet of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.insertSecond(newElement)

        // THEN
        result shouldBeInstanceOf Triplet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo newElement
        result.third shouldBeEqualTo testSubject.second
    }

    @Test
    fun `Given a Pair, When addThird(element), Then result is Triplet of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.insertThird(newElement)

        // THEN
        result shouldBeInstanceOf Triplet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo newElement
    }

    @Test
    fun `Given a Pair, When dropFirst, Then result is Element of expected elements`() {
        // WHEN
        val result = testSubject.dropFirst()

        // THEN
        result shouldBeInstanceOf Element::class
        result.first shouldBeEqualTo testSubject.second
    }

    @Test
    fun `Given a Pair, When dropSecond, Then result is Element of expected elements`() {
        // WHEN
        val result = testSubject.dropSecond()

        // THEN
        result shouldBeInstanceOf Element::class
        result.first shouldBeEqualTo testSubject.first
    }

    @Test
    fun `Given a Pair, When replaceLast, Then result is Pair of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.replaceLast(newElement)

        // THEN
        result shouldBeInstanceOf Pair::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo newElement
    }

    @Test
    fun `Given a Pair, When replaceFirst, Then result is Pair of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.replaceFirst(newElement)

        // THEN
        result shouldBeInstanceOf Pair::class
        result.first shouldBeEqualTo newElement
        result.second shouldBeEqualTo testSubject.second
    }

    @Test
    fun `Given a Pair, When replaceSecond, Then result is Pair of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.replaceSecond(newElement)

        // THEN
        result shouldBeInstanceOf Pair::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo newElement
    }
}
