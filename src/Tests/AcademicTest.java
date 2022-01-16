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
}