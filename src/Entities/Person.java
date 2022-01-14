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

    /**
     * The default constructor for the Person class that takes no arguments.
     * Sets the attributes name and age to null and -1 respectively
     */
    public Person() {
        this.name = null;
        this.age = -1;
    }

    /**
     * A name-primary constructor for the Person class.
     * Sets the 'name' parameter as the value for the name attribute
     * Sets the age to -1
     *
     * @param name The name of the Person
     */
    public Person(String name) {
        this.name = name;
        this.age = -1;
    }

    /**
     * An age-primary constructor for the Person class
     * Sets the 'age' parameter as the value for the age attribute
     * Sets the name to null
     *
     * @param age The age of the Person (must be 0 or higher)
     */
    public Person(int age) {
        this.name = null;
        this.age = age;
    }

    /**
     * The main constructor for the Person class
     * Sets the 'age' parameter as the value for age attribute
     * Sets the 'name' parameter as the value for name attribute
     * @param name The name of the Person
     * @param age The age of the Person (must be 0 or higher)
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Retrieves the name of the Person
     * @return The Person's name, only if it is not a null value
     */
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
