import java.util.*;

public class VariableArrayAssignment2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수를 입력하세요 : ");
		int a = sc.nextInt();
		
		String[] name = new String[a];
		int[] motherLan = new int[a];
		int[] eng = new int[a];
		int[] math = new int[a];
		int[] total = new int[a];
		int[] rank = new int[a];

		for(int i=0; i<a; i++) {
			System.out.print("이름을 입력하세요 : ");
			name[i] = sc.next();
			System.out.print("국어점수를 입력하세요 : ");
			motherLan[i] = sc.nextInt();
			System.out.print("영어점수를 입력하세요 : ");
			eng[i] = sc.nextInt();
			System.out.print("수학점수를 입력하세요 : ");
			math[i] = sc.nextInt();
			total[i] = motherLan[i]+eng[i]+math[i];
			rank[i] = 1;
		}
		
		for(int i=0; i<a; i++) {
			for(int o=0; o<a; o++) {
				if(total[i]<total[o]) {
					rank[i]+=1;
				}		
			}
		}
	
		System.out.println("이름\t국어\t영어\t수학\t총점\t순위");
		for(int i=0; i<a; i++) {
			System.out.println(name[i]+"\t"+motherLan[i]+"\t"+eng[i]+"\t"+math[i]+"\t"+total[i]+"\t"+rank[i]+"\t");
		}

	}

}
