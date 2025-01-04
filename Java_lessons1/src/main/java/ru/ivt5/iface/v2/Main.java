package ru.ivt5.iface.v2;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(0, 0, 10, 20, 0xFF0000);
        System.out.println("Rectangle Area: " + rect.getArea());
        rect.moveRel(5, 5);
        System.out.println("Rectangle New Position: (" + rect.getX() + ", " + rect.getY() + ")");

        Circle circle = new Circle(10, 10, 5, 0x00FF00);
        System.out.println("Circle Area: " + circle.getArea());
        circle.setColor(0x123456);
        System.out.println("Circle Color: " + circle.getColor());
        circle.resize(2);
        System.out.println("Circle New Radius: " + circle.getRadius());
        System.out.println("Circle New Area: " + circle.getArea());
    }
}
