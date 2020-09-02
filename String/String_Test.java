import java.io.*;
import java.util.*;

public class String_Test {

	public static void main(String[] args) throws IOException {
		
		Scanner s = new Scanner(System.in);
		String[] str = s.nextLine().split(" ");
		
		for(int i=0;i<str.length;i++) {
			System.out.println(StringFirstUpper(str[i]));
		}
		
		/* // BufferedReader가 Scaanner보다 속도가 빠름
		
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));	
		// StringTokenizer 구분자와 구분자 사이에 데이터가 없다면 하나의 요소로 인정하지 않음
		StringTokenizer string_Token = new StringTokenizer(b.readLine(), " ");
		while (string_Token.hasMoreTokens()) {
			System.out.println(string_Token.nextToken());
		}
		
		*/
		/* // split() 구분자와 구분자 사이에 데이터가 없어도 하나의 요소로 인정
		 
		String[] string_array = b.readLine().split(" ");
		
		for(int i=0;i<string_array.length;i++) {
			System.out.println(string_array[i]);
		}
		
		*/
		
		/* // nextInt() + nextLine() code
		
		int number_nextInt = s.nextInt();
		s.nextLine();
		String String_nextLine = s.nextLine();
		System.out.println("nextInt : "+number_nextInt+" , nextLine : "+String_nextLine);
		
		*/
		
		/* // nextLine() code -> parseInt
		 
		int number_parseInt = 0;
		try {
			number_parseInt = Integer.parseInt(s.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Integer input");
		}

		String String_nextLine = s.nextLine();
		System.out.println("nextInt : "+number_parseInt+" , nextLine : "+String_nextLine);
		
		*/
	}
	
	public static String StringFirstUpper(String data) {
		String trans_String = data.substring(0, 1); // substring( 찾을 문자열 시작번호 , 읽어들인 문자열 갯수 )
		trans_String = trans_String.toUpperCase();
		trans_String += data.substring(1).toLowerCase(); // 그 외에는 소문자
		
		return trans_String;
	}

}
