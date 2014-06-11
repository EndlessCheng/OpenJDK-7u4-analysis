package mjava.io;

import mjava.lang.MString;

public class SimpleOutputStream {

	static {
		System.loadLibrary("SimpleOutputStream");
	}

	public void write(MString msg) {
		write(msg.getValue(), msg.length());
	}

	public static native void write(char[] msg, int len);

	public static void main(String[] args) {
		char[] s = { 'H', 'e', 'l', 'l', 'o' };
		new SimpleOutputStream().write(new MString(s));
	}
}
