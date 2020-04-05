package lesson3.HomeWork;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Comparator;

public class CountWords {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Сегодня");
        arrayList.add("солнышко");
        arrayList.add("печёт");
        arrayList.add("Сегодня");
        arrayList.add("праздник");
        arrayList.add("Май");
        arrayList.add("Влезай");
        arrayList.add("сынишка");
        arrayList.add("плечо");
        arrayList.add("флаг");
        arrayList.add("свой");
        arrayList.add("поднимай");
        arrayList.add("Сегодня");
        arrayList.add("печёт");

        String[] arr = new String[arrayList.size()];
        arrayList.toArray(arr);

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        map.entrySet()
                .stream()
                .sorted(Comparator.comparingInt(o -> -o.getValue()))
                .forEach(pair -> System.out.println(pair.getKey() + " : " + pair.getValue()));
    }
}
