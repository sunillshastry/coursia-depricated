package Entities;

public class Person {
    private String name;

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
}
