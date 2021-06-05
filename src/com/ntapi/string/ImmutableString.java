package com.ntapi.string;

public class ImmutableString {

	public static void main(String[] args) {
		String str =  "Devraj ";
		str.concat("Singh");
		System.out.println(str);
		str = str.concat("Singh");
		System.out.println(str);
	}

}
