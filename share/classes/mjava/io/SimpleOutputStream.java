package mjava.io;

import mjava.lang.MString;

public class SimpleOutputStream {

	static {
		System.loadLibrary("SimpleOutputStream");
	}

	public void write(MString msg) {
		write(msg.getValue());
	}

	public native void write(char[] msg);

	public static void run() {
		char[] s = { 'H', 'e', 'l', 'l', 'o' };
		new SimpleOutputStream().write(new MString(s));
	}
}
