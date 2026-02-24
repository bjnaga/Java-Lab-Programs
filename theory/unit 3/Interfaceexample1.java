package com.interfaceEx.example;

interface Graduates{
	void intelligence() ;
	int x=10;
}


class Mahi implements Graduates{

	public void intelligence() {
		System.out.println("Im intelligent");
	}
	public static void main(String[] args) {
		Graduates obji=new Mahi();// accessing interface to interface reference
		obji.intelligence();	
		System.out.println(obji.x);
		Mahi obj=new Mahi();
		obj.intelligence();	
	}

}
