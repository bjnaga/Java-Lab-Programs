Sample code: Access Outer Class From Inner Class


class OuterClass {
  int x = 10;

  class InnerClass {
    int y = 20;
    void add(){
        System.out.println(x+y);
    }
  }
}

public class Main {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    myInner.add();    
  }
}
