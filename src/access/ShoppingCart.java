package access;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i< itemCount; i++) {
            //Item item = items[i];
            System.out.println("상품명:" + items[i].getName() + ", 합계:" + items[i].getTotalPrice());
        }
        System.out.println("전체 가격 합:" + calculateTotalPrice());
    }


    //전체 가격 합을 따로 메서드로 뽑는것도 좋은 방법이다. 나중에 용도가 있을 수도 있음
    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }


}
