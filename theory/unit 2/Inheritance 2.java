class GrandParent{
    GrandParent(){
        System.out.println("Grand Parent");
    }
}
class Parent extends GrandParent{
    int b=20;
    Parent(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("Child");
    }
    int a=10;
}
class Main{
    public static void main(String[] args){
       System.out.println(new Child());
       System.out.println(new Child());
    }
}
