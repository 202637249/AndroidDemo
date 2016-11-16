package com.lzq.ndkdemo.ndk;

/**
 * Created by Dell on 2016/11/16 0016.
 */
public class Load {

    static {
        System.loadLibrary("com_lzq_ndkdemo_ndk_Load");
    }

    public native  int addInt(int a , int b);

    public  native  String getNdk();
}
