import java.io.*;
import java.util.*;

public class String_Array_Test_HashSet {

	public static void main(String[] args) throws IOException {
		// set은 중복을 허용하지 않고 저장 순서를 유지하지 않음.
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));	
		System.out.print("count number : ");
		int count = Integer.parseInt(b.readLine());
		
		System.out.print("array1 : ");
		String[] str1 = b.readLine().split(" ");
		
		System.out.print("array2 : ");
		String[] str2 = b.readLine().split(" ");
		
		HashSet<String> s1 = new HashSet<String>();
		HashSet<String> s2 = new HashSet<String>();
		for(int i=0;i<count;i++) {
			s1.add(str1[i]);
			s2.add(str2[i]);
		}
		
		// 교집합
		s1.retainAll(s2);
		System.out.println(s1);
		// 차집합
		s1.removeAll(s2);
		System.out.println(s1);
		// 합집합
		s1.addAll(s2);
		System.out.println(s1);
	
	}

}