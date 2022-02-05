package com.map;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer> customer=DataBase.getAll();
		List<String> email=customer.stream()
				.map(c->c.getEmail())
				.collect(Collectors.toList());
		System.out.println(email);
		
		List<Integer> phone=customer.stream()
				.flatMap(c->c.getPhone().stream())
				.collect(Collectors.toList());
		System.out.println(phone);
		List<String> name=customer.stream()
				.map(c->c.getName())
				.collect(Collectors.toList());
		System.out.println(name);
	}
}
