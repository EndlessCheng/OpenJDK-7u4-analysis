#include "mjava_io_SimpleOutputStream.h"

#include <cstdio>
#include <clocale>

JNIEXPORT void JNICALL Java_mjava_io_SimpleOutputStream_write (JNIEnv * env, jclass obj, jcharArray s)
{
	setlocale(LC_ALL, "Chinese-simplified"); // <clocale>
	fprintf(stdout, "%s", env->GetCharArrayElements(s, NULL));
}
