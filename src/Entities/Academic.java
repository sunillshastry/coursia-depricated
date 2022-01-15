package Entities;

/**
 * A Java class that serves as a model for an Academic (person associated with an institution)
 * Extends the Person class to access the name and age attributes
 */
public class Academic extends Person {
    /**
     * The unique identity value of the Academic
     */
    private String identity;

    /**
     * The university which the Academic is associated with
     */
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

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
