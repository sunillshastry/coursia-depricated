package Tests;

import org.junit.jupiter.api.Test;
import Entities.Academic;

import static org.junit.jupiter.api.Assertions.*;

class AcademicTest {
    @Test
    public void NoArgsAcademicName() {
        Academic academic = new Academic();
        assertNull(academic.getName());
    }

    @Test
    public void NoArgsAcademicAge() {
        Academic academic = new Academic();
        assertEquals(-1, academic.getAge());
    }

    @Test
    public void NoArgsAcademicIdentity() {
        Academic academic = new Academic();
        assertNull(academic.getIdentity());
    }

    @Test
    public void NoArgsAcademicUniversity() {
        Academic academic = new Academic();
        assertNull(academic.getUniversity());
    }

    @Test
    public void PersonArgsIdentity() {
        Academic academic = new Academic("Matthew Rayan", 45);
        assertNull(academic.getIdentity());
    }

    @Test
    public void PersonArgsUniversity() {
        Academic academic = new Academic("Steven Howard", 23);
        assertNull(academic.getUniversity());
    }

    @Test
    public void AcademicArgsIdentity() {
        Academic academic = new Academic("abc123", "Stanford University");
        assertEquals("abc123", academic.getIdentity());
    }

    @Test
    public void AcademicArgsUniversity() {
        Academic academic = new Academic("mnc548", "Harvard University");
        assertEquals("Harvard University", academic.getUniversity());
    }

    @Test
    public void MainAcademicConstructor() {
        Academic academic = new Academic("Richard Thompson", 24, "etu414", "University of Toronto");

        // Name test for academic
        assertEquals("Richard Thompson", academic.getName());

        // Age test for academic
        assertEquals(24, academic.getAge());

        // Identity test for academic
        assertEquals("etu414", academic.getIdentity());

        // University test for academic
        assertEquals("University of Toronto", academic.getUniversity());
    }

    @Test
    public void AcademicSetIdentity() {
        Academic academic = new Academic("kbe725", "University of Saskatchewan");
        assertEquals("kbe725", academic.getIdentity());

        // Set a new identity number for the academic.
        academic.setIdentity("mex351");

        // Testing the newly set identity
        assertEquals("mex351", academic.getIdentity());
    }

    @Test
    public void AcademicSetUniversity() {
        Academic academic = new Academic("pov121", "Trinity College");
        assertEquals("Trinity College", academic.getUniversity());

        // Set a new university value for the academic
        academic.setUniversity("University of Manchester");

        // Testing the newly set university value
        assertEquals("University of Manchester", academic.getUniversity());
    }
}