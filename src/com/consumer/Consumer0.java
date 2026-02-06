package com.consumer;

import predicateWithFunctional.Employee;

import java.util.Arrays;
import java.util.List;

public class Consumer0 {
   public static void main(String[] args) {
//       Consumer<String> t = x-> System.out.println(x);
//       t.accept("Hello");
       List<Integer> arr = Arrays.asList(12, 20, 34, 45, 120);
       arr.stream().forEach(
               x-> System.out.println(x)
       );
       List<Employee> employees = Arrays.asList(
               new Employee(1, "mike", 4000),
               new Employee(2, "john", 4500),
               new Employee(3, "sam", 4200)
               );
       employees.stream().forEach(
               x-> System.out.println(x.getId() +" "+ x.getName()+" "+x.getSalary())
       );

   }
}
