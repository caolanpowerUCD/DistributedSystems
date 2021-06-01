package ie.ucdconnect.distLib.core;

public class RequestInfo {
	private String libraryName;
	private String libraryLocation;
	private String libraryID;

	public RequestInfo() {}
	
	public RequestInfo(String libName, String libLocation, String libID) {
		this.setLibraryID(libID);
		this.setLibraryLocation(libLocation);
		this.setLibraryName(libName);
	}
	
	public String getLibraryName() {
		return this.libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
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
