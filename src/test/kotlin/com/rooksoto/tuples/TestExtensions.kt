package com.rooksoto.tuples

import org.junit.jupiter.api.Assertions
import kotlin.reflect.KClass


/**
 * This extension function allows us to use infix notation
 * to assert that two objects are referentially equal. It
 * wraps the assertSame method from the JUnit Assertions
 * class.
 *
 * Usage:
 *
 * val passList = listOf("pass")
 * val failList = listOf("fail")
 *
 * val actual = passList
 *
 * actual shouldBe passList // Passes
 * actual shouldBe failList // Fails
 *
 * @param other The object to compare to
 * @receiver The object to compare
 */
inline infix fun <reified T> T.shouldBe(other: Any?) =
    Assertions.assertSame(this, other)

/**
 * This extension function allows us to use infix notation
 * to assert that two objects are structurally equal. It
 * wraps the assertEquals method from the JUnit Assertions
 * class.
 *
 * Usage:
 *
 * val passExpected = listOf(1, 2, 3)
 * val failExpected = listOf(4, 5, 6)
 *
 * val actual = listOf(1, 2, 3)
 *
 * actual shouldBeEqualTo passExpected // Passes
 * actual shouldBeEqualTo failExpected // Fails
 *
 * @param other The object to compare to
 * @receiver The object to compare
 */
inline infix fun <reified T> T.shouldBeEqualTo(other: Any?) =
    Assertions.assertEquals(this, other)


/**
 * This extension function allows us to use infix notation
 * to assert that two objects are of the same type. It
 * wraps the assertTrue method from the JUnit Assertions
 * class, asserting that the class of the other object
 * is an instance of the class of the receiver object.
 *
 * Usage:
 *
 * val expected = List::class
 *
 * val actual = listOf(1, 2, 3)
 *
 * actual shouldBeInstanceOf expected // Passes
 * actual shouldBeInstanceOf String::class // Fails
 */
inline infix fun <reified T> T.shouldBeInstanceOf(otherClass: KClass<*>) =
    Assertions.assertTrue(otherClass.isInstance(this))
