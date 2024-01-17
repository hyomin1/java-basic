package extends1.overriding;

public class ElectricCar extends Car {

    //메서드 오버라이딩
    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }
    public void charge() {
        System.out.println("충전합니다.");
    }


    //메서드 오버로딩 : 메서드 이름이 같고 매개변수가 다른 메서드 여러개 정의
    //메서드 오버라이딩 : 하위 클래스에서 상위 클래스의 메서드를 재정의하는 과정
}
