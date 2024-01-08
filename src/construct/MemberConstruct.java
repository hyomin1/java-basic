package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age) { //생성자 오버로딩 가능
        this(name, age, 50); //밑의 생성자 호출, 코드 첫줄에만 작성 가능
        //생성자 내부에서 다른 생성자 호출, 중복 제거 가능
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" +grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
