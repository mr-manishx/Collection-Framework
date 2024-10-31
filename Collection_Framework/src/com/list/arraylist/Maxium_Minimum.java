package com.list.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Maxium_Minimum {
	
	public static int solveMax(ArrayList<Integer> arr) {
		
		int ans = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i) > ans) {
				ans = arr.get(i);
			}
		}
		
		return ans;
	}
	public static int solveMini(ArrayList<Integer> arr) {
		int ans = Integer.MAX_VALUE;
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i) < ans) {
				ans = arr.get(i);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}
		
		int maxi = solveMax(arr);
		int mini = solveMini(arr);
		
		System.out.println("Max Element: "+maxi);
		System.out.println("Min Element: "+mini);
		
		sc.close();
	}
}
