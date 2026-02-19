class Parent {
void show() {
System.out.println("Parent show");
}
}
class Child extends Parent{
    @Override
void show() {
    System.out.println("Child show");
}
}
class Main{
    public static void main(String[] args){
        Child child=new Child();
        child.show();
        Parent p=new Parent();
        p.show();
    }
}
