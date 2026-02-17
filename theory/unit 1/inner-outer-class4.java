//Final example:
class OuterClass {
    int x = 10;

    private class InnerClass1 {
        int y = 20;
    }
    private class InnerClass2 {
        int y = 30;
        void add() {
            InnerClass1 inner = new InnerClass1();
            inner.y = 20;
            System.out.println(inner.y + y);

        }
    }
    void outerMethod() {
        InnerClass2 inner = new InnerClass2();
        inner.add();
    }

}
public class Main {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        //OuterClass.InnerClass myInner = myOuter.new InnerClass(); // error

        //System.out.println(myInner.y + myOuter.x);
        myOuter.outerMethod();

    }
}
