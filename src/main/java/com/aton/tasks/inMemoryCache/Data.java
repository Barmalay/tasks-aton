package com.aton.tasks.inMemoryCache;

public class Data {
    private long account;
    private String name;
    private double value;

    public Data(long account, String name, double value) {
        this.account = account;
        this.name = name;
        this.value = value;
    }

    public Data(Data data) {
        this.account = data.getAccount();
        this.name = data.getName();
        this.value = data.getValue();
    }

    public long getAccount() {
        return account;
    }

    public void setAccount(long account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Data{" +
                "account=" + account +
                ", name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
