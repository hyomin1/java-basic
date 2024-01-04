package oop1;

public class Rectangle {
    int width;
    int height;

    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return (width + height) * 2;
    }

    boolean isSqaure() {
        return width == height;
    }
}
