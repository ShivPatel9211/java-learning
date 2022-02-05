package com.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataBase {

    public static List<Customer> getAll() {
        return Stream.of(
                new Customer(101, "john", "john@gmail.com", Arrays.asList(397937955, 21654725)),
                new Customer(102, "smith", "smith@gmail.com", Arrays.asList(89563865, 24872389)),
                new Customer(103, "peter", "peter@gmail.com", Arrays.asList(9463285, 32864872)),
                new Customer(104, "kely", "kely@gmail.com", Arrays.asList(824682936, 9486094))
        ).collect(Collectors.toList());
    }
}