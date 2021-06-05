package com.ntapi.interfaces;

interface A{
	void m1();
}

interface B{
	void m2();
}

public interface C extends A,B{
	void m3();

}
