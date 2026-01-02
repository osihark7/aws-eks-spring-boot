package com.aws_eks_spring_boot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@GetMapping("/userList")
	public HashMap<Integer, String> getUserList() {
		
		System.out.println("UserController getUserList...");
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		hmap.put(1, "Ram");
		hmap.put(2, "Mohan");
		hmap.put(3, "Gopal");
		hmap.put(4, "Raju");
		hmap.put(5, "Ravi");
		
		System.out.println(hmap);
		
		for(Map.Entry h:hmap.entrySet()) {
			System.out.println(h.getKey() + " : "+ h.getValue());
		}
		return hmap;
		
	}

}
