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

    @Test
    void getAge() {
        Person person = new Person(20);
        assertEquals(20, person.getAge());
    }

    @Test
    void getNameAndAge() {
        Person person = new Person("Mark Snow", 55);
        assertEquals("Mark Snow", person.getName());
        assertEquals(55, person.getAge());
    }

    @Test
    void setAndGetName() {
        Person person = new Person();
        person.setName("Holly Winks");
        assertEquals("Holly Winks", person.getName());
    }
}