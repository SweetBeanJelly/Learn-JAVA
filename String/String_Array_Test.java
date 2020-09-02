import java.io.*;
import java.util.*;

public class String_Array_Test {
	
	static Stack<String> st = null; 
	static String[] string_array ;

	public static void main(String[] args) throws IOException {
		// 배열의 길이 다를 때
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

		String[] check = {"A","B","C","D","E"}; // 기준
		
		string_array = b.readLine().split(" ");
		
		combination(5, 2, 0);
	}
	
	public static void combination(int n, int r, int index) {
		if(r==0) {
			show();
	        return;
		} else if(n==r) {
			for(int i=0;i<n;i++) {
				st.add(string_array[index+i]);
			}
			show();
			for(int i=0;i<n;i++) {
				st.pop();
			}
		} else {
			st.add(string_array[index]);
			combination(n-1,r-1,index+1);
			combination(n-1, r, index+1);
		}
	}
	
	public static void show() {
		for(int i=0;i<st.size();i++){
            System.out.print(st.get(i)+" ");
        }
        System.out.println("");
	}

}