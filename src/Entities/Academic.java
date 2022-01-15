package Entities;

public class Academic extends Person {
    private String identity;

    private String university;

    public Academic() {
        super();
        this.identity = null;
        this.university = null;
    }

    public Academic(String name, int age) {
        super(name, age);
        this.identity = null;
        this.university = null;
    }
}
