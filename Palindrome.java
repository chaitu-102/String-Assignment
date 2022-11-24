
public class Palindrome {
	public static void main(String[]args) {
	String a="2552";
	String b="";
	for(int i=a.length()-1;i>=0;i--) {
		b=b+a.charAt(i);
	}
	if(a.equals(b)){
		System.out.println("Given String is Palindrome");
	}
	else {
		System.out.println("Given String is not a Palindrome");
	}
}
}