package com.demo;
import java.util.Scanner;
class Test <T,S>{
	T a;
	S b;
	Test(T a,S b){
		this.a=a;
		this.b=b;
	}
	T displayA() {
		return a;
	}
	S displayB() {
		return b;
	}
}

public class GenericClassExampleForTwoTerms {
	public static void main(String[] args)
    {
        Test<Integer,String> obj=new Test<Integer,String>(42,"I live BCA");
        System.out.println(obj.displayA());
        System.out.println(obj.displayB());
        Test<String,String> obj1=new Test<String,String>("I love BCA","I love Java");
        System.out.println(obj1.displayA());
        System.out.println(obj1.displayB());
    }
}
