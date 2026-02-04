import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(10,15,14,20,24,36,42);
        List<String> str = Arrays.asList("radha","hari","madhav","ramakant");
//        Predicate<Integer> i   = x ->x % 2!=0;
//        boolean test = i.test(10);
//        System.out.println(test);
        List<Integer> newArr = arr.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        List<String> newStr = str.stream().filter(x->x.startsWith("m")).collect(Collectors.toList());
        List<String> newStr1 = str.stream().filter(x->x.contains("m")).collect(Collectors.toList());
        List<String> newStr2 = str.stream().filter(x->x.length()>4).collect(Collectors.toList());
        System.out.println(newArr);
        System.out.println(newStr);
        System.out.println(newStr1);
        System.out.println(newStr2);
    }
}