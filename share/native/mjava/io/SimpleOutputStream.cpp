#include "mjava_io_SimpleOutputStream.h"

#include <clocale>
#include <cwchar>

JNIEXPORT void JNICALL Java_mjava_io_SimpleOutputStream_write(JNIEnv * env, jclass obj, jstring jMsg)
{
    setlocale(LC_ALL, "Chinese-simplified"); // <clocale>
    fputws((wchar_t*)env->GetStringChars(jMsg, NULL), stdout); // <cwchar>
}
