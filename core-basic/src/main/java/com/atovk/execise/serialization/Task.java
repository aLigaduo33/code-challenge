package com.atovk.execise.serialization;

import java.io.Serializable;

public abstract class Task implements Serializable {

    public void run() {
        throw new RuntimeException("not implement!");
    }
}
