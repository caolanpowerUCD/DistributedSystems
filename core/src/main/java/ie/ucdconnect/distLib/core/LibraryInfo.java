package ie.ucdconnect.distLib.core;

public class LibraryInfo {
    private String libraryPort;
    private String libraryLocation;
    private String libraryID;


    public LibraryInfo() {}

    public LibraryInfo(String port, String location, String ID) {
        this.setLibraryID(ID);
        this.setLibraryPort(port);
        this.setLibraryLocation(location);
    }

    public String getLibraryPort() {
        return this.libraryPort;
    }

    public void setLibraryPort(String libraryPort) {
        this.libraryPort = libraryPort;
    }

    public String getLibraryLocation() {
            return this.libraryLocation;
        }

    public void setLibraryLocation(String libraryLocation) {
        this.libraryLocation = libraryLocation;
    }
    public String getLibraryID() {
        return this.libraryID;
    }

    public void setLibraryID(String libraryID) {
        this.libraryID = libraryID;
    }
    
}
