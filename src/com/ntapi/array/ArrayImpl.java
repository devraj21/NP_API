package com.ntapi.array;

public class ArrayImpl {

	public static void main(String[] args) {
		int array[] = new int[4];
		array[0] = 1;
		array[1] = 2;
		try{
			array[4] = 3;
		}catch (Exception e) {
			System.out.println(e);
		}
		
		for (int i = 0; i< array.length; i++) {
			System.out.println(array[i]);
			
		}

	}

}
