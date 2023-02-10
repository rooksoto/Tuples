package com.rooksoto.tuples

import com.rooksoto.tuples.constants.LABEL_VALUE_SIZE
import com.rooksoto.tuples.utils.simpleName
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class LabelValueTest : BaseTest() {

    private lateinit var testSubject: LabelValue<*, *>

    @BeforeEach
    fun setUp() {
        testSubject = LabelValue(
            testUtil.getRandomElement(),
            testUtil.getRandomElement()
        )
    }

    @Test
    fun `Given a LabelValue, When size, Then expected size returned`() {
        // GIVEN
        val expected = LABEL_VALUE_SIZE

        // WHEN
        val actual = testSubject.size

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a LabelValue, When count(), Then expected count returned`() {
        // GIVEN
        val expected = LABEL_VALUE_SIZE

        // WHEN
        val actual = testSubject.count()

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a LabelValue, When toList(), Then result is List of value`() {
        // GIVEN
        val expected = listOf(testSubject.value)

        // WHEN
        val actual = testSubject.toList()

        // THEN
        actual shouldBeInstanceOf List::class
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a LabelValue, when contains, then expected result returned`() {
        // GIVEN
        val expected = true

        // WHEN
        val actual = testSubject.contains(testSubject.value)

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a LabelValue, when containsAll, then expected result returned`() {
        // GIVEN
        val expected = true

        // WHEN
        val actual = testSubject.containsAll(listOf(testSubject.value))

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a LabelValue , when get(0) via indexing, then value returned`() {
        // GIVEN
        val expected = testSubject.value

        // WHEN
        val actual = testSubject[0]

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a LabelValue, When toList(), Then result is List of expected values`() {
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
    fun `Given a LabelValue, When toString(), Then result is expected String`() {
        // GIVEN
        val expected = with(testSubject) {
            "LabelValue: [" +
                "$label : " +
                "(${value?.simpleName()}) -> $value" +
                "]"
        }

        // WHEN
        val actual = testSubject.toString()

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a LabelValue, When dropLabel, Then result is Element of expected elements`() {
        // WHEN
        val result = testSubject.dropLabel()

        // THEN
        result shouldBeInstanceOf Element::class
        result.first shouldBeEqualTo testSubject.value
    }

    @Test
    fun `Given a LabelValue, When dropValue, Then result is Element of expected elements`() {
        // WHEN
        val result = testSubject.dropValue()

        // THEN
        result shouldBeInstanceOf Element::class
        result.first shouldBeEqualTo testSubject.label
    }

    @Test
    fun `Given a LabelValue, When replaceLabel, Then result is LabelValue of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.replaceLabel(newElement)

        // THEN
        result shouldBeInstanceOf LabelValue::class
        result.label shouldBeEqualTo newElement
        result.value shouldBeEqualTo testSubject.value
    }

    @Test
    fun `Given a LabelValue, When replaceValue, Then result is LabelValue of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.replaceValue(newElement)

        // THEN
        result shouldBeInstanceOf LabelValue::class
        result.label shouldBeEqualTo testSubject.label
        result.value shouldBeEqualTo newElement
    }

    @Test
    fun `Given a LabelValue, When toPair, Then result is Pair of expected elements`() {
        // WHEN
        val result = testSubject.toPair()

        // THEN
        result shouldBeInstanceOf Pair::class
        result.first shouldBeEqualTo testSubject.label
        result.second shouldBeEqualTo testSubject.value
    }

    @Test
    fun `Given a LabelValue, When toKeyValue, Then result is KeyValue of expected elements`() {
        // WHEN
        val result = testSubject.toKeyValue()

        // THEN
        result shouldBeInstanceOf KeyValue::class
        result.key shouldBeEqualTo testSubject.label
        result.value shouldBeEqualTo testSubject.value
    }
}
