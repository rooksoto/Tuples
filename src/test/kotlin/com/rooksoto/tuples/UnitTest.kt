package com.rooksoto.tuples

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.util.UUID

internal class UnitTest {

    private lateinit var testSubject: Unit<UUID>

    @BeforeEach
    fun setUp() {
        testSubject = Unit(UUID.randomUUID())
    }

    @Test
    fun `Given a Unit, When size, Then expected size returned`() {
        // GIVEN
        val expected = UNIT_SIZE

        // WHEN
        val actual = testSubject.size

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Given a Unit, When count(), Then expected count returned`() {
        // GIVEN
        val expected = UNIT_SIZE

        // WHEN
        val actual = testSubject.count()

        // THEN
        actual shouldBeEqualTo expected
    }
}
