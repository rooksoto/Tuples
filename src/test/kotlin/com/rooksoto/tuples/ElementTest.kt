package com.rooksoto.tuples

import com.rooksoto.tuples.utils.simpleName
import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldBeInstanceOf
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class ElementTest : BaseTest() {

    private lateinit var testSubject: Element<*>

    @BeforeEach
    fun setUp() {
        testSubject = Element(
            testUtil.getRandomElement()
        )
    }

    @Test
    fun `Given a Element, When size, Then expected size returned`() {
        // GIVEN
        val expected = 1

        // WHEN
        val actual = testSubject.size

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Element, When count(), Then expected count returned`() {
        // GIVEN
        val expected = 1

        // WHEN
        val actual = testSubject.count()

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Element, when contains, then expected result returned`() {
        // GIVEN
        val expected = true

        // WHEN
        val actual = testSubject.contains(testSubject.first)

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Element, when containsAll, then expected result returned`() {
        // GIVEN
        val expected = true

        // WHEN
        val actual = testSubject.containsAll(listOf(testSubject.first))

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Element, when get(0) via indexing, then first returned`() {
        // GIVEN
        val expected = testSubject.first

        // WHEN
        val actual = testSubject[0]

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Element, When toList(), Then result is List of expected values`() {
        // GIVEN
        val expected = listOf(
            testSubject.first
        )

        // WHEN
        val actual = testSubject.toList()

        // THEN
        actual shouldBeInstanceOf List::class
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Element, When toString(), Then result is expected String`() {
        // GIVEN
        val expected = with(testSubject) {
            "Element: [(${first?.simpleName()}) -> $first]"
        }

        // WHEN
        val actual = testSubject.toString()

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Element, When add(element), Then result is Pair of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.add(newElement)

        // THEN
        result shouldBeInstanceOf Pair::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo newElement
    }

    @Test
    fun `Given a Element, When insertFirst(element), Then result is Pair of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.insertFirst(newElement)

        // THEN
        result shouldBeInstanceOf Pair::class
        result.first shouldBeEqualTo newElement
        result.second shouldBeEqualTo testSubject.first
    }

    @Test
    fun `Given a Element, When insertSecond(element), Then result is Pair of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.insertSecond(newElement)

        // THEN
        result shouldBeInstanceOf Pair::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo newElement
    }

    @Test
    fun `Given a Element, When addKey(element), Then result is KeyValue of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.addKey(newElement)

        // THEN
        result shouldBeInstanceOf KeyValue::class
        result.key shouldBeEqualTo newElement
        result.value shouldBeEqualTo testSubject.first
    }

    @Test
    fun `Given a Element, When addLabel(element), Then result is LabelValue of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.addLabel(newElement)

        // THEN
        result shouldBeInstanceOf LabelValue::class
        result.label shouldBeEqualTo newElement
        result.value shouldBeEqualTo testSubject.first
    }

    @Test
    fun `Given a Element, When asKey(element), Then result is KeyValue of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.asKey(newElement)

        // THEN
        result shouldBeInstanceOf KeyValue::class
        result.key shouldBeEqualTo testSubject.first
        result.value shouldBeEqualTo newElement
    }

    @Test
    fun `Given a Element, When asLabel(element), Then result is LabelValue of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.asLabel(newElement)

        // THEN
        result shouldBeInstanceOf LabelValue::class
        result.label shouldBeEqualTo testSubject.first
        result.value shouldBeEqualTo newElement
    }

    @Test
    fun `Given a Element, When replaceLast, Then result is Element of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.replaceLast(newElement)

        // THEN
        result shouldBeInstanceOf Element::class
        result.first shouldBeEqualTo newElement
    }

    @Test
    fun `Given a Element, When replaceFirst, Then result is Element of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.replaceFirst(newElement)

        // THEN
        result shouldBeInstanceOf Element::class
        result.first shouldBeEqualTo newElement
    }
}
