package ie.ucdconnect.distLib.core;

public class UserRequest {
    private int Id;
    private String firstName;
    private String lastName;
    private String email;

    public UserRequest() {}

    public UserRequest(int Id, String firstName, String lastName, String email) {
        this.setId(Id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
    }

    public int getId() {
        return this.Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
