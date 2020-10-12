package PractiseandHomework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class higestValue {

	public static void main(String[] args) {
		List <Integer> listOfNumbers = new ArrayList <Integer>();
		listOfNumbers.add(9);
		listOfNumbers.add(12);
		listOfNumbers.add(58);
		listOfNumbers.add(94);
		listOfNumbers.add(5);
		listOfNumbers.add(18);
		
		Collections.sort(listOfNumbers);
		System.out.println(listOfNumbers);
		System.out.println("Higest value on the list is" + listOfNumbers.get(listOfNumbers.size()-1));
		
		

	}

}
