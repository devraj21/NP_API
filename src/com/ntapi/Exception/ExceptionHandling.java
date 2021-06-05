package com.ntapi.Exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a =10;
		int b = 0;
		int result = 0;
		
		String value = null;
		try {
			value.charAt(0);
			result = a / b;
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		catch(NullPointerException npe) {
			System.out.println(npe);
		}
		finally {
			System.out.println("In value");
			
		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		//System.out.println(result);
		
		int c =30;
		int d = 40;
		
		System.out.println(c + d);
 
	}

}
