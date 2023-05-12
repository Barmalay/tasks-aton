package com.aton.tasks.inMemoryCache;

public interface DataMap {
    Data put(Data data);
    Data get(long account);
    Data get(String name);
    Data get(double value);
    boolean containsKey(long account);
    boolean containsKey(String name);
    boolean containsKey(double value);
    boolean remove(Data data);
    boolean set(Data oldData, Data data);
}
