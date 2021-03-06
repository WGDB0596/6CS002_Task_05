package com.wlv.task5.hokey;

//Streams will use the same functional programming concepts to iterate over collections of data in the functional style.

import java.util.Arrays;
import java.util.List;

public class Hockey05 {

	  public static void main(String[] args) {
		  List<clubHockey> table = Arrays.asList(
		    		new clubHockey(1,2008020001,"T.B","AWAY","Team Level","other",0,0,0,0,0,0,0,0,0,0,0,1,0),
		    		new clubHockey(2,2008020010,"CHI","HOME","Team Level","other",0,0,0,0,0,0,0,0,0,0,0,2,1),
		    		new clubHockey(3,2008020019,"PHI","AWAY","Team Level","other",3,0,0,1,0,0,1,0,0,0,1,2,2),
		    		new clubHockey(4,2008020034,"N.J","HOME","Team Level","other",9,0,1,4,1,0,1,0,0,1,2,5,5),
		    		new clubHockey(5,2008020044,"BUF","HOME","Team Level","other",9,0,4,7,0,0,1,0,1,1,3,1,1),
		    		new clubHockey(6,2008020057,"TOR","HOME","Team Level","other",18,2,2,10,0,0,2,0,4,2,6,2,1),
		    		new clubHockey(7,2008020070,"DET","AWAY","Team Level","other",0,0,0,0,0,0,0,0,0,0,0,0,3),
		    		new clubHockey(8,2008020079,"DAL","HOME","Team Level","other",9,0,2,5,0,0,2,0,0,1,3,1,1),
		    		new clubHockey(9,2008020101,"CBJ","AWAY","Team Level","other",15,2,1,8,1,1,0,0,3,2,4,1,0),
		    		new clubHockey(10,2008020109,"PIT","HOME","Team Level","other",30,0,2,12,1,0,3,1,3,2,9,0,4),
		    		new clubHockey(11,2008020121,"NYI","AWAY","Team Level","other",18,2,3,11,2,1,3,1,1,0,4,0,2),
		    		new clubHockey(12,2008020137,"ATL","HOME","Team Level","other",3,2,1,4,0,0,0,0,2,1,1,1,0));
		  
	    System.out.println("Sorted by Comparator in Club class");
	    table.stream().sorted().forEach(System.out::println);

	    System.out.println();
	    System.out.println("Sorted by lambda");
	    table.stream()
	         .sorted((c1, c2) -> 
	            ((Integer) c1.getShotAttemptsFor()).compareTo(c2.getShotAttemptsFor()))
	         .forEach(System.out::println);

	  }

	}
