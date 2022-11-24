import java.util.*;
public class Pangram {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String value:");
		String a=s.nextLine();
		a=a.replace(" ","");
		boolean k=false;
		char[]arr=a.toCharArray();
		int[]arr1=new int[26];
		for(int i=0;i<arr1.length;i++) {
				int index=arr[i]-65;
				arr1[i]++;
				
		}
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]==0) {
				System.out.println("It is not a Pangram");
				k=true;
			}
			
		}
		if(k==false) {
			System.out.println("It is a Pangram");
		}
		
		}

}
