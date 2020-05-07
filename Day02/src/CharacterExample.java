
public class CharacterExample {

	public static void main(String[] args) {
		
		char a = 'a'; //char ''로 묶어서 표현
		char b = '\n'; //엔터 (개형)의 문자값
		char c = '\\'; 
		char d = '\"';
		char e = '\'';
		char f = '\t'; //tab. 공백 8비트
		char g = '\uCD01';
		System.out.printf("%c,%c,%c,%c,%c,%c",a,b,c,f,d,e);

	}

}
