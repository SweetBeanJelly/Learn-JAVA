import java.io.*;
import java.util.*;
import java.util.stream.*;

public class String_Array_Test_Stream {

	public static void main(String[] args) throws IOException {
		// list는 중복을 허용하고 저장 순서를 유지.
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("count number : ");
		int count = Integer.parseInt(b.readLine());
		
		System.out.print("array1 : ");
		String[] string_array1 = b.readLine().split(" ");
		
		for(int i=0;i<count;i++) {
			System.out.println(string_array1[i]);
		}
		
		System.out.print("array2 : ");
		String[] string_array2 = b.readLine().split(" ");
		
		for(int i=0;i<count;i++) {
			System.out.println(string_array2[i]);
		}
		
		// 합집합, 교집합, 차집합
		List<String> list1 = Arrays.asList(string_array1);
		List<String> list2 = Arrays.asList(string_array2);
		
		// 병렬처리 parallel
		final List<String> union = new ArrayList<String>(list1);
		list2.parallelStream().filter(e -> !union.contains(e)).distinct().forEach(union::add);
		
		final List<String> intersect = list1.stream().filter(list2::contains).distinct().collect(Collectors.toList());
		final List<String> difference = union.stream().filter(e -> !intersect.contains(e)).distinct().collect(Collectors.toList());
		
		System.out.println("union : "+union);
		System.out.println("intersect : "+intersect);
		System.out.println("difference : "+difference);
	}

}
