package Another;
import java.util.Scanner;
//��ǻ�Ϳ� ����� ������ ���� ���� �� ���� �����. ���ں��� ���� ����. 
//���� Ű�� ġ��, ���α׷��� ���� ���� �� �߿��� �����ϰ� �ϳ��� �����ϰ� ��ǻ�Ͱ� �� ������ �Ѵ�.
//���ڰ� �Է��� ���� �����ϰ� ������ ���� ���Ͽ� ���� �̰���� �Ǵ�.
//���ڰ� "�׸�"�� �Է��ϸ� ������ ������. 

public class RSPExample {
	
	public static void main(String[] args) {
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		new RSPExample();
		}
		

public RSPExample() {
		Scanner s = new Scanner(System.in);
		String str1[] = {"����", "����", "��"};
		
		
		while(true) {
			System.out.print("���� ���� ��! >>");
			String a = s.nextLine();
			int n = (int)(Math.random()*3);
			
			if(a.equals("����")) {
				if(str1[n].equals("����")) {
					System.out.println("����� = " +a+", ��ǻ�� ="+str1[0]+", �����ϴ�.");
					continue;
				}
				else if(str1[n].equals("����")) {
					System.out.println("����� = "+a+", ��ǻ�� ="+str1[1]+", ����ڰ� �����ϴ�.");
					continue;
				}
				else if(str1[n].equals("��")) {
					System.out.println("����� = "+a+", ��ǻ�� :"+str1[2]+", ����ڰ� �̰���ϴ�.");
					continue;
				}
			}
		
			else if(a.equals("����")) {
				if(str1[n].equals("����")) {
					System.out.println("����� = " +a+" ��ǻ�� :"+str1[0]+", ����ڰ� �̰���ϴ�.");
					continue;
				}
				else if(str1[n].equals("����")) {
					System.out.println("����� = "+a+" ��ǻ�� :"+str1[1]+", �����ϴ�.");
					continue;
				}
				else if(str1[n].equals("��")) {
					System.out.println("����� = "+a+" ��ǻ�� :"+str1[2]+", ����ڰ� �����ϴ�.");
					continue;
				}	
			}
			
			else if(a.equals("��")) {
				if(str1[n].equals("����")) {
					System.out.println("����� = " +a+" ��ǻ�� :"+str1[0]+", ����ڰ� �����ϴ�.");
					continue;
				}
				else if(str1[n].equals("����")) {
					System.out.println("����� = "+a+" ��ǻ�� :"+str1[1]+", ����ڰ� �̰���ϴ�.");
					continue;
				}	
				else if(str1[n].equals("��")) {
					System.out.println("����� = "+a+" ��ǻ�� :"+str1[2]+", �����ϴ�.");
					continue;	
					}
				}
			else if(a.equals("�׸�")){
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}		
		}
	}
}
	

	