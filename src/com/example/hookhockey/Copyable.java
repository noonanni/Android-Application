package com.example.hookhockey;

public interface Copyable<T> {
    T copy ();
    T createForCopy ();
    void copyTo (T dest);
}
