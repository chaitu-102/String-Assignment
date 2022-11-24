import java.util.*;
public class RemoveDuplicates {
		public static void  main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String a=s.nextLine();
		char[]arr=a.toCharArray();
		for(int i=0;i<a.length();i++) {
			for(int j=i+1;j<a.length();j++) {
				if(arr[i]==arr[j]&& arr[i]!=' ') {
					arr[j]='0';
				}
			}
				}
				for(int i=0;i<a.length();i++) {
					if(arr[i]!='0') {
					System.out.print(arr[i]);
				}
				}
	}
}
