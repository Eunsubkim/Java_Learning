import java.util.*;

public class RSP {
		
	public static void main(String[] args) {
		
		//문자열로 이루어진 정수를 실제 정수로 변환
		//Integer.parseInt(문자열 or 문자열이 들어있는 변수)
//		String s1 = "10";
//		String s2 = "34";
//		int i1 = Integer.parseInt(s1);		//s1이 10.3과 같은 실수 타입일 경우 변환 불가
//		int i2 = Integer.parseInt(s2);
//		System.out.println(s1+s2);
//		System.out.println(i1+i2);
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("*** 가위 바위 보 게임 ***");
		System.out.println("# 코인을 투입해 주세요 (넣으실 코인의 숫자를 입력해 주세요)");
		System.out.print("> ");
		int coinCount=sc.nextInt();
		System.out.println("# 해당하는 메뉴의 숫자를 입력해 주세요.");
		
		int wCount=0;
		int dCount=0; 
		int lCount=0;
		int insert=0;
		
		outer : while(true) {
			System.out.println("# 현재 코인 수 : "+coinCount);
			System.out.println("---------------------------");
			System.out.println("# 1. 가위바위보 게임 시작");
			System.out.println("# 2. 전적보기");
			System.out.println("# 3. 코인 투입하기");
			System.out.println("# 4. 프로그램 종료");
			System.out.println("---------------------------");
			System.out.print("> ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1 :
				while(true) {					
					if(coinCount==0) {
						System.out.println("# 코인이 없습니다.");
						System.out.println("# 게임을 계속 하시려면 코인을 더 넣어주세요.");
						System.out.println("# 게임을 그만두고 메인 메뉴로 돌아가시려면 '그만'이라고 입력해 주세요.");
						System.out.print("> ");
						String select2 = sc.next();

						if(select2.equals("그만")) {
							System.out.println("메인 메뉴 선택화면으로 돌아갑니다.");
							break;
						}else {
							int addCoin = Integer.parseInt(select2);
							coinCount+=addCoin;
							continue;
						}
						
					}
					
					int com=(int)(Math.random()*3)+1;				
					System.out.println("---------------------------");
					System.out.println("# 가위, 바위 , 보 중에 하나를 입력하세요.");
					System.out.println("# 게임을 끝내고 싶으시다면 '그만' 이라고 입력하세요.");
					System.out.print("> ");
					String select1 = sc.next();
					
					switch(com) {
					case 1 : 
						System.out.println("# 컴퓨터가 낸 것은 가위!");
						switch(select1) {
						case "가위" :
							System.out.println("---------------------------");
							System.out.println("비겼습니다.");
							coinCount--;
							dCount++;
							break;
						case "바위" :
							System.out.println("---------------------------");
							System.out.println("이겼습니다.");
							coinCount--;
							wCount++;
							break;
						case "보" :
							System.out.println("졌습니다.");
							coinCount--;
							lCount++;
							break;
						case "그만" :
							System.out.println("가위바위보 게임 종료!");
							System.out.println("---------------------------");
							System.out.println("# 현재 코인 수 : "+coinCount);
							System.out.println("---------------------------");
							break;
						default : 
							System.out.println("잘못 입력하셨습니다.");
							System.out.println();
							System.out.println("---------------------------");
							break;
						}break;
					case 2 :
						System.out.println("# 컴퓨터가 낸 것은 바위!");
						switch(select1) {
						case "가위" :
							System.out.println("---------------------------");
							System.out.println("졌습니다.");
							coinCount--;
							lCount++;
							break;
						case "바위" :
							System.out.println("---------------------------");
							System.out.println("비겼습니다.");
							coinCount--;
							dCount++;
							break;
						case "보" :
							System.out.println("이겼습니다.");
							coinCount--;
							wCount++;
							break;
						case "그만" :
							System.out.println("가위바위보 게임 종료!");
							System.out.println("---------------------------");
							System.out.println("# 현재 코인 수 : "+coinCount);
							System.out.println("---------------------------");
							break;
						default : 
							System.out.println("잘못 입력하셨습니다.");
							System.out.println();
							System.out.println("---------------------------");
							break;
						}break;
					case 3 :
						System.out.println("# 컴퓨터가 낸 것은 보!");
						switch(select1) {
						case "가위" :
							System.out.println("---------------------------");
							System.out.println("이겼습니다.");
							coinCount--;
							wCount++;
							break;
						case "바위" :
							System.out.println("---------------------------");
							System.out.println("졌습니다.");
							coinCount--;
							lCount++;
							break;
						case "보" :
							System.out.println("비겼습니다.");
							coinCount--;
							dCount++;
							break;
						case "그만" :
							System.out.println("가위바위보 게임 종료!");
							System.out.println("---------------------------");
							System.out.println("# 현재 코인 수 : "+coinCount);
							System.out.println("---------------------------");
							break;
						default : 
							System.out.println("잘못 입력하셨습니다.");
							System.out.println();
							System.out.println("---------------------------");
							break;
						}break;
					}
				}
				break;
				
			case 2 : 
				System.out.println("\n---------------------------------");
				System.out.println("*** 게임 결과 ***");
				System.out.println("이긴 횟수: "+wCount);
				System.out.println("비긴 횟수: "+dCount);
				System.out.println("진 횟수: "+lCount);
				System.out.println("\n---------------------------------");
				break;
				
			case 3 :
				System.out.println("\n---------------------------------");
				System.out.print("코인을 투입하세요.\n> ");
				insert=sc.nextInt();
				coinCount+=insert;
				System.out.println(insert+"개의 코인을 넣었습니다.");
				break;
				
			case 4 :
				System.out.println("\n프로그램을 종료합니다. [Y / N] \n> ");
				String quit = sc.next();
				if(quit.equals("y")||quit.equals("Y")) {
					break outer;
				}else if(quit.equals("n")||quit.equals("N")) {
					System.out.println("종료를 취소합니다.");
					break;
				}
				
			default :
				System.out.println("메뉴를 잘못선택하셨습니다.");
				break;
			}
			
		}
		
	}

}
