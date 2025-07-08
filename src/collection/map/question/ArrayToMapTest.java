package collection.map.question;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};
        Map<String, Integer> productMap = new HashMap<>();
        for (String[] entry : productArr) {
            productMap.put(entry[0],Integer.parseInt(entry[1]));
        }

        for (Map.Entry<String, Integer> entry : productMap.entrySet()) {
            System.out.println("제품 : " + entry.getKey() + ", 가격 : " + entry.getValue());
        }
    }
}