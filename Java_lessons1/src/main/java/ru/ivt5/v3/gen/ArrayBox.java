package ru.ivt5.v3.gen;

public class ArrayBox<T> {
    private T[] content;

    public ArrayBox(T[] content) {
        this.content = content;
    }

    public T[] getContent() {
        return content;
    }

    public void setContent(T[] content) {
        this.content = content;
    }

    public T getElement(int index) {
        if (index < 0 || index >= content.length) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        return content[index];
    }

    public void setElement(int index, T element) {
        if (index < 0 || index >= content.length) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        content[index] = element;
    }

    public boolean isSameSize(ArrayBox<?> otherBox) {
        if (otherBox == null || otherBox.getContent() == null) {
            throw new IllegalArgumentException("Other box or its content is null");
        }
        return this.content.length == otherBox.getContent().length;
    }
}

