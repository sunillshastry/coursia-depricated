package Tests;

import org.junit.jupiter.api.Test;
import Entities.Academic;

import static org.junit.jupiter.api.Assertions.*;

class AcademicTest {
    @Test
    void NoArgsAcademicName() {
        Academic academic = new Academic();
        assertNull(academic.getName());
    }

    @Test
    void NoArgsAcademicAge() {
        Academic academic = new Academic();
        assertEquals(-1, academic.getAge());
    }

    @Test
    void NoArgsAcademicIdentity() {
        Academic academic = new Academic();
        assertNull(academic.getIdentity());
    }

    @Test
    void NoArgsAcademicUniversity() {
        Academic academic = new Academic();
        assertNull(academic.getUniversity());
    }

    @Test
    void PersonArgsIdentity() {
        Academic academic = new Academic("Matthew Rayan", 45);
        assertNull(academic.getIdentity());
    }

    @Test
    void PersonArgsUniversity() {
        Academic academic = new Academic("Steven Howard", 23);
        assertNull(academic.getUniversity());
    }

    @Test
    void AcademicArgsIdentity() {
        Academic academic = new Academic("abc123", "Stanford University");
        assertEquals("abc123", academic.getIdentity());
    }

    @Test
    void AcademicArgsUniversity() {
        Academic academic = new Academic("mnc548", "Harvard University");
        assertEquals("Harvard University", academic.getUniversity());
    }

    @Test
    void MainAcademicConstructor() {
        Academic academic = new Academic("Richard Thompson", 24, "etu414", "University of Toronto");

        // Name test for academic
        assertEquals("Richard Thompson", academic.getName());

        // Age test for academic
        assertEquals(24, academic.getAge());
    }
}