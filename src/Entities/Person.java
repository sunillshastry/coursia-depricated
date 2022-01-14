package Entities;

/**
 * A Java class that serves as a Model for a real Person object, includes details like name and age.
 */
public class Person {
    /**
     * The name of the Person
     */
    private String name;

    /**
     * The age of the Person
     */
    private int age;
    
    public Person() {
        this.name = null;
        this.age = -1;
    }

    public Person(String name) {
        this.name = name;
        this.age = -1;
    }

    public Person(int age) {
        this.name = null;
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
