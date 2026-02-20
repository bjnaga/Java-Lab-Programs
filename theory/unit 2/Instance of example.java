class GrandParent{
    void show(){
        System.out.println("GrandParent");
    }
}
class Parent extends GrandParent {
void show() {
System.out.println("Parent show");
}
}
class Child extends Parent{
void show() {
    System.out.println("Child show");
}
}
class Main{
    public static void main(String[] args){

       GrandParent grandParent;
       grandParent=new Child();

        System.out.println(grandParent instanceof Parent);

        grandParent=new Parent();

        System.out.println(grandParent instanceof Parent);

        grandParent=new GrandParent();

       System.out.println(grandParent instanceof Parent);


    }
}
