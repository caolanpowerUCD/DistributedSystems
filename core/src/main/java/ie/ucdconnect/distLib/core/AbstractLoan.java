package ie.ucdconnect.distLib.core;

/*
    Members stored as Id (String) to avoid depdendency on models lib
*/

public class AbstractLoan {
    protected String book;
    protected String user;

    public String getBook() {
        return book;
    }

    public String getUser() {
        return user;
    }

}