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

    public Academic(String identity, String university) {
        super();
        this.identity = identity;
        this.university = university;
    }

    public Academic(String name, int age, String identity, String university) {
        super(name, age);
        this.identity = identity;
        this.university = university;
    }

    public String getIdentity() {
        return this.identity;
    }

    public String getUniversity() {
        return this.university;
    }
}
