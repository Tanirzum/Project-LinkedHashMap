import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<Double, Student> studentMap = new LinkedHashMap<>();

        Student tanirbergen = new Student("Tanirbergen", "Zamanbek", 3);
        Student zhanibek = new Student("Zhanibek", "Amanbek", 2);
        Student aman = new Student("Aman", "Bakhytbek", 5);
        Student almas = new Student("Almas", "Bakhytbek", 1);

        studentMap.put(1.2, tanirbergen);
        studentMap.put(1.3, zhanibek);
        studentMap.put(1.4, aman);
        studentMap.put(1.5, almas);

        System.out.println(studentMap.get(1.2));
        System.out.println(studentMap.get(1.5));
        //метод get возвращает элемент как в LinkedList по цепочкам

        System.out.println();

        for (Map.Entry<Double, Student> element : studentMap.entrySet()) {
            System.out.println(element);
        }
    }
}
