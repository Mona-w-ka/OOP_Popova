package ru.ivt5.v3;

public interface Movable {
    default void moveTo(int x, int y) {
        moveRel(x - getX(), y - getY());
    }

    void moveRel(int dx, int dy);
    int getX();
    int getY();
}
