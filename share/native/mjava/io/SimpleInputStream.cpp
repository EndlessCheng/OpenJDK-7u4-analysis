#include "mjava_io_SimpleInputStream.h"

#include <clocale>
#include <cwchar>

const int SZ = 1024;

JNIEXPORT jboolean JNICALL Java_mjava_io_SimpleInputStream_hasnextLine (JNIEnv * env, jobject obj)
{
	setlocale(LC_ALL, "Chinese-simplified"); // <clocale>

	wchar_t ch = getwchar();
	if(ch == WEOF) return 0; // 不要用EOF
	//if(ch == L'E') return 0; // 测试：读到E开头的字符串就退出

	ungetwc(ch, stdin);
	return 1;
}

JNIEXPORT jcharArray JNICALL Java_mjava_io_SimpleInputStream_readLine (JNIEnv * env, jobject obj)
{
	setlocale(LC_ALL, "Chinese-simplified"); // <clocale>

	wchar_t ws[SZ];
	fgetws(ws, SZ, stdin);
	jsize len = wcslen(ws);

	jcharArray jcArr = env->NewCharArray(len); // 初始化jcharArray，这一步是必须的
	env->SetCharArrayRegion(jcArr, 0, len, (jchar*)ws);

	return jcArr;
}
