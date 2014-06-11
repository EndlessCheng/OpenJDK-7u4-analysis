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
		System.out.println(new String(s));
		
		// 下面这行代码总是不显示东西，why？
		//new SimpleOutputStream().write(new MString(s)); 
		
		
	}
}
