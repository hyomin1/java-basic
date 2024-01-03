package ref;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder order1 = createOrder("두부", 2000, 2);
        ProductOrder order2 = createOrder("김치", 5000, 1);
        ProductOrder order3 = createOrder("콜라", 1500, 2);

        ProductOrder[] orders = new ProductOrder[]{order1, order2, order3};

        printOrders(orders);
        int totalPrice = getTotalAmount(orders);
        System.out.println("총 결제 금액: " +totalPrice);
    }
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }
    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price +", 수량: " + order.quantity);
        }
    }
    static int getTotalAmount(ProductOrder[] orders) {
        int totalPrice = 0;
        for (ProductOrder order : orders) {
            totalPrice += order.price * order.quantity;
        }
        return  totalPrice;
    }
}
