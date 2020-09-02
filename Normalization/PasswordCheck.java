import java.util.*;

public class PasswordCheck { // ���Խ� RegEx

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String id = s.next();
		s.nextLine(); // Scanner �� ���ÿ� �ι� ����� �� ���� (���� ����)
		String pwd = s.nextLine();
		
		 /*
		 * ���� �ּ� 1�� ����
		 * ���� ��, �ҹ��� �ּ� 1�� �̻� ����
		 * 8~20 ���� ���� ���
		 * Ư������ �ʼ� ���� ��� ����
		 */
		if((id.length()>1)&&(id.length()<=20)) {
			final String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*\\W)(?=\\S+$).{8,20}$";
			boolean check = pwd.matches(pattern);
			
			if (check==false) {
				System.out.println("fail");
			} else {
				System.out.println("pass");
			}
			
		} else {
			System.out.println("fail");
		}
		
		/*
		
		1) ���ڸ� : ^[0-9]*$
		
		2) �����ڸ� : ^[a-zA-Z]*$
		
		3) �ѱ۸� : ^[��-�R]*$
		
		4) ���� & ���ڸ� : ^[a-zA-Z0-9]*$
		
		5) E-Mail : ^[a-zA-Z0-9]+@[a-zA-Z0-9]+$
		
		6) �޴��� : ^01(?:0|1|[6-9]) - (?:\d{3}|\d{4}) - \d{4}$
		
		7) �Ϲ���ȭ : ^\d{2,3} - \d{3,4} - \d{4}$
		
		8) �ֹε�Ϲ�ȣ : \d{6} \- [1-4]\d{6}
		
		9) IP �ּ� : ([0-9]{1,3}) \. ([0-9]{1,3}) \. ([0-9]{1,3}) \. ([0-9]{1,3})
		
		 */
	}

}
