package variable;

public class P69 {

	public static void main(String[] args) {
		String str = "abcdef";  //메모리에 알파벳이 들어가고 stack에 경로주소가 생성
		str = str.toUpperCase(); //str을 대문자로 바꿔서 다시 메모리에 대문자 등록
		System.out.println(str);  //스트링은 바꿀수 없어 (??)		

		String str2 = str.replace('A','Z');   //주소에 접근할땐 . 찍음
		//여기 str은 대문자. 위에서부터 실행하니까
		System.out.println(str2); //A를 Z로
		
		int lng = str.length();
		System.out.println(lng);  // 자릿수, 길이
		
		//indexOf (??)
		int t = str.indexOf("B");
		System.out.println(t);  //0부터 시작하니까 두번째B는 1
		
		//charAt (??)
		char c = str.charAt(0);
		System.out.println(c);   //0번째는 A였음
		
		//substring (??)
		String str3 = str.substring(1, 3);
		System.out.println(str3);   // BC (??)
		
		
		
		//과제
		String email = "jmlee@tonesol.com";
		
		String id = "";
		String domain = "";
		
		System.out.printf("%s, %s", id, domain);
		
	}

}
