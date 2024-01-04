package oop1;

public class RectangleOopMain {

    public static void main(String[] args) {

        Rectangle rtc = new Rectangle();
        rtc.width = 5;
        rtc.height = 8;
        int area = rtc.calculateArea();
        System.out.println("넓이: " + area);

        int perimeter = rtc.calculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);

        boolean isSquare = rtc.isSqaure();
        System.out.println("정사각형 여부: " + isSquare);


    }
}
