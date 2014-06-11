package mjava.io;

//import mjava.lang.MString;

public class SimpleInputStream {

	static {
		System.loadLibrary("SimpleInputStream");
	}

	public native boolean hasnextLine();

	public native String readLine();

	public void Run() {

		SimpleInputStream sis = new SimpleInputStream();
		// SimpleOutputStream sos = new SimpleOutputStream();

		while (sis.hasnextLine()) {
			String s = sis.readLine();
			System.out.println(s);
			// sos.write(sis.readLine());
		}

	}
}
