package com.demo;
// Upper Bound

class Bound<T extends A>
{
    private T objRef;
    
    public Bound(T obj){
        this.objRef = obj;
    }
    
    public void doRunTest(){
        this.objRef.displayClass();
    }
}
class A
{
    public void displayClass()
    {
        System.out.println("Inside super class A");
    }
}

class B extends A
{
    public void displayClass()
    {
        System.out.println("Inside sub class B");
    }
}

class C extends A
{
    public void displayClass()
    {
        System.out.println("Inside sub class C");
    }
}
class D{
	
}
public class GenericsBound
{
    public static void main(String[] args)
    {
//    	you encounter a compile-time error as D class is not a child class of Class A
//    	Bound<D> bec = new Bound<D>(new D());
//        bec.doRunTest();
    
        Bound<C> bec = new Bound<C>(new C());
        bec.doRunTest();
        
        Bound<B> beb = new Bound<B>(new B());
        beb.doRunTest();
        
        Bound<A> bea = new Bound<A>(new A());
        bea.doRunTest();
    }
}
