package com.wlv.task5.novel;

import java.io.*;

public class novel_File01 {

	public static void main(String[] args) throws Exception 
	{
		BufferedReader r = new BufferedReader(new FileReader("data/Hell fer Sartain.txt"));
		
		// Reading Line by Line
		r.lines().forEach(l -> System.out.println(l));   
		
		// Closing the Buffer Reader
		r.close(); 
		
	}

}
