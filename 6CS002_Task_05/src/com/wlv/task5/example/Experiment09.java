package com.wlv.task5.example;
import java.util.Arrays;
import java.util.List;

public class Experiment09 {
	public void run() {
		String[] n1= {"Kevan", "John", "matthew"};
		List<String> n2 = Arrays.asList(n1);
		
		n2.stream().filter(name->name.contains("e"))
		.forEach(name-> System.out.println(name));
	}
	public static void main(String[]args) {
		new Experiment09().run();
	}

}
