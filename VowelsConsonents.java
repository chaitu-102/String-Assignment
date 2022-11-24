import java.util.*;
public class VowelsConsonents {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String a=s.nextLine();
		a.replace(" ", "");
		String b="";
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='A'&& a.charAt(i)=='Z') {
				b=b+(char)(a.charAt(i)+32);
			}
			else {
				b=b+a.charAt(i);
			}
		}
		System.out.println(b);
		int count=0;
		int count1=0;
		int count2=0;
		for(int i=0;i<b.length();i++) {
			if(b.charAt(i)=='a'||b.charAt(i)=='e'||b.charAt(i)=='i'||b.charAt(i)=='o'||b.charAt(i)=='u') {
				count++;
			}
			else if((int)b.charAt(i)>=65 & (int)b.charAt(i)<=122) {
				count1++;
				
			}
			else {
				count2++;
			}
		
	}
		System.out.println("Number of vowels found are:"+count);
		System.out.println("Number of consonants found are:"+count1);
		System.out.println("Number of special found are:"+count2);
	}

}
