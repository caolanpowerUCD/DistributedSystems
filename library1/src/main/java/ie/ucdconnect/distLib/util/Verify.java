package ie.ucdconnect.distLib.util;

public class Verify {

	public static boolean string(String string) {
		return string != null && string.length() > 0;
	}

	public static boolean id(int id) {
		return id >= 0;
	}

}
