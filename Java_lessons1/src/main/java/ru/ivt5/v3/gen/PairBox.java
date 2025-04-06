package ru.ivt5.v3.gen;

import ru.ivt5.iface.HasArea;

public class PairBox<T extends HasArea> implements HasArea {
    private T first;
    private T second;

    public PairBox(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getContentFirst() {
        return first;
    }

    public T getContentSecond() {
        return second;
    }

    public void setContentFirst(T first) {
        this.first = first;
    }

    public void setContentSecond(T second) {
        this.second = second;
    }

    @Override
    public double getArea() {
        if (first == null || second == null) {
            throw new IllegalStateException("One of the contents is not set");
        }
        return first.getArea() + second.getArea();
    }

    public boolean isAreaEqual(PairBox<?> otherBox) {
        if (otherBox == null || otherBox.getContentFirst() == null || otherBox.getContentSecond() == null) {
            throw new IllegalArgumentException("Other box or its content is null");
        }
        return this.getArea() == otherBox.getArea();
    }

    public static boolean isAreaEqual(PairBox<?> box1, PairBox<?> box2) {
        if (box1 == null || box2 == null || box1.getContentFirst() == null || box2.getContentFirst() == null) {
            throw new IllegalArgumentException("One of the boxes or their content is null");
        }
        return box1.getArea() == box2.getArea();
    }
}
