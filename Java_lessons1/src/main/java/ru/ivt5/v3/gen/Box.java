package ru.ivt5.v3.gen;

import ru.ivt5.iface.HasArea;

public class Box<T> implements HasArea {
    private T content;

    @Override
    public double getArea() {
        return 0;
    }

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public boolean isAreaEqual(Box<?> otherBox) {
        if (otherBox == null || otherBox.getContent() == null) {
            throw new IllegalArgumentException("Other box or its content is null");
        }
        return this.getArea() == otherBox.getArea();
    }


    public static boolean isAreaEqual(Box<?> box1, Box<?> box2) {
        if (box1 == null || box2 == null || box1.getContent() == null || box2.getContent() == null) {
            throw new IllegalArgumentException("Один из Box или их содержимое равно null");
        }
        return box1.getArea() == box2.getArea();
    }
}
