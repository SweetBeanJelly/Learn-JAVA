import java.io.*;
import java.util.*;

public class String_Test {

	public static void main(String[] args) throws IOException {
		
		Scanner s = new Scanner(System.in);
		String[] str = s.nextLine().split(" ");
		
		for(int i=0;i<str.length;i++) {
			System.out.println(StringFirstUpper(str[i]));
		}
		
		/* // BufferedReader�� Scaanner���� �ӵ��� ����
		
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));	
		// StringTokenizer �����ڿ� ������ ���̿� �����Ͱ� ���ٸ� �ϳ��� ��ҷ� �������� ����
		StringTokenizer string_Token = new StringTokenizer(b.readLine(), " ");
		while (string_Token.hasMoreTokens()) {
			System.out.println(string_Token.nextToken());
		}
		
		*/
		/* // split() �����ڿ� ������ ���̿� �����Ͱ� ��� �ϳ��� ��ҷ� ����
		 
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
		String trans_String = data.substring(0, 1); // substring( ã�� ���ڿ� ���۹�ȣ , �о���� ���ڿ� ���� )
		trans_String = trans_String.toUpperCase();
		trans_String += data.substring(1).toLowerCase(); // �� �ܿ��� �ҹ���
		
		return trans_String;
	}

}
