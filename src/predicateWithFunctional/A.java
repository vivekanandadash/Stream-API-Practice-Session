package predicateWithFunctional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A {
 public static void main(String[] args){
     List<Employee> arr = Arrays.asList(
             new Employee(1, "mike", 5000),
             new Employee(2, "john", 15000),
             new Employee(3, "sam", 20000)

     );
     List<Employee> newArr = arr.stream().filter(x -> x.getSalary()>5000).collect(Collectors.toList());
     List<String> newArr1 = arr.stream().map(e -> e.getName().substring(0,1).toUpperCase()+e.getName().substring(1)).collect(Collectors.toList());
     for (Employee emp: newArr){
         System.out.println(emp.getId());
         System.out.println(emp.getName());
         System.out.println(emp.getSalary());
     }
     System.out.println(newArr);
     System.out.println(newArr1);

 }
}
