#include "mjava_io_SimpleOutputStream.h"

#include <cstdio>
#include <clocale>

JNIEXPORT void JNICALL Java_mjava_io_SimpleOutputStream_write (JNIEnv * env, jclass obj, jcharArray s)
{
	setlocale(LC_ALL, "Chinese-simplified"); // <clocale>
	fwprintf(stdout, L"%ls", (wchar_t*)env->GetCharArrayElements(s, NULL));
}
