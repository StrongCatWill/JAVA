package Another;
import java.util.Scanner;

public class RPS {
	//1. 스캐너 시스템 인 
	Scanner sc = new Scanner(System.in);
	
	//2. 사용자 변수 String 타입으로 지정
	String UserChoice = sc.nextLine();
	
	//3. 가위 바위 보 샘플 배열로 생성
	String Example[] = {"가위", "바위", "보"};
	
	//4. 랜덤 함수 생성
	int ComRan = (int)(Math.random()*3);
	//5. 4를 이용한 컴퓨터의 변수 지정 
	String ComChoice = Example[ComRan];


	public static void main(String[] args) {
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		System.out.print("가위 바위 보! >>");
	}
}
