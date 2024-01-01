package method;

public class MethodValue2 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. changeNumber 호출 전, number: " + number);
        changeNumber(number);  //num1의 값을 복사해서 num2에 전달
        System.out.println("4. changeNumber 호출 후, number: " + number);

    }
    public static void changeNumber(int number) {
        // main의 number 와 changeNumber의 number는 변수명만 같고 다른 변수임
        System.out.println("2. changeNumber 변경 전, number: "+ number);
        number = number * 2;
        System.out.println("3. changeNumber 변경 후, number: " + number);
    }
}
