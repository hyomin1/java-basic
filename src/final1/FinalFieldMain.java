package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        //final 필드 - 생성ㅈ ㅏ초기화
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        //final 필드 - 필드 초기화
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit(); //3개 인스턴스 모두 같은 값을 가짐, 메모리 낭비
        FieldInit fieldInit2 = new FieldInit(); // 값을 공유 하므로 static 사용
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        //상수
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);
        System.out.println(FieldInit.CONST_VALUE);
        System.out.println(FieldInit.CONST_VALUE);


    }
}
