package collection.map.question;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        // 코드 작성
        Map<String, Integer> result = new HashMap<>();
        String[] textArray = text.split(" ");
        for (String string : textArray) {
            result.put(string,result.getOrDefault(string,0) + 1);
        }
        System.out.println(result);
    }
}
