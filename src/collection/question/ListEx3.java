package collection.question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        List<Integer> integers = new ArrayList<>();
        int sum = 0;

        while (true){
            int input = scanner.nextInt();
            if(input == 0){
                break;
            }else{
                integers.add(input);
            }
        }
        for (Integer integer : integers) {
            sum += integer;
        }
        System.out.println("입력한 정수의 합계 : " + sum);
        System.out.println("입력한 정수의 평균 : " + (double) sum/integers.size());
    }
}
