package com.rooksoto.tuples

import org.junit.jupiter.api.Test

class EqualityTest : BaseTest() {

    @Test
    fun `Given 2 Tuples of different capacity, When compareTo, Then expected comparison returned irrespective of elements`() {
        // GIVEN
        val largeTuple = Quintet(
            testUtil.getRandomElement(),
            testUtil.getRandomElement(),
            testUtil.getRandomElement(),
            testUtil.getRandomElement(),
            testUtil.getRandomElement()
        )
        val smallTuple = Triplet(
            testUtil.getRandomElement(),
            testUtil.getRandomElement(),
            testUtil.getRandomElement()
        )

        // WHEN
        val largeToSmallComparison = largeTuple.compareTo(smallTuple)
        val smallToLargeComparison = smallTuple.compareTo(largeTuple)

        // THEN
        assertComparisons(largeToSmallComparison, smallToLargeComparison)
    }

    @Test
    fun `Given 2 Tuples of same capacity created from same values, When compared for equality, Then Tuples are equal but not referentially equal`() {
        // GIVEN
        val firstValue = testUtil.getRandomElement()
        val secondValue = testUtil.getRandomElement()
        val thirdValue = testUtil.getRandomElement()
        val fourthValue = testUtil.getRandomElement()
        val fifthValue = testUtil.getRandomElement()

        val testSubject1 = Quintet(firstValue, secondValue, thirdValue, fourthValue, fifthValue)
        val testSubject2 = Quintet(firstValue, secondValue, thirdValue, fourthValue, fifthValue)

        // WHEN
        val tuplesAreEqual = (testSubject1 == testSubject2)
        val tuplesAreReferentiallyEqual = (testSubject1 === testSubject2)

        // THEN
        tuplesAreEqual shouldBe true
        tuplesAreReferentiallyEqual shouldBe false
    }

    @Test
    fun `Given 2 Tuples of same capacity created from different values, When compared for equality, Then Tuples are not`() {
        // GIVEN
        val testSubject1 = Quintet(1, 2, 3, 4, 5)
        val testSubject2 = Quintet(6, 7, 8, 9, 10)

        // WHEN
        val tuplesAreEqual = (testSubject1 == testSubject2)

        // THEN
        tuplesAreEqual shouldBe false
    }

    @Test
    fun `Given 2 Tuples of same capacity, When compareTo by null, Then expected comparison returned`() {
        // GIVEN
        val otherElement = testUtil.getRandomElement()
        val highIntTuple = Triplet(otherElement, 9, otherElement)
        val lowIntTuple = Triplet(otherElement, null, otherElement)
        val otherLowIntTuple = Triplet(otherElement, null, otherElement)

        // WHEN
        val highToLowComparison = highIntTuple.compareTo(lowIntTuple)
        val lowToHighComparison = lowIntTuple.compareTo(highIntTuple)
        val equalComparison = lowIntTuple.compareTo(otherLowIntTuple)

        // THEN
        assertComparisons(highToLowComparison, lowToHighComparison, equalComparison)
    }

    @Test
    fun `Given 2 Tuples of same capacity, When compareTo by Int, Then expected comparison returned`() {
        // GIVEN
        val otherElement = testUtil.getRandomElement()
        val highIntTuple = Triplet(otherElement, 9, otherElement)
        val lowIntTuple = Triplet(otherElement, 1, otherElement)
        val otherLowIntTuple = Triplet(otherElement, 1, otherElement)

        // WHEN
        val highToLowComparison = highIntTuple.compareTo(lowIntTuple)
        val lowToHighComparison = lowIntTuple.compareTo(highIntTuple)
        val equalComparison = lowIntTuple.compareTo(otherLowIntTuple)

        // THEN
        assertComparisons(highToLowComparison, lowToHighComparison, equalComparison)
    }

    @Test
    fun `Given 2 Tuples of same capacity, When compareTo by String, Then expected comparison returned`() {
        // GIVEN
        val otherElement = testUtil.getRandomElement()
        val highStringTuple = Triplet(otherElement, "Zoo", otherElement)
        val lowStringTuple = Triplet(otherElement, "Animal", otherElement)
        val otherLowStringTuple = Triplet(otherElement, "Animal", otherElement)

        // WHEN
        val highToLowComparison = highStringTuple.compareTo(lowStringTuple)
        val lowToHighComparison = lowStringTuple.compareTo(highStringTuple)
        val equalComparison = lowStringTuple.compareTo(otherLowStringTuple)

        // THEN
        assertComparisons(highToLowComparison, lowToHighComparison, equalComparison)
    }

    @Test
    fun `Given 2 Tuples of same capacity, When compareTo by same but unknown type that implements equal, Then expected comparison returned`() {
        // GIVEN
        val otherElement = testUtil.getRandomElement()
        val highUnknownTuple = Triplet(otherElement, RandomDataClass(9, "A"), otherElement)
        val lowUnknownTuple = Triplet(otherElement, RandomDataClass(1, "A"), otherElement)
        val otherLowUnknownTuple = Triplet(otherElement, RandomDataClass(1, "A"), otherElement)

        // WHEN
        val highToLowComparison = highUnknownTuple.compareTo(lowUnknownTuple)
        val lowToHighComparison = lowUnknownTuple.compareTo(highUnknownTuple)
        val equalComparison = lowUnknownTuple.compareTo(otherLowUnknownTuple)

        // THEN
        assertComparisons(highToLowComparison, lowToHighComparison, equalComparison)
    }

    @Test
    fun `Given 2 Tuples of same capacity, When compareTo by toString(), Then expected comparison returned`() {
        // GIVEN
        val otherElement = testUtil.getRandomElement()
        val highUnknownTuple = Triplet(otherElement, RandomObject, otherElement)
        val lowUnknownTuple = Triplet(otherElement, RandomClass("A"), otherElement)
        val otherLowUnknownTuple = Triplet(otherElement, RandomClass("A"), otherElement)

        // WHEN
        val highToLowComparison = highUnknownTuple.compareTo(lowUnknownTuple)
        val lowToHighComparison = lowUnknownTuple.compareTo(highUnknownTuple)
        val equalComparison = lowUnknownTuple.compareTo(otherLowUnknownTuple)

        // THEN
        assertComparisons(highToLowComparison, lowToHighComparison, equalComparison)
    }

    private fun assertComparisons(
        highToLowComparison: Int,
        lowToHighComparison: Int,
        equalComparison: Int = 0
    ) {
        highToLowComparison shouldBeEqualTo 1
        lowToHighComparison shouldBeEqualTo -1
        equalComparison shouldBeEqualTo 0
    }
}
