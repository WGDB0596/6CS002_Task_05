package com.wlv.task5.example;
import java.util.Arrays;
import java.util.List;

public class Experiment09 {
	public void run() {
		String[] n1= {"Science", "Mathematics", "History"};
		List<String> n2 = Arrays.asList(n1);
		
		n2.stream().filter(subject->subject.contains("e"))
		.forEach(subject-> System.out.println(subject));
	}
	public static void main(String[]args) {
		new Experiment09().run();
	}

}
