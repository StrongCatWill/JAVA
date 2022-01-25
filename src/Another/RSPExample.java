package Another;
import java.util.Scanner;
//컴퓨터와 사용자 사이의 가위 바위 보 게임 만들기. 독자부터 먼저 시작. 
//엔터 키를 치면, 프로그램은 가위 바위 보 중에서 랜덤하게 하나를 선택하고 컴퓨터가 낸 것으로 한다.
//독자가 입력한 값과 랜덤하게 선택한 값을 비교하여 누가 이겼는지 판단.
//독자가 "그만"을 입력하면 게임은 끝난다. 

public class RSPExample {
	
	public static void main(String[] args) {
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		new RSPExample();
		}
		

public RSPExample() {
		Scanner s = new Scanner(System.in);
		String str1[] = {"가위", "바위", "보"};
		
		
		while(true) {
			System.out.print("가위 바위 보! >>");
			String a = s.nextLine();
			int n = (int)(Math.random()*3);
			
			if(a.equals("가위")) {
				if(str1[n].equals("가위")) {
					System.out.println("사용자 = " +a+", 컴퓨터 ="+str1[0]+", 비겼습니다.");
					continue;
				}
				else if(str1[n].equals("바위")) {
					System.out.println("사용자 = "+a+", 컴퓨터 ="+str1[1]+", 사용자가 졌습니다.");
					continue;
				}
				else if(str1[n].equals("보")) {
					System.out.println("사용자 = "+a+", 컴퓨터 :"+str1[2]+", 사용자가 이겼습니다.");
					continue;
				}
			}
		
			else if(a.equals("바위")) {
				if(str1[n].equals("가위")) {
					System.out.println("사용자 = " +a+" 컴퓨터 :"+str1[0]+", 사용자가 이겼습니다.");
					continue;
				}
				else if(str1[n].equals("바위")) {
					System.out.println("사용자 = "+a+" 컴퓨터 :"+str1[1]+", 비겼습니다.");
					continue;
				}
				else if(str1[n].equals("보")) {
					System.out.println("사용자 = "+a+" 컴퓨터 :"+str1[2]+", 사용자가 졌습니다.");
					continue;
				}	
			}
			
			else if(a.equals("보")) {
				if(str1[n].equals("가위")) {
					System.out.println("사용자 = " +a+" 컴퓨터 :"+str1[0]+", 사용자가 졌습니다.");
					continue;
				}
				else if(str1[n].equals("바위")) {
					System.out.println("사용자 = "+a+" 컴퓨터 :"+str1[1]+", 사용자가 이겼습니다.");
					continue;
				}	
				else if(str1[n].equals("보")) {
					System.out.println("사용자 = "+a+" 컴퓨터 :"+str1[2]+", 비겼습니다.");
					continue;	
					}
				}
			else if(a.equals("그만")){
				System.out.println("프로그램을 종료합니다.");
				break;
			}		
		}
	}
}
	

	