package com.ntapi.assignment;
//with different type of data type
public class OverLoadMainMethod {
	public static void main(int a) {
		System.out.println("Integer main: "+ a);
	}
	public static void main(float f) {
		System.out.println("Float main: "+ f);
	}

	public static void main(String[] args) {
		main(5.5f);
		main(5);

	}

}
