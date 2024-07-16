package org.example;
import java.util.Arrays;
import java.util.Optional;

public class StreamApiTest {
    public static <T> T ElementBul(T[] array, T element) { // Jenerik metod kurdum ve elemanı bulunca ilgili
        Optional<T> result = Arrays.stream(array)          // konsola yazan, bulamayınca ise -1 yazan bileşenleri yazdım.
                .filter(e -> e.equals(element))
                .findFirst();

        return result.orElse((T) (String) ("-1"));
    }
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Siyah", "Beyaz", "Beşiktaş"};

        System.out.println(ElementBul(intArray, 3));
        System.out.println(ElementBul(intArray, 6));
        System.out.println(ElementBul(strArray, "Beşiktaş"));
        System.out.println(ElementBul(strArray, "Kırmızı"));
    }








}
