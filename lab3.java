/* In collage 1styear class are having the following attributes ,name of the class(BCA,b.com,b.sc),name of the 
 * staff,number of  students in the class ,array of student in the class.Define a class called first year
 *  , write above attributes  and define suitable constructor also write a method called best student which 
 *  processes 1st year object and return the student name with highest total marks.In  the main method 
 *  define first year objects and find the best student of the class.
 */
import java.util.Scanner;

class FirstYear {
    int marks[], noof_student,j;
    String nameof_pro, student[], staff;

    public FirstYear(){
        Scanner in =new Scanner(System.in);
        Scanner sin=new Scanner(System.in);
        System.out.println("enter the program name:");
        nameof_pro= sin.nextLine();
        System.out .println(" enterteh name of staff:");
        staff=sin.nextLine();
        System.out.print("enter the number of students :");
        noof_student=in.nextInt();
        String student[]=new String[noof_student];
        System.out.println("enter the student name");
        for (int i=0;i<noof_student;i++) {
            student[i] = sin.nextLine();
        }
       int marks[]=new int[noof_student];
        System.out.println("enter the marks of students");
        for(int j=0;j<student.length;j++) {
            marks[j] = in.nextInt();
        }
        
        this.marks=marks;
        this.student=student;
    }
    public String beststudent() {
        int i=0,index=0;
        //System.out.println(j);
        j=marks[0];
        for (i=0;i<noof_student;i++) {
            if(marks[i]>j)
            {
                j=marks[i];
                index=i;
            }

        }
        System.out.println("the highest marks is" +j);
        return student[index];
    }
}
public class MainClass {
    public static void main(String[] args) {
        FirstYear obj1=new FirstYear();
        String name = obj1.beststudent();
        System.out.println(" the student got highest marks is "+name);
    }
}
