import java.util.*;

public class PasswordCheck { // Á¤±Ô½Ä RegEx

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String id = s.next();
		s.nextLine(); // Scanner ´Â µ¿½Ã¿¡ µÎ¹ø »ç¿ëÇÒ ¼ö ¾øÀ½ (¹öÆÛ ºñ¿ì±â)
		String pwd = s.nextLine();
		
		 /*
		 * ¼ýÀÚ ÃÖ¼Ò 1ÀÚ Æ÷ÇÔ
		 * ¿µ¹® ´ë, ¼Ò¹®ÀÚ ÃÖ¼Ò 1ÀÚ ÀÌ»ó Æ÷ÇÔ
		 * 8~20 ±ÛÀÚ ±îÁö Çã¿ë
		 * Æ¯¼ö¹®ÀÚ ÇÊ¼ö °ø¹é Çã¿ë ¾ÈÇÔ
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
		
		1) ¼ýÀÚ¸¸ : ^[0-9]*$
		
		2) ¿µ¹®ÀÚ¸¸ : ^[a-zA-Z]*$
		
		3) ÇÑ±Û¸¸ : ^[°¡-ÆR]*$
		
		4) ¿µ¾î & ¼ýÀÚ¸¸ : ^[a-zA-Z0-9]*$
		
		5) E-Mail : ^[a-zA-Z0-9]+@[a-zA-Z0-9]+$
		
		6) ÈÞ´ëÆù : ^01(?:0|1|[6-9]) - (?:\d{3}|\d{4}) - \d{4}$
		
		7) ÀÏ¹ÝÀüÈ­ : ^\d{2,3} - \d{3,4} - \d{4}$
		
		8) ÁÖ¹Îµî·Ï¹øÈ£ : \d{6} \- [1-4]\d{6}
		
		9) IP ÁÖ¼Ò : ([0-9]{1,3}) \. ([0-9]{1,3}) \. ([0-9]{1,3}) \. ([0-9]{1,3})
		
		 */
	}

}
