package org.example;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int f;

    public Filter(int f) {
        this.f = f;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < source.size(); i++) {
            if (source.get(i) > f) {
                logger.log("Элемент \"" + source.get(i) + "\" проходит");
                result.add(source.get(i));
            } else logger.log("Элемент \"" + source.get(i) + "\" не проходит");
        }
        logger.log("Прошло фильтр " + result.size() + " элемента из " + source.size());
        logger.log("Выводим результат на экран");
        logger.log("Отфильтрованный список: " + result.toString());
        logger.log("Завершаем программу");
        return result;
    }
}
