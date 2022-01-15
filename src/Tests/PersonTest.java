package Tests;
import Entities.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
        Person person = new Person("Rick Hoffman");
        assertEquals("Rick Hoffman", person.getName());
    }
}