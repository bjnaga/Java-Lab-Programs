package com.interfaceEx.example;




abstract class Mahi {
	public interface Graduates{ // nested interface ,and it can be either public, private or protected
		void intelligence() ;
		int x=10;
	}
	public static void main(String[] args) {
		
	}
}
class Demo implements Mahi.Graduates{
public void intelligence() {
		System.out.println("Im intelligent");
	}
}
