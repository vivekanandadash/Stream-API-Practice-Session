import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(10,15,14,20,24,36,42,20,14);
        List<String> str = Arrays.asList("radha","hari","madhav","ramakant");
//        Predicate<Integer> i   = x ->x % 2!=0;
//        boolean test = i.test(10);
//        System.out.println(test);
        List<Integer> newArr = arr.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        List<String> newStr = str.stream().filter(x->x.startsWith("m")).collect(Collectors.toList());
        List<String> newStr1 = str.stream().filter(x->x.contains("m")).collect(Collectors.toList());
        List<String> newStr2 = str.stream().filter(x->x.length()>4).collect(Collectors.toList());
        List<Integer> newArr1 = arr.stream().map(x->x+10).collect(Collectors.toList());
        List<Integer> newArr2 = arr.stream().filter(x->x%2==0).map(y->y+7).collect(Collectors.toList());
        List<String> newStr3 = str.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
        List<String> newStr4 = str.stream().map(x->x.substring(0,1).toUpperCase()+x.substring(1)).collect(Collectors.toList());
        List<Integer> newArr3 = arr.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<Integer> newArr4 = arr.stream().sorted().collect(Collectors.toList());
        List<Integer> newArr5 = arr.stream().distinct().collect(Collectors.toList());
        List<Integer> newArr6 = arr.stream().distinct().filter(x->x>20).map(x->x+5).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(newArr);
        System.out.println(newStr);
        System.out.println(newStr1);
        System.out.println(newStr2);
        System.out.println(newArr1);
        System.out.println(newArr2);
        System.out.println(newStr3);
        System.out.println(newStr4);
        System.out.println(newArr3);
        System.out.println(newArr4);
        System.out.println(newArr5);
        System.out.println(newArr6);
    }
}