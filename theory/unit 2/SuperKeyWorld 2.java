class Parent {
int a=10;
}
class Child extends Parent{
int a=20;
void show(){
    System.out.println(" added value is "+(this.a+super.a));
}
}
class Main{
    public static void main(String[] args){
  Child child=new Child();
 child.show();
    }
}
