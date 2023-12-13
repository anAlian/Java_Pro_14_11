import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        String[] stringArray = {"str1", "str2", "str3"};
        Integer[] intArray = {1, 3, 7, 6, 9};

        System.out.println(fromArrayToList(stringArray));
        System.out.println(fromArrayToList(intArray));

    }
    public static <T> List<T> fromArrayToList(T[] a) {
        List<T> list = new ArrayList<>(Arrays.asList(a));
        return list;
    }
}
