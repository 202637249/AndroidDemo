//
// Created by Dell on 2016/11/16 0016.
//

#include "com_lzq_ndkdemo_ndk_Load.h"

/*
 * Class:     com_lzq_ndkdemo_ndk_Load
 * Method:    addInt
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_com_lzq_ndkdemo_ndk_Load_addInt
  (JNIEnv *env, jobject obj, jint a, jint b){
  return a + b;
  };

/*
 * Class:     com_lzq_ndkdemo_ndk_Load
 * Method:    getNdk
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_lzq_ndkdemo_ndk_Load_getNdk
  (JNIEnv *env, jobject obj){
    return  (*env)->NewStringUTF(env, "Hello from JNI !");
   };
