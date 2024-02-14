package String;

public class Ex03 {
	public static void main(String[] args) {
		String str = "test   ";
		System.out.println("str + "+str);
		System.out.println(str.equals("test"));

		String result = str.trim();
		System.out.println("result : "+ result);
		System.out.println(result.equals("test"));

		String addr = "당하동 1314: : 아파트";
		System.out.println(addr);

		String[] split = addr.split (" ");
		for (int i=0 ; i<split.length; i++) {
			System.out.println(i + "." +split [i]);
		}

		String phone = " 010-1234-1234";
		String rep = phone.replace ("-", "a");
		System.out.println("rep :" +  rep);

		phone = "1234"; 
		int num = Integer.parseInt( phone );
		System.out.println(num + 100);
		
		String s = num + "";
		System.out.println(s+100);

	}
}