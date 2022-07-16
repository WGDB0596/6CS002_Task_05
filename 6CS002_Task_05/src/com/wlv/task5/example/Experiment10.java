package com.wlv.task5.example;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Experiment10 {
	class EFilter implements Predicate<String>{
		public boolean test(String subject) {
			return subject.contains("e");
		}
	}
	public void run() {
		String[] n1= {"Science", "Mathematics", "History"};
		
		List<String> n2 = Arrays.asList(n1);
		
		n2.stream().filter(new EFilter())
		.forEach(subject-> System.out.println(subject));
	}
	public static void main(String[]args) {
		new Experiment10().run();
	}

}
