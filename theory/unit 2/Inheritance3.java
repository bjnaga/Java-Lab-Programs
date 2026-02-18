
class Parent  {// parent class
    int a=10;
    Parent() {
        System.out.println("Parent");
    }
    Parent(int a){
        System.out.println("Parent parameterized constructor");
    }

}
class Child extends Parent{// sub-class inheriting parent class
  int a=20;
    Child(){
      super(0);// or if we dont add super(0) default constructor of
        // parent is called
        System.out.println("parent date"+super.a);
      System.out.println("Child data"+this.a);
  }
}
class Main{ public static void main(String[] args){
        Child c=new Child();
    }
}
