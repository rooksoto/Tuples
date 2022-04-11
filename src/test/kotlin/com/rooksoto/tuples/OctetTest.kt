package com.rooksoto.tuples

import com.rooksoto.tuples.utils.simpleName
import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldBeInstanceOf
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class OctetTest : BaseTest() {

    private lateinit var testSubject: Octet<*, *, *, *, *, *, *, *>

    @BeforeEach
    fun setUp() {
        testSubject = Octet(
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
    fun `Given a Octet, When size, Then expected size returned`() {
        // GIVEN
        val expected = 8

        // WHEN
        val actual = testSubject.size

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Octet, When count(), Then expected count returned`() {
        // GIVEN
        val expected = 8

        // WHEN
        val actual = testSubject.count()

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Octet, when contains, then expected result returned`() {
        // GIVEN
        val expected = true

        // WHEN
        val actual = testSubject.contains(testSubject.first)

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Octet, when containsAll, then expected result returned`() {
        // GIVEN
        val expected = true
        val secondElement = testSubject[(1 until testSubject.size).random()]

        // WHEN
        val actual = testSubject.containsAll(listOf(testSubject.first, secondElement))

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Octet, when get(0) via indexing, then first returned`() {
        // GIVEN
        val expected = testSubject.first

        // WHEN
        val actual = testSubject[0]

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Octet, when get(1) via indexing, then second returned`() {
        // GIVEN
        val expected = testSubject.second

        // WHEN
        val actual = testSubject[1]

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Octet, when get(2) via indexing, then third returned`() {
        // GIVEN
        val expected = testSubject.third

        // WHEN
        val actual = testSubject[2]

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Octet, when get(3) via indexing, then fourth returned`() {
        // GIVEN
        val expected = testSubject.fourth

        // WHEN
        val actual = testSubject[3]

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Octet, when get(4) via indexing, then fifth returned`() {
        // GIVEN
        val expected = testSubject.fifth

        // WHEN
        val actual = testSubject[4]

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Octet, when get(5) via indexing, then sixth returned`() {
        // GIVEN
        val expected = testSubject.sixth

        // WHEN
        val actual = testSubject[5]

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Octet, when get(6) via indexing, then seventh returned`() {
        // GIVEN
        val expected = testSubject.seventh

        // WHEN
        val actual = testSubject[6]

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Octet, when get(7) via indexing, then eighth returned`() {
        // GIVEN
        val expected = testSubject.eighth

        // WHEN
        val actual = testSubject[7]

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Octet, When toList(), Then result is List of expected values`() {
        // GIVEN
        val expected = listOf(
            testSubject.first,
            testSubject.second,
            testSubject.third,
            testSubject.fourth,
            testSubject.fifth,
            testSubject.sixth,
            testSubject.seventh,
            testSubject.eighth
        )

        // WHEN
        val actual = testSubject.toList()

        // THEN
        actual shouldBeInstanceOf List::class
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Octet, When toString(), Then result is expected String`() {
        // GIVEN
        val expected = with(testSubject) {
            "Octet: [" +
                "(${first?.simpleName()}) -> $first, " +
                "(${second?.simpleName()}) -> $second, " +
                "(${third?.simpleName()}) -> $third, " +
                "(${fourth?.simpleName()}) -> $fourth, " +
                "(${fifth?.simpleName()}) -> $fifth, " +
                "(${sixth?.simpleName()}) -> $sixth, " +
                "(${seventh?.simpleName()}) -> $seventh, " +
                "(${eighth?.simpleName()}) -> $eighth" +
                "]"
        }

        // WHEN
        val actual = testSubject.toString()

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Octet, When add(element), Then result is Ennead of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.add(newElement)

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
        result.ninth shouldBeEqualTo newElement
    }

    @Test
    fun `Given a Octet, When dropLast, Then result is Septet of expected elements`() {
        // WHEN
        val result = testSubject.dropLast()

        // THEN
        result shouldBeInstanceOf Septet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo testSubject.fifth
        result.sixth shouldBeEqualTo testSubject.sixth
        result.seventh shouldBeEqualTo testSubject.seventh
    }

    @Test
    fun `Given a Octet, When insertFirst(element), Then result is Ennead of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.insertFirst(newElement)

        // THEN
        result shouldBeInstanceOf Ennead::class
        result.first shouldBeEqualTo newElement
        result.second shouldBeEqualTo testSubject.first
        result.third shouldBeEqualTo testSubject.second
        result.fourth shouldBeEqualTo testSubject.third
        result.fifth shouldBeEqualTo testSubject.fourth
        result.sixth shouldBeEqualTo testSubject.fifth
        result.seventh shouldBeEqualTo testSubject.sixth
        result.eighth shouldBeEqualTo testSubject.seventh
        result.ninth shouldBeEqualTo testSubject.eighth
    }

    @Test
    fun `Given a Octet, When insertSecond(element), Then result is Ennead of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.insertSecond(newElement)

        // THEN
        result shouldBeInstanceOf Ennead::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo newElement
        result.third shouldBeEqualTo testSubject.second
        result.fourth shouldBeEqualTo testSubject.third
        result.fifth shouldBeEqualTo testSubject.fourth
        result.sixth shouldBeEqualTo testSubject.fifth
        result.seventh shouldBeEqualTo testSubject.sixth
        result.eighth shouldBeEqualTo testSubject.seventh
        result.ninth shouldBeEqualTo testSubject.eighth
    }

    @Test
    fun `Given a Octet, When insertThird(element), Then result is Ennead of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.insertThird(newElement)

        // THEN
        result shouldBeInstanceOf Ennead::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo newElement
        result.fourth shouldBeEqualTo testSubject.third
        result.fifth shouldBeEqualTo testSubject.fourth
        result.sixth shouldBeEqualTo testSubject.fifth
        result.seventh shouldBeEqualTo testSubject.sixth
        result.eighth shouldBeEqualTo testSubject.seventh
        result.ninth shouldBeEqualTo testSubject.eighth
    }

    @Test
    fun `Given a Octet, When insertFourth(element), Then result is Ennead of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.insertFourth(newElement)

        // THEN
        result shouldBeInstanceOf Ennead::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo newElement
        result.fifth shouldBeEqualTo testSubject.fourth
        result.sixth shouldBeEqualTo testSubject.fifth
        result.seventh shouldBeEqualTo testSubject.sixth
        result.eighth shouldBeEqualTo testSubject.seventh
        result.ninth shouldBeEqualTo testSubject.eighth
    }

    @Test
    fun `Given a Octet, When insertFifth(element), Then result is Ennead of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.insertFifth(newElement)

        // THEN
        result shouldBeInstanceOf Ennead::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo newElement
        result.sixth shouldBeEqualTo testSubject.fifth
        result.seventh shouldBeEqualTo testSubject.sixth
        result.eighth shouldBeEqualTo testSubject.seventh
        result.ninth shouldBeEqualTo testSubject.eighth
    }

    @Test
    fun `Given a Octet, When insertSixth(element), Then result is Ennead of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.insertSixth(newElement)

        // THEN
        result shouldBeInstanceOf Ennead::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo testSubject.fifth
        result.sixth shouldBeEqualTo newElement
        result.seventh shouldBeEqualTo testSubject.sixth
        result.eighth shouldBeEqualTo testSubject.seventh
        result.ninth shouldBeEqualTo testSubject.eighth
    }

    @Test
    fun `Given a Octet, When insertSeventh(element), Then result is Ennead of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.insertSeventh(newElement)

        // THEN
        result shouldBeInstanceOf Ennead::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo testSubject.fifth
        result.sixth shouldBeEqualTo testSubject.sixth
        result.seventh shouldBeEqualTo newElement
        result.eighth shouldBeEqualTo testSubject.seventh
        result.ninth shouldBeEqualTo testSubject.eighth
    }

    @Test
    fun `Given a Octet, When insertEighth(element), Then result is Ennead of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.insertEighth(newElement)

        // THEN
        result shouldBeInstanceOf Ennead::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo testSubject.fifth
        result.sixth shouldBeEqualTo testSubject.sixth
        result.seventh shouldBeEqualTo testSubject.seventh
        result.eighth shouldBeEqualTo newElement
        result.ninth shouldBeEqualTo testSubject.eighth
    }

    @Test
    fun `Given a Octet, When insertNinth(element), Then result is Ennead of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.insertNinth(newElement)

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
        result.ninth shouldBeEqualTo newElement
    }

    @Test
    fun `Given a Octet, When dropFirst, Then result is Septet of expected elements`() {
        // WHEN
        val result = testSubject.dropFirst()

        // THEN
        result shouldBeInstanceOf Septet::class
        result.first shouldBeEqualTo testSubject.second
        result.second shouldBeEqualTo testSubject.third
        result.third shouldBeEqualTo testSubject.fourth
        result.fourth shouldBeEqualTo testSubject.fifth
        result.fifth shouldBeEqualTo testSubject.sixth
        result.sixth shouldBeEqualTo testSubject.seventh
        result.seventh shouldBeEqualTo testSubject.eighth
    }

    @Test
    fun `Given a Octet, When dropSecond, Then result is Septet of expected elements`() {
        // WHEN
        val result = testSubject.dropSecond()

        // THEN
        result shouldBeInstanceOf Septet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.third
        result.third shouldBeEqualTo testSubject.fourth
        result.fourth shouldBeEqualTo testSubject.fifth
        result.fifth shouldBeEqualTo testSubject.sixth
        result.sixth shouldBeEqualTo testSubject.seventh
        result.seventh shouldBeEqualTo testSubject.eighth
    }

    @Test
    fun `Given a Octet, When dropThird, Then result is Septet of expected elements`() {
        // WHEN
        val result = testSubject.dropThird()

        // THEN
        result shouldBeInstanceOf Septet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.fourth
        result.fourth shouldBeEqualTo testSubject.fifth
        result.fifth shouldBeEqualTo testSubject.sixth
        result.sixth shouldBeEqualTo testSubject.seventh
        result.seventh shouldBeEqualTo testSubject.eighth
    }

    @Test
    fun `Given a Octet, When dropFourth, Then result is Septet of expected elements`() {
        // WHEN
        val result = testSubject.dropFourth()

        // THEN
        result shouldBeInstanceOf Septet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fifth
        result.fifth shouldBeEqualTo testSubject.sixth
        result.sixth shouldBeEqualTo testSubject.seventh
        result.seventh shouldBeEqualTo testSubject.eighth
    }

    @Test
    fun `Given a Octet, When dropFifth, Then result is Septet of expected elements`() {
        // WHEN
        val result = testSubject.dropFifth()

        // THEN
        result shouldBeInstanceOf Septet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo testSubject.sixth
        result.sixth shouldBeEqualTo testSubject.seventh
        result.seventh shouldBeEqualTo testSubject.eighth
    }

    @Test
    fun `Given a Octet, When dropSixth, Then result is Septet of expected elements`() {
        // WHEN
        val result = testSubject.dropSixth()

        // THEN
        result shouldBeInstanceOf Septet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo testSubject.fifth
        result.sixth shouldBeEqualTo testSubject.seventh
        result.seventh shouldBeEqualTo testSubject.eighth
    }

    @Test
    fun `Given a Octet, When dropSeventh, Then result is Septet of expected elements`() {
        // WHEN
        val result = testSubject.dropSeventh()

        // THEN
        result shouldBeInstanceOf Septet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo testSubject.fifth
        result.sixth shouldBeEqualTo testSubject.sixth
        result.seventh shouldBeEqualTo testSubject.eighth
    }

    @Test
    fun `Given a Octet, When dropEighth, Then result is Septet of expected elements`() {
        // WHEN
        val result = testSubject.dropEighth()

        // THEN
        result shouldBeInstanceOf Septet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo testSubject.fifth
        result.sixth shouldBeEqualTo testSubject.sixth
        result.seventh shouldBeEqualTo testSubject.seventh
    }

    @Test
    fun `Given a Octet, When replaceLast, Then result is Octet of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.replaceLast(newElement)

        // THEN
        result shouldBeInstanceOf Octet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo testSubject.fifth
        result.sixth shouldBeEqualTo testSubject.sixth
        result.seventh shouldBeEqualTo testSubject.seventh
        result.eighth shouldBeEqualTo newElement
    }

    @Test
    fun `Given a Octet, When replaceFirst, Then result is Octet of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.replaceFirst(newElement)

        // THEN
        result shouldBeInstanceOf Octet::class
        result.first shouldBeEqualTo newElement
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo testSubject.fifth
        result.sixth shouldBeEqualTo testSubject.sixth
        result.seventh shouldBeEqualTo testSubject.seventh
        result.eighth shouldBeEqualTo testSubject.eighth
    }

    @Test
    fun `Given a Octet, When replaceSecond, Then result is Octet of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.replaceSecond(newElement)

        // THEN
        result shouldBeInstanceOf Octet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo newElement
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo testSubject.fifth
        result.sixth shouldBeEqualTo testSubject.sixth
        result.seventh shouldBeEqualTo testSubject.seventh
        result.eighth shouldBeEqualTo testSubject.eighth
    }

    @Test
    fun `Given a Octet, When replaceThird, Then result is Octet of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.replaceThird(newElement)

        // THEN
        result shouldBeInstanceOf Octet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo newElement
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo testSubject.fifth
        result.sixth shouldBeEqualTo testSubject.sixth
        result.seventh shouldBeEqualTo testSubject.seventh
        result.eighth shouldBeEqualTo testSubject.eighth
    }

    @Test
    fun `Given a Octet, When replaceFourth, Then result is Octet of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.replaceFourth(newElement)

        // THEN
        result shouldBeInstanceOf Octet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo newElement
        result.fifth shouldBeEqualTo testSubject.fifth
        result.sixth shouldBeEqualTo testSubject.sixth
        result.seventh shouldBeEqualTo testSubject.seventh
        result.eighth shouldBeEqualTo testSubject.eighth
    }

    @Test
    fun `Given a Octet, When replaceFifth, Then result is Octet of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.replaceFifth(newElement)

        // THEN
        result shouldBeInstanceOf Octet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo newElement
        result.sixth shouldBeEqualTo testSubject.sixth
        result.seventh shouldBeEqualTo testSubject.seventh
        result.eighth shouldBeEqualTo testSubject.eighth
    }

    @Test
    fun `Given a Octet, When replaceSixth, Then result is Octet of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.replaceSixth(newElement)

        // THEN
        result shouldBeInstanceOf Octet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo testSubject.fifth
        result.sixth shouldBeEqualTo newElement
        result.seventh shouldBeEqualTo testSubject.seventh
        result.eighth shouldBeEqualTo testSubject.eighth
    }

    @Test
    fun `Given a Octet, When replaceSeventh, Then result is Octet of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.replaceSeventh(newElement)

        // THEN
        result shouldBeInstanceOf Octet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo testSubject.fifth
        result.sixth shouldBeEqualTo testSubject.sixth
        result.seventh shouldBeEqualTo newElement
        result.eighth shouldBeEqualTo testSubject.eighth
    }

    @Test
    fun `Given a Octet, When replaceEighth, Then result is Octet of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.replaceEighth(newElement)

        // THEN
        result shouldBeInstanceOf Octet::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo testSubject.fifth
        result.sixth shouldBeEqualTo testSubject.sixth
        result.seventh shouldBeEqualTo testSubject.seventh
        result.eighth shouldBeEqualTo newElement
    }
}
