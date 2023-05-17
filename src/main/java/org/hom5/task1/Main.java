package org.hom5.task1;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String text = "Россия идет вперед всей планеты. Планета - это не Россия.";
        String[] textArray = text.replaceAll("\\p{Punct}", "")
                .replaceAll("\\s+", " ").split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < textArray.length; i++) {
            map.putIfAbsent(textArray[i], 0);
            map.put(textArray[i], map.get(textArray[i]) + 1);
        }

        System.out.print("Запрос: ");
        Scanner sc = new Scanner(System.in);
        String request = sc.next();
        System.out.println("Ответ: " + request + " = " + map.get(request));
    }
}
