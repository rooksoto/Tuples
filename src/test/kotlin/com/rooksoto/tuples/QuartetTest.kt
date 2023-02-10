package com.rooksoto.tuples

import com.rooksoto.tuples.utils.simpleName
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class QuartetTest : BaseTest() {

    private lateinit var testSubject: Quartet<*, *, *, *>

    @BeforeEach
    fun setUp() {
        testSubject = Quartet(
            testUtil.getRandomElement(),
            testUtil.getRandomElement(),
            testUtil.getRandomElement(),
            testUtil.getRandomElement()
        )
    }

    @Test
    fun `Given a Quartet, When size, Then expected size returned`() {
        // GIVEN
        val expected = 4

        // WHEN
        val actual = testSubject.size

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Quartet, When count(), Then expected count returned`() {
        // GIVEN
        val expected = 4

        // WHEN
        val actual = testSubject.count()

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Quartet, when contains, then expected result returned`() {
        // GIVEN
        val expected = true

        // WHEN
        val actual = testSubject.contains(testSubject.first)

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Quartet, when containsAll, then expected result returned`() {
        // GIVEN
        val expected = true
        val secondElement = testSubject[(1 until testSubject.size).random()]

        // WHEN
        val actual = testSubject.containsAll(listOf(testSubject.first, secondElement))

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Quartet, when get(0) via indexing, then first returned`() {
        // GIVEN
        val expected = testSubject.first

        // WHEN
        val actual = testSubject[0]

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Quartet, when get(1) via indexing, then second returned`() {
        // GIVEN
        val expected = testSubject.second

        // WHEN
        val actual = testSubject[1]

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Quartet, when get(2) via indexing, then third returned`() {
        // GIVEN
        val expected = testSubject.third

        // WHEN
        val actual = testSubject[2]

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Quartet, when get(3) via indexing, then fourth returned`() {
        // GIVEN
        val expected = testSubject.fourth

        // WHEN
        val actual = testSubject[3]

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Quartet, When toList(), Then result is List of expected values`() {
        // GIVEN
        val expected = listOf(
            testSubject.first,
            testSubject.second,
            testSubject.third,
            testSubject.fourth
        )

        // WHEN
        val actual = testSubject.toList()

        // THEN
        actual shouldBeInstanceOf List::class
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Quartet, When toString(), Then result is expected String`() {
        // GIVEN
        val expected = with(testSubject) {
            "Quartet: [" +
                "(${first?.simpleName()}) -> $first, " +
                "(${second?.simpleName()}) -> $second, " +
                "(${third?.simpleName()}) -> $third, " +
                "(${fourth?.simpleName()}) -> $fourth" +
                "]"
        }

        // WHEN
        val actual = testSubject.toString()

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Quartet, When add(element), Then result is Quintet of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.add(newElement)

        // THEN
        result shouldBeInstanceOf Quintet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo newElement
    }

    @Test
    fun `Given a Quartet, When dropLast, Then result is Triplet of expected elements`() {
        // WHEN
        val result = testSubject.dropLast()

        // THEN
        result shouldBeInstanceOf Triplet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
    }

    @Test
    fun `Given a Quartet, When insertFirst(element), Then result is Quintet of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.insertFirst(newElement)

        // THEN
        result shouldBeInstanceOf Quintet::class
        result.first shouldBeEqualTo newElement
        result.second shouldBeEqualTo testSubject.first
        result.third shouldBeEqualTo testSubject.second
        result.fourth shouldBeEqualTo testSubject.third
        result.fifth shouldBeEqualTo testSubject.fourth
    }

    @Test
    fun `Given a Quartet, When insertSecond(element), Then result is Quintet of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.insertSecond(newElement)

        // THEN
        result shouldBeInstanceOf Quintet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo newElement
        result.third shouldBeEqualTo testSubject.second
        result.fourth shouldBeEqualTo testSubject.third
        result.fifth shouldBeEqualTo testSubject.fourth
    }

    @Test
    fun `Given a Quartet, When addThird(element), Then result is Quintet of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.insertThird(newElement)

        // THEN
        result shouldBeInstanceOf Quintet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo newElement
        result.fourth shouldBeEqualTo testSubject.third
        result.fifth shouldBeEqualTo testSubject.fourth
    }

    @Test
    fun `Given a Quartet, When addFourth(element), Then result is Quintet of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.insertFourth(newElement)

        // THEN
        result shouldBeInstanceOf Quintet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo newElement
        result.fifth shouldBeEqualTo testSubject.fourth
    }

    @Test
    fun `Given a Quartet, When insertFifth(element), Then result is Quintet of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.insertFifth(newElement)

        // THEN
        result shouldBeInstanceOf Quintet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo newElement
    }

    @Test
    fun `Given a Quartet, When dropFirst, Then result is Triplet of expected elements`() {
        // WHEN
        val result = testSubject.dropFirst()

        // THEN
        result shouldBeInstanceOf Triplet::class
        result.first shouldBeEqualTo testSubject.second
        result.second shouldBeEqualTo testSubject.third
        result.third shouldBeEqualTo testSubject.fourth
    }

    @Test
    fun `Given a Quartet, When dropSecond, Then result is Triplet of expected elements`() {
        // WHEN
        val result = testSubject.dropSecond()

        // THEN
        result shouldBeInstanceOf Triplet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.third
        result.third shouldBeEqualTo testSubject.fourth
    }

    @Test
    fun `Given a Quartet, When dropThird, Then result is Triplet of expected elements`() {
        // WHEN
        val result = testSubject.dropThird()

        // THEN
        result shouldBeInstanceOf Triplet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.fourth
    }

    @Test
    fun `Given a Quartet, When dropFourth, Then result is Triplet of expected elements`() {
        // WHEN
        val result = testSubject.dropFourth()

        // THEN
        result shouldBeInstanceOf Triplet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
    }

    @Test
    fun `Given a Quartet, When replaceLast, Then result is Quartet of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.replaceLast(newElement)

        // THEN
        result shouldBeInstanceOf Quartet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo newElement
    }

    @Test
    fun `Given a Quartet, When replaceFirst, Then result is Quartet of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.replaceFirst(newElement)

        // THEN
        result shouldBeInstanceOf Quartet::class
        result.first shouldBeEqualTo newElement
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
    }

    @Test
    fun `Given a Quartet, When replaceSecond, Then result is Quartet of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.replaceSecond(newElement)

        // THEN
        result shouldBeInstanceOf Quartet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo newElement
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
    }

    @Test
    fun `Given a Quartet, When replaceThird, Then result is Quartet of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.replaceThird(newElement)

        // THEN
        result shouldBeInstanceOf Quartet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo newElement
        result.fourth shouldBeEqualTo testSubject.fourth
    }

    @Test
    fun `Given a Quartet, When replaceFourth, Then result is Quartet of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.replaceFourth(newElement)

        // THEN
        result shouldBeInstanceOf Quartet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo newElement
    }
}
