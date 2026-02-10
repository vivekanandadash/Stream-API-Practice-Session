package com.mapping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class A {
    public static void main(String[] args) {
        List<Employee> arr = Arrays.asList(

                new Employee(1, "mike", 50000),
                new Employee(2, "john", 74500),
                new Employee(3, "alice", 79500)
        );
        Map<Integer, List<Employee>> newArr = arr.stream().collect(Collectors.groupingBy(e -> e.getSalary()));
        System.out.println(newArr);

    }
}
