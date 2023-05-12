package com.aton.tasks.inMemoryCache;

import java.util.HashMap;

public class DataMapImpl implements DataMap{
    private final HashMap<Long, Data> keyToAccount = new HashMap<>();
    private final HashMap<String, Data> keyToName = new HashMap<>();
    private final HashMap<Double, Data> keyToValue = new HashMap<>();

    @Override
    public Data put(Data data) {
        keyToAccount.put(data.getAccount(), data);
        keyToName.put(data.getName(), data);
        keyToValue.put(data.getValue(), data);
        return data;
    }

    @Override
    public Data get(long account) {
        Data currentData = keyToAccount.get(account);
        if(currentData==null)
            return null;
        return new Data(currentData);
    }

    @Override
    public Data get(String name) {
        Data currentData = keyToName.get(name);
        if(currentData==null)
            return null;
        return new Data(currentData);
    }

    @Override
    public Data get(double value) {
        Data currentData = keyToValue.get(value);
        if(currentData==null)
            return null;
        return new Data(currentData);
    }

    @Override
    public boolean containsKey(long account) {
        return keyToAccount.containsKey(account);
    }

    @Override
    public boolean containsKey(String name) {
        return keyToName.containsKey(name);
    }

    @Override
    public boolean containsKey(double value) {
        return keyToValue.containsKey(value);
    }

    @Override
    public boolean remove(Data data) {
        if (containsKey(data.getAccount())&&
                containsKey(data.getName())&&
                containsKey(data.getValue())) {
            keyToAccount.remove(data.getAccount());
            keyToName.remove(data.getName());
            keyToValue.remove(data.getValue());
            return true;
        }
        return false;
    }

    @Override
    public boolean set(Data oldData, Data newData) {
        if(!remove(oldData))
            return false;
        return put(newData) != null;
    }
}
