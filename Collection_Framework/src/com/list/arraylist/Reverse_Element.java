package com.list.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse_Element {

	public static ArrayList<Integer> reverseList(ArrayList<Integer> element){
		
		int first = 0;
		int last = element.size()-1;
		while(first < last) {
			Integer temp = element.get(first);
			element.set(first, element.get(last));
			element.set(last, temp);
			first ++;
			last --;
		}
		return element;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<Integer> element = new ArrayList<>();	
		
		for(int i = 0; i < n; i++) {
			element.add(sc.nextInt());
		}
		
		ArrayList<Integer> newArray = reverseList(element);
		
		newArray.forEach(elmt->System.out.print(elmt+" "));
		
		sc.close();

	}

}
