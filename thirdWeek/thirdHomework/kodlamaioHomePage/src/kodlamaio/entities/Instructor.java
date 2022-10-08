package kodlamaio.entities;

public class Instructor {

    private int id;     // --> read only
    private String firstName;
    private String lastName;
    private String photoUrl;

    public Instructor(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Instructor(int id, String firstName, String lastName, String photoUrl) {
        this(id, firstName, lastName);
        this.photoUrl = photoUrl;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
    
    
}
