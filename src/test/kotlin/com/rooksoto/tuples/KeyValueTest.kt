package com.rooksoto.tuples

import com.rooksoto.tuples.utils.simpleName
import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldBeInstanceOf
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class KeyValueTest : BaseTest() {

    private lateinit var testSubject: KeyValue<*, *>

    @BeforeEach
    fun setUp() {
        testSubject = KeyValue(
            testUtil.getRandomElement(),
            testUtil.getRandomElement()
        )
    }

    @Test
    fun `Given a KeyValue, When size, Then expected size returned`() {
        // GIVEN
        val expected = 1

        // WHEN
        val actual = testSubject.size

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a KeyValue, When count(), Then expected count returned`() {
        // GIVEN
        val expected = 1

        // WHEN
        val actual = testSubject.count()

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a KeyValue, when contains, then expected result returned`() {
        // GIVEN
        val expected = true

        // WHEN
        val actual = testSubject.contains(testSubject.value)

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a KeyValue, when containsAll, then expected result returned`() {
        // GIVEN
        val expected = true

        // WHEN
        val actual = testSubject.containsAll(listOf(testSubject.value))

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a KeyValue , when get(0) via indexing, then value returned`() {
        // GIVEN
        val expected = testSubject.value

        // WHEN
        val actual = testSubject[0]

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a KeyValue, When toList(), Then result is List of expected values`() {
        // GIVEN
        val expected = listOf(
            testSubject.value
        )

        // WHEN
        val actual = testSubject.toList()

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a KeyValue, When toString(), Then result is expected String`() {
        // GIVEN
        val expected = with(testSubject) {
            "KeyValue: [" +
                "(${key?.simpleName()}) -> $key : " +
                "(${value?.simpleName()}) -> $value" +
                "]"
        }

        // WHEN
        val actual = testSubject.toString()

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a KeyValue, When dropKey, Then result is Element of expected elements`() {
        // WHEN
        val result = testSubject.dropKey()

        // THEN
        result shouldBeInstanceOf Element::class
        result.first shouldBeEqualTo testSubject.value
    }

    @Test
    fun `Given a KeyValue, When dropValue, Then result is Element of expected elements`() {
        // WHEN
        val result = testSubject.dropValue()

        // THEN
        result shouldBeInstanceOf Element::class
        result.first shouldBeEqualTo testSubject.key
    }

    @Test
    fun `Given a KeyValue, When replaceKey, Then result is KeyValue of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.replaceKey(newElement)

        // THEN
        result shouldBeInstanceOf KeyValue::class
        result.key shouldBeEqualTo newElement
        result.value shouldBeEqualTo testSubject.value
    }

    @Test
    fun `Given a KeyValue, When replaceValue, Then result is KeyValue of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.replaceValue(newElement)

        // THEN
        result shouldBeInstanceOf KeyValue::class
        result.key shouldBeEqualTo testSubject.key
        result.value shouldBeEqualTo newElement
    }

    @Test
    fun `Given a KeyValue, When toPair, Then result is Pair of expected elements`() {
        // WHEN
        val result = testSubject.toPair()

        // THEN
        result shouldBeInstanceOf Pair::class
        result.first shouldBeEqualTo testSubject.key
        result.second shouldBeEqualTo testSubject.value
    }

    @Test
    fun `Given a KeyValue, When toLabelValue, Then result is LabelValue of expected elements`() {
        // WHEN
        val result = testSubject.toLabelValue()

        // THEN
        result shouldBeInstanceOf LabelValue::class
        result.label shouldBeEqualTo testSubject.key
        result.value shouldBeEqualTo testSubject.value
    }
}
