import java.util.*;
public class UniqueString {
		public static void  main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String a=s.nextLine();
		char[]arr=a.toCharArray();
		int count;
		for(int i=0;i<a.length();i++) {
			count=1;
			for(int j=i+1;j<a.length();j++) {
				if(arr[i]==arr[j]&& arr[i]!=' ') {
					count++;
					arr[j]='0';
				}
			}
					if(count==1 && arr[i]!='0' && arr[i]!=' ') {
						System.out.println("Unique characters are:");
						System.out.println(arr[i]+" ");
				}
				
		}
	}
	}


