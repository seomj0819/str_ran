package String;

public class Ex02 {
	public static void main(String[] args) {
		String str = "test";
		System.out.println("length : " + str.length());
		System.out.println("charAt(1)" + str.charAt(1)); //array에서 특정 값 꺼내오기
		
		System.out.println(str.charAt(0) == 't');
		System.out.println(str.charAt(0) != 't');
		System.out.println(str.equals("aaaa"));
		
		int i=0;
		String jumin = "990819";
		if (jumin.length() == 6) {
			for(; i<jumin.length(); i++) {
				if(jumin.charAt(i) < '0'|| jumin.charAt(i) > '9') {
					System.out.println("숫자만 입력 가능합니다");
					break;
				}
			}
			if (i ==jumin.length()) {
				System.out.println("주민번호 뒷자리를 입력하세요");
			}
		}else {
			System.out.println("길이가 잘못됐음");
		}
		
		System.out.println("-------------------------------------");
		int i1=0;
		for (;i1<5;i1++) {
			if (i1 == 4) break;
		}
		System.out.println("i1 : " + i1);
	}

}
