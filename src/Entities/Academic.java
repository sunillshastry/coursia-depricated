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

    /**
     * The default constructor for the Academic class.
     * Initialises all values to -1 or null
     */
    public Academic() {
        super();
        this.identity = null;
        this.university = null;
    }

    /**
     * The Person-primary constructor for Academic class.
     * Initialises the 'identity' and 'university' to null values.
     *
     * @param name The name of the Academic
     * @param age  The age of the Academic
     */
    public Academic(String name, int age) {
        super(name, age);
        this.identity = null;
        this.university = null;
    }

    /**
     * The Academic-primary constructor for the Academic class.
     * Initialises the 'name' and 'age' to null and -1 values respectively.
     *
     * @param identity   The unique identity value of the Academic
     * @param university The university which the Academic is associated with
     */
    public Academic(String identity, String university) {
        super();
        this.identity = identity;
        this.university = university;
    }

    /**
     * The main constructor for the Academic class.
     * Initialises all attributes to their respective argument values.
     *
     * @param name       The name of the Academic
     * @param age        The age of the Academic
     * @param identity   The unique identity number of the Academic
     * @param university The university which the Academic is associated with
     */
    public Academic(String name, int age, String identity, String university) {
        super(name, age);
        this.identity = identity;
        this.university = university;
    }

    /**
     * Retrieves the unique identity value of an Academic
     *
     * @return The identity number
     */
    public String getIdentity() {
        return this.identity;
    }

    /**
     * Retrieves the name of the university which the Academic is associated to
     *
     * @return The Academic's university
     */
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
