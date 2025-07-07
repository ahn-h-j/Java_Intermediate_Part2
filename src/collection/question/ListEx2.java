package collection.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        List<Integer> integers = new ArrayList<>();
        while (true){
            int input = scanner.nextInt();
            if(input == 0){
                break;
            }else{
                integers.add(input);
            }
        }
        System.out.println("출력");
        System.out.println(integers);
    }
}
