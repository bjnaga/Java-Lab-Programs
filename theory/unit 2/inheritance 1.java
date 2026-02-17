class Parent{// parent class
 protected int a=10;
 public   int b=20;
 private int c=30;
 void addParent(){
     System.out.println(a+b+c);
 }
}
class Child extends Parent{// sub-class inheriting parent class
 protected int d=40;
 public int e=50;
 private int f=60;
 void addChild(){System.out.println(a+b+d+e+f);}
}
class Main{
    public static void main(String[] args){
        Parent p=new Parent();
        p.addParent();
        Child c=new Child();
        c.addParent();
        c.addChild();
    }
}
