// program to demonstrate String  and its methods. 
public class StringDemo {

	public static void main(String[] args) {
		String str=new String();
		String str2="bh";
		char[] ch= {'p','r','o','g','r','a','m'};
		String ch1=new String(ch);
		System.out.println("the content ch1 string obj: "+ch1);
		System.out.println("the content ch1 string obj: "+str2);
		System.out.println("is first string obj isEmpty: "+str.isEmpty());
		System.out.println("is str2 string obj isEmpty: "+str2.isEmpty());
		System.out.println("the character at 3 place of String : "+ch1.charAt(3));
		System.out.println("leght of str2 string obj : "+str2.length());
		System.out.println("comparing str2 and ch1: "+str2.compareTo(ch1));
		System.out.println("converting ch1 to lower case: "+ch1.toLowerCase());
		System.out.println("converting ch1 to upper  case: "+ch1.toUpperCase());
		System.out.println("converting to bytes: "+ch1.getBytes());
		System.out.println("concatination of str2 and ch1: "+ch1.concat(str2));
	}
}
