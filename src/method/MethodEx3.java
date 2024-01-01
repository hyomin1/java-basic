package method;

public class MethodEx3 {
    public static void main(String[] args) {
        int balance = 10000;
        int depositAmount = 1000;
        int withdrawAmount = 2000;

        balance = deposit(balance, depositAmount);


        balance = withdraw(balance, withdrawAmount);


        System.out.println("최종 잔액: " + balance + "원");
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;

    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -=amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance +"원");
        }
        else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }

        return balance;
    }
}
