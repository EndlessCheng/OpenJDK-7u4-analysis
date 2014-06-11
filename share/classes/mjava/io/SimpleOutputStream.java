package mjava.io;

import mjava.lang.MString;

public class SimpleOutputStream {

	static {
		System.loadLibrary("SimpleOutputStream");
	}

	public static native void write(MString msg);

	public static void main(String[] args) {
		char[] s = { 'H', 'e', 'l', 'l', 'o' };
		write(new MString(s));
	}
}
