/* 
    Write a program with class variable that is available for all instance
    of a class use static variable declaration observe the changes that occurs
    in the program
*/

public class Diff
{
    public static int a;
    public int b;
}

class Main{
    public static void main(String[] args) {
        Diff.a = 12;
        Diff obj = new Diff();
        obj.b = 13;
        System.out.println("value of static variable is "+Diff.a);
        System.out.println("value of non static variable is "+obj.b);
    }
}
