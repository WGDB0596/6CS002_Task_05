package com.wlv.task5.example;
import java.util.*;
import java.util.function.Consumer; 
public class Experiment07 { 
public void run() { 
String[] n1={"Science", "Mathematics", "History"};

List<String> n2=Arrays.asList(n1);

n2.forEach(new Consumer<String>() {
	public void accept(String str) { 
		System. out. println(str); 
	}
});
};

	


public static void main(String[]args) { 
new Experiment07().run(); 
}

}
 
