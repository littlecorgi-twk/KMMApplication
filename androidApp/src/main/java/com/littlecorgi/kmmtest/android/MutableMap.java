package com.littlecorgi.kmmtest.android;

import java.util.HashMap;
import java.util.Set;

public class MutableMap<K, V> extends HashMap<K, Set<V>> {

    public boolean remove(Object key, Object value) {

        return false;
    }
}
