package mjava.io;

public class SimpleOutputStream {

	static {
		System.loadLibrary("SimpleOutputStream");
	}

	public static native void write(String msg);

	public static void main(String[] args) {
		write("Hello, 简单输出流!");
	}
}
