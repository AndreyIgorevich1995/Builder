package org.example;

import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу ");
        logger.log("Просим пользователя ввести входные данные для списка");
        logger.log("Введите размер списка:");
        int N = scanner.nextInt();  // размер списка
        logger.log("Введите верхнюю границу значений элементов:");
        int M = scanner.nextInt() + 1;  // верхняя граница значений элементов
        logger.log("Создаём и наполняем список");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(random.nextInt(M));
        }
        logger.log("Вот случайный список: " + list.toString());
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        logger.log("Введите порог для фильтра:");
        int f = scanner.nextInt();  // порог для фильтра
        Filter filter = new Filter(f);

        logger.log("Запускаем фильтрацию");
        filter.filterOut(list);
    }
}