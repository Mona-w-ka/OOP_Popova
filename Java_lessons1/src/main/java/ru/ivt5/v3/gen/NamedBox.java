package ru.ivt5.v3.gen;

public class NamedBox<T> extends Box<T> {
    private String name;
    public NamedBox(String name, T content) {
        super(content);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
