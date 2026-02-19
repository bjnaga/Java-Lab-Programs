
class Parent {
    Parent(){
        System.out.println("Parent");
    }
    Parent(int a){
        System.out.println("Parameterized Parent");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("Child line 1");
        super(1);
        System.out.println("Child line 2");

    }
}
class Main{
    public static void main(String[] args){
  new Child();

    }
}
