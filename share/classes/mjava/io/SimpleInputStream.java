package mjava.io;

import mjava.lang.MString;

public class SimpleInputStream {

	static {
		System.loadLibrary("SimpleInputStream");
	}

	public native boolean hasnextLine();

	public native char[] readLine();

	public static void run() {

		SimpleInputStream sis = new SimpleInputStream();
		SimpleOutputStream sos = new SimpleOutputStream();

		while (sis.hasnextLine()) {
			char[] s = sis.readLine();
			System.out.println(new String(s));
			
			
			// 下面这行代码总是不显示东西，why？？？
			//sos.write(new MString(s));
			
			
		}

	}
}
