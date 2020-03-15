package com.usbaitass.greetgo.demotest.model;


public class Data {
    private Long id;
    private String value;

    public Data() {
        super();
    }

    public Data(Long id, String value) {
        super();
        this.id = id;
        this.value = value;
    }

    public Data(String value) {
        super();
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("Data [id=%s, value=%s]", id, value);
    }
}
