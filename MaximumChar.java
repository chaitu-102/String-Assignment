import java.util.Scanner;
public class MaximumChar {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String value:");
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
		char[]arr=b.toCharArray();
		System.out.println("Enter the size of array:");
	    int  n=s.nextInt();
		int []arr1=new int[n];
		int big=arr1[0];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					arr[j]='0';
					arr1[i]++;
				}
			}
		}
		for(int k=0;k<arr1.length;k++) {
			if(arr1[k]>big && arr[k]!='0') {
				big=arr1[k];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr1[i]==big && arr[i]!='0') {
		System.out.println("Maximum Character in String is:"+arr[i]);
		}
	}
}
}