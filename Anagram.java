import java.util.*;
public class Anagram {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of String a:");
		String a=s.nextLine();
		String c="";
		System.out.println("Enter the value of String b:");
		String b=s.nextLine();
		String d="";
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>='A' && a.charAt(i)<='Z') {
			c=c+(char)(a.charAt(i)+32);
			}
			else {
				c=c+a.charAt(i);
			}
		}
		for(int i=0;i<b.length();i++) {
			if(b.charAt(i)>='A' && b.charAt(i)<='Z') {
			d=d+(char)(b.charAt(i)+32);
			}
			else {
				d=d+b.charAt(i);
			}
		}
		char[]arr=c.toCharArray();
		char[]arr1=d.toCharArray();
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				if(arr[j]<arr[j-1]){
				char temp=arr[j];
				 arr[j]=arr[j-1];
				arr[j-1]=temp;
				}
			}
		}
		System.out.println(arr);
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=1;j<arr1.length;j++) {
				if(arr1[j]<arr1[j-1]) {
				char temp=arr1[j];
				arr1[j]=arr1[j-1];
				arr1[j-1]=temp;
				}
			}
		}
		System.out.println(arr1);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==arr1[i]) {
				count++;
			}
			
		}
		if(count==arr.length) {
		System.out.println("It is a Anagram");
		}
		else {
			System.out.println("It is not a Anagram");
		}
	}
}
