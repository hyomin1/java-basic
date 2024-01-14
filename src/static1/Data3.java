package static1;

public class Data3 {
    public String name; //인스턴스 변수
    public static int count; //static, 공용으로 함께 사용하는 변수
    //static변수, 정적 변수, 클래스 변수

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
