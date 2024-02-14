package String;

public class Ex01 {
	public static void main(String[] args) {
		String str;
		String str1 = new String();
		String str2 = "test";
		String str3 = new String ("test init");
		System.out.println("str3 : " + str3);
		String s1 = str3.toUpperCase(); //대문자
		System.out.println("s1 : " + s1);
		String s2 = s1.toLowerCase();
		System.out.println("s2 : " + s2); //소문자
		
		str3 = "Java"; //java, Java
		if (str3.toLowerCase().equals("java")) {  //Lowercase or Uppercase 이용해서 대조
			System.out.println("수강 과목 : 자바");
			
		}else {
			System.out.println("수강 과목이 다름");
		}
	}

}
