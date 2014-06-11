package mjava.lang;

public final class MString {
	/** 我们需要一个存储空间 */
	private final char[] value;

	/** 保存字符串长度，一经初始化便不会改变 */
	private final int count;

	public MString() {

		// http://docs.oracle.com/javase/specs/jvms/se7/html/jvms-6.html#jvms-6.5.newarray
		this.value = new char[0];
		this.count = 0;
	}

	public MString(char[] value) {
		this.value = value;

		// Java有专门的字节码arraylength来获取数组的长度
		// 见http://docs.oracle.com/javase/specs/jvms/se7/html/jvms-6.html#jvms-6.5.arraylength
		int size = value.length;
		this.count = size;
	}

	public char[] getValue() {
		return value;
	}

	public int length() {
		return count;
	}
}
