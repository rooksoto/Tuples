package com.rooksoto.tuples

import com.rooksoto.tuples.utils.simpleName
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
    fun `Given a Decade, when contains, then expected result returned`() {
        // GIVEN
        val expected = true

        // WHEN
        val actual = testSubject.contains(testSubject.first)

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Decade, when containsAll, then expected result returned`() {
        // GIVEN
        val expected = true
        val secondElement = testSubject[(1 until testSubject.size).random()]

        // WHEN
        val actual = testSubject.containsAll(listOf(testSubject.first, secondElement))

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Decade, when get(0) via indexing, then first returned`() {
        // GIVEN
        val expected = testSubject.first

        // WHEN
        val actual = testSubject[0]

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Decade, when get(1) via indexing, then first returned`() {
        // GIVEN
        val expected = testSubject.second

        // WHEN
        val actual = testSubject[1]

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Decade, when get(2) via indexing, then first returned`() {
        // GIVEN
        val expected = testSubject.third

        // WHEN
        val actual = testSubject[2]

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Decade, when get(3) via indexing, then first returned`() {
        // GIVEN
        val expected = testSubject.fourth

        // WHEN
        val actual = testSubject[3]

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Decade, when get(4) via indexing, then first returned`() {
        // GIVEN
        val expected = testSubject.fifth

        // WHEN
        val actual = testSubject[4]

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Decade, when get(5) via indexing, then first returned`() {
        // GIVEN
        val expected = testSubject.sixth

        // WHEN
        val actual = testSubject[5]

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Decade, when get(6) via indexing, then first returned`() {
        // GIVEN
        val expected = testSubject.seventh

        // WHEN
        val actual = testSubject[6]

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Decade, when get(7) via indexing, then first returned`() {
        // GIVEN
        val expected = testSubject.eighth

        // WHEN
        val actual = testSubject[7]

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Decade, when get(8) via indexing, then first returned`() {
        // GIVEN
        val expected = testSubject.ninth

        // WHEN
        val actual = testSubject[8]

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Decade, when get(9) via indexing, then first returned`() {
        // GIVEN
        val expected = testSubject.tenth

        // WHEN
        val actual = testSubject[9]

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
        actual shouldBeInstanceOf List::class
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Decade, When toString(), Then result is expected String`() {
        // GIVEN
        val expected = with(testSubject) {
            "Decade: [" +
                "(${first?.simpleName()}) -> $first, " +
                "(${second?.simpleName()}) -> $second, " +
                "(${third?.simpleName()}) -> $third, " +
                "(${fourth?.simpleName()}) -> $fourth, " +
                "(${fifth?.simpleName()}) -> $fifth, " +
                "(${sixth?.simpleName()}) -> $sixth, " +
                "(${seventh?.simpleName()}) -> $seventh, " +
                "(${eighth?.simpleName()}) -> $eighth, " +
                "(${ninth?.simpleName()}) -> $ninth, " +
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

    @Test
    fun `Given a Decade, When dropFirst, Then result is Ennead of expected elements`() {
        // WHEN
        val result = testSubject.dropFirst()

        // THEN
        result shouldBeInstanceOf Ennead::class
        result.first shouldBeEqualTo testSubject.second
        result.second shouldBeEqualTo testSubject.third
        result.third shouldBeEqualTo testSubject.fourth
        result.fourth shouldBeEqualTo testSubject.fifth
        result.fifth shouldBeEqualTo testSubject.sixth
        result.sixth shouldBeEqualTo testSubject.seventh
        result.seventh shouldBeEqualTo testSubject.eighth
        result.eighth shouldBeEqualTo testSubject.ninth
        result.ninth shouldBeEqualTo testSubject.tenth
    }

    @Test
    fun `Given a Decade, When dropSecond, Then result is Ennead of expected elements`() {
        // WHEN
        val result = testSubject.dropSecond()

        // THEN
        result shouldBeInstanceOf Ennead::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.third
        result.third shouldBeEqualTo testSubject.fourth
        result.fourth shouldBeEqualTo testSubject.fifth
        result.fifth shouldBeEqualTo testSubject.sixth
        result.sixth shouldBeEqualTo testSubject.seventh
        result.seventh shouldBeEqualTo testSubject.eighth
        result.eighth shouldBeEqualTo testSubject.ninth
        result.ninth shouldBeEqualTo testSubject.tenth
    }

    @Test
    fun `Given a Decade, When dropThird, Then result is Ennead of expected elements`() {
        // WHEN
        val result = testSubject.dropThird()

        // THEN
        result shouldBeInstanceOf Ennead::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.fourth
        result.fourth shouldBeEqualTo testSubject.fifth
        result.fifth shouldBeEqualTo testSubject.sixth
        result.sixth shouldBeEqualTo testSubject.seventh
        result.seventh shouldBeEqualTo testSubject.eighth
        result.eighth shouldBeEqualTo testSubject.ninth
        result.ninth shouldBeEqualTo testSubject.tenth
    }

    @Test
    fun `Given a Decade, When dropFourth, Then result is Ennead of expected elements`() {
        // WHEN
        val result = testSubject.dropFourth()

        // THEN
        result shouldBeInstanceOf Ennead::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fifth
        result.fifth shouldBeEqualTo testSubject.sixth
        result.sixth shouldBeEqualTo testSubject.seventh
        result.seventh shouldBeEqualTo testSubject.eighth
        result.eighth shouldBeEqualTo testSubject.ninth
        result.ninth shouldBeEqualTo testSubject.tenth
    }

    @Test
    fun `Given a Decade, When dropFifth, Then result is Ennead of expected elements`() {
        // WHEN
        val result = testSubject.dropFifth()

        // THEN
        result shouldBeInstanceOf Ennead::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo testSubject.sixth
        result.sixth shouldBeEqualTo testSubject.seventh
        result.seventh shouldBeEqualTo testSubject.eighth
        result.eighth shouldBeEqualTo testSubject.ninth
        result.ninth shouldBeEqualTo testSubject.tenth
    }

    @Test
    fun `Given a Decade, When dropSixth, Then result is Ennead of expected elements`() {
        // WHEN
        val result = testSubject.dropSixth()

        // THEN
        result shouldBeInstanceOf Ennead::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo testSubject.fifth
        result.sixth shouldBeEqualTo testSubject.seventh
        result.seventh shouldBeEqualTo testSubject.eighth
        result.eighth shouldBeEqualTo testSubject.ninth
        result.ninth shouldBeEqualTo testSubject.tenth
    }

    @Test
    fun `Given a Decade, When dropSeventh, Then result is Ennead of expected elements`() {
        // WHEN
        val result = testSubject.dropSeventh()

        // THEN
        result shouldBeInstanceOf Ennead::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo testSubject.fifth
        result.sixth shouldBeEqualTo testSubject.sixth
        result.seventh shouldBeEqualTo testSubject.eighth
        result.eighth shouldBeEqualTo testSubject.ninth
        result.ninth shouldBeEqualTo testSubject.tenth
    }

    @Test
    fun `Given a Decade, When dropEighth, Then result is Ennead of expected elements`() {
        // WHEN
        val result = testSubject.dropEighth()

        // THEN
        result shouldBeInstanceOf Ennead::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo testSubject.fifth
        result.sixth shouldBeEqualTo testSubject.sixth
        result.seventh shouldBeEqualTo testSubject.seventh
        result.eighth shouldBeEqualTo testSubject.ninth
        result.ninth shouldBeEqualTo testSubject.tenth
    }

    @Test
    fun `Given a Decade, When dropNinth, Then result is Ennead of expected elements`() {
        // WHEN
        val result = testSubject.dropNinth()

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
        result.ninth shouldBeEqualTo testSubject.tenth
    }

    @Test
    fun `Given a Decade, When dropTenth, Then result is Ennead of expected elements`() {
        // WHEN
        val result = testSubject.dropTenth()

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

    @Test
    fun `Given a Decade, When replaceLast, Then result is Decade of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.replaceLast(newElement)

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
        result.tenth shouldBeEqualTo newElement
    }

    @Test
    fun `Given a Decade, When replaceFirst, Then result is Decade of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.replaceFirst(newElement)

        // THEN
        result shouldBeInstanceOf Decade::class
        result.first shouldBeEqualTo newElement
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo testSubject.fifth
        result.sixth shouldBeEqualTo testSubject.sixth
        result.seventh shouldBeEqualTo testSubject.seventh
        result.eighth shouldBeEqualTo testSubject.eighth
        result.ninth shouldBeEqualTo testSubject.ninth
        result.tenth shouldBeEqualTo testSubject.tenth
    }

    @Test
    fun `Given a Decade, When replaceSecond, Then result is Decade of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.replaceSecond(newElement)

        // THEN
        result shouldBeInstanceOf Decade::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo newElement
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo testSubject.fifth
        result.sixth shouldBeEqualTo testSubject.sixth
        result.seventh shouldBeEqualTo testSubject.seventh
        result.eighth shouldBeEqualTo testSubject.eighth
        result.ninth shouldBeEqualTo testSubject.ninth
        result.tenth shouldBeEqualTo testSubject.tenth
    }

    @Test
    fun `Given a Decade, When replaceThird, Then result is Decade of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.replaceThird(newElement)

        // THEN
        result shouldBeInstanceOf Decade::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo newElement
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo testSubject.fifth
        result.sixth shouldBeEqualTo testSubject.sixth
        result.seventh shouldBeEqualTo testSubject.seventh
        result.eighth shouldBeEqualTo testSubject.eighth
        result.ninth shouldBeEqualTo testSubject.ninth
        result.tenth shouldBeEqualTo testSubject.tenth
    }

    @Test
    fun `Given a Decade, When replaceFourth, Then result is Decade of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.replaceFourth(newElement)

        // THEN
        result shouldBeInstanceOf Decade::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo newElement
        result.fifth shouldBeEqualTo testSubject.fifth
        result.sixth shouldBeEqualTo testSubject.sixth
        result.seventh shouldBeEqualTo testSubject.seventh
        result.eighth shouldBeEqualTo testSubject.eighth
        result.ninth shouldBeEqualTo testSubject.ninth
        result.tenth shouldBeEqualTo testSubject.tenth
    }

    @Test
    fun `Given a Decade, When replaceFifth, Then result is Decade of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.replaceFifth(newElement)

        // THEN
        result shouldBeInstanceOf Decade::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo newElement
        result.sixth shouldBeEqualTo testSubject.sixth
        result.seventh shouldBeEqualTo testSubject.seventh
        result.eighth shouldBeEqualTo testSubject.eighth
        result.ninth shouldBeEqualTo testSubject.ninth
        result.tenth shouldBeEqualTo testSubject.tenth
    }

    @Test
    fun `Given a Decade, When replaceSixth, Then result is Decade of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.replaceSixth(newElement)

        // THEN
        result shouldBeInstanceOf Decade::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo testSubject.fifth
        result.sixth shouldBeEqualTo newElement
        result.seventh shouldBeEqualTo testSubject.seventh
        result.eighth shouldBeEqualTo testSubject.eighth
        result.ninth shouldBeEqualTo testSubject.ninth
        result.tenth shouldBeEqualTo testSubject.tenth
    }

    @Test
    fun `Given a Decade, When replaceSeventh, Then result is Decade of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.replaceSeventh(newElement)

        // THEN
        result shouldBeInstanceOf Decade::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo testSubject.fifth
        result.sixth shouldBeEqualTo testSubject.sixth
        result.seventh shouldBeEqualTo newElement
        result.eighth shouldBeEqualTo testSubject.eighth
        result.ninth shouldBeEqualTo testSubject.ninth
        result.tenth shouldBeEqualTo testSubject.tenth
    }

    @Test
    fun `Given a Decade, When replaceEighth, Then result is Decade of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.replaceEighth(newElement)

        // THEN
        result shouldBeInstanceOf Decade::class
        result.first shouldBeEqualTo testSubject.first
        result.second shouldBeEqualTo testSubject.second
        result.third shouldBeEqualTo testSubject.third
        result.fourth shouldBeEqualTo testSubject.fourth
        result.fifth shouldBeEqualTo testSubject.fifth
        result.sixth shouldBeEqualTo testSubject.sixth
        result.seventh shouldBeEqualTo testSubject.seventh
        result.eighth shouldBeEqualTo newElement
        result.ninth shouldBeEqualTo testSubject.ninth
        result.tenth shouldBeEqualTo testSubject.tenth
    }

    @Test
    fun `Given a Decade, When replaceNinth, Then result is Decade of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.replaceNinth(newElement)

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
        result.ninth shouldBeEqualTo newElement
        result.tenth shouldBeEqualTo testSubject.tenth
    }

    @Test
    fun `Given a Decade, When replaceTenth, Then result is Decade of expected elements`() {
        // GIVEN
        val newElement = testUtil.getRandomElement()

        // WHEN
        val result = testSubject.replaceTenth(newElement)

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
        result.tenth shouldBeEqualTo newElement
    }
}
