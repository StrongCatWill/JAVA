package Another;
import java.util.Scanner;

public class RPS {
	//1. ��ĳ�� �ý��� �� 
	Scanner sc = new Scanner(System.in);
	
	//2. ����� ���� String Ÿ������ ����
	String UserChoice = sc.nextLine();
	
	//3. ���� ���� �� ���� �迭�� ����
	String Example[] = {"����", "����", "��"};
	
	//4. ���� �Լ� ����
	int ComRan = (int)(Math.random()*3);
	//5. 4�� �̿��� ��ǻ���� ���� ���� 
	String ComChoice = Example[ComRan];


	public static void main(String[] args) {
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		System.out.print("���� ���� ��! >>");
	}
}
