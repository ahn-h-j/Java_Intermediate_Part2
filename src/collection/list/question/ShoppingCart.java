package collection.list.question;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> itemCart = new ArrayList<>();
    public void addItem(Item item) {
        itemCart.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        int sum = 0;
        for (Item item : itemCart) {
            sum += item.getTotalPrice();
            System.out.println("상품명 : " + item.getName() + ", 합계 : " + item.getTotalPrice());
        }
        System.out.println("전체 가격 합 : " + sum);
    }
}
