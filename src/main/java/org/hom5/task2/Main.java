package org.hom5.task2;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String[] textArray = {
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"
        };

        Map<String, Integer> map = new HashMap<>();
        String[] name;
        for (int i = 0; i < textArray.length; i++) {
            name = textArray[i].split(" ");
            map.putIfAbsent(name[0], 0);
            map.put(name[0], map.get(name[0]) + 1);
        }
        map.entrySet().removeIf(entry -> entry.getValue().equals(1));
        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}