package com.list.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Create_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		List<String> fruitsList = new ArrayList<String>(n);
		
		for(int i = 0; i < n; i++) {
			fruitsList.add(sc.next());
		}
		// print all item
		
		fruitsList.forEach((item)->System.out.print(item+" "));
		
		System.out.println();
		
		// some methods in string
		
		// find last item
		System.out.println("Last Item in List: "+fruitsList.getLast());
		
		// find the first item in list
		System.out.println("First item in list: "+fruitsList.getFirst());
		
		// find the size of list
		System.out.println("Size of list: "+fruitsList.size());
		
		// find element with specified position
		System.out.println("Item at index: "+fruitsList.get(3));
		
		// check list is empty or not
		System.out.println("List is empty: "+fruitsList.isEmpty());
		
		// check specific item exist or not
		System.out.println("Is item available: "+fruitsList.contains("Chilli"));
		
		// Reversed the item 
		List<String> newList = fruitsList.reversed();
		System.out.println(newList);
		
		// remove item at specific index
		System.out.println("Remove item at index: "+newList.remove(3));
		
		// replace item at specific index
		newList.set(0, "Angur");
		newList.forEach((item)->System.out.print(item+" "));
		System.out.println();
		
		// add at specific index
		newList.add(0, "Grapes");
		newList.forEach(item->System.out.print(item+" "));
		System.out.println();
	
		// sublist from index to  to index
		List<String> newSublist = newList.subList(0, 3);
		newSublist.forEach(item->System.out.print(item+" : "+item.length()+"\n"));
		
		// toUpperCase 
		newList.forEach(item->System.out.print(item.toUpperCase()+" "));
		System.out.println();
		
		// toLowerCase
		newList.forEach(item->System.out.print(item.toLowerCase()+" "));
		System.out.println();
		
		// sort item
		newList.sort(String::compareTo);
		System.out.println(newList);
		
		// find index of item 
		System.out.println(newList.indexOf("Angur"));
		
		sc.close();
	}

}
