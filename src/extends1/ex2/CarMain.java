package extends1.ex2;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        // 본인 뿐만 아니라 부모 까지 포함해서 인스턴스 생성
        // 호출하는 변수의 타입(클래스)을 기준으로 선택
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}
