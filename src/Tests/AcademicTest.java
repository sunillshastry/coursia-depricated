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
}