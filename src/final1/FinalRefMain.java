package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); //참조값 변경 불가능, 다른 객체 참조 불가능
        //data = new Data();

        //참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);

        // 참조형 변수에 final이 붙으면 참조 대상 자체를 다른 대상으로 변경 x
        // 참조하는 대상의 값은 변경 가능
    }
}
