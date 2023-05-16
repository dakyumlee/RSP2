package One;

		import java.util.Random;
//Random 클래스를 사용하기 위해 import
		import java.util.Scanner;
//Scanner 클래스를 사용하기 위해 import
		
	public class Rocksp {
//Rocksp 라는 public class
		   public static void main(String[] args) {

		       Scanner sc = new Scanner(System.in);
//Scanner 클래스를 사용하여 사용자의 입력을 받기 위해 Scanner 객체 sc를 생성
		       Random ran= new Random();
//Random 클래스를 사용하여 가위/바위/보를 정할 1부터 3까지의 랜덤 정수를 생성하기 위해 Random 객체 ran을 생성
		         System.out.print("가위 바위 보! >> ");
//"가위 바위 보! >> "라는 메시지를 출력해 사용자로부터 대답을 유도
		         String choice = sc.nextLine();
//사용자의 입력을 nextLine() 메서드를 통해 choice 변수에 저장함. (String 형이므로 가위/바위/보로 입력 가능)		      
		         int a = ran.nextInt(3)+1;
//컴퓨터의 가위/바위/보를 정하기 위해 1부터 3까지의 랜덤 정수를 생성 후 a 변수에 저장
		         if(a==1) {
		            System.out.println("com: 가위");
		         } else if(a==2) {
		            System.out.println("com: 바위");
		         } else if(a==3) {
		            System.out.println("com: 보");
		         }
//if-else 문을 사용하여 a 값에 맞춰 컴퓨터가 낼 가위, 바위, 보를 출력함.
		          if (choice.equals("가위"))   {
//글자(문자)라서 .equals 사용함
		               if(a==1) {
		                  System.out.println("비겼습니다!");
		               } else if(a==2)   {
		                  System.out.println("졌습니다!");
		               } else   {
		                  System.out.println("이겼습니다!");
		               }
		         } else if (choice.equals("바위"))   {
		            if(a==1) {
		               System.out.println("이겼습니다!");
		            } else if(a==2)   {
		               System.out.println("비겼습니다!");
		            } else   {
		               System.out.println("졌습니다!");
		            }
		         } else if (choice.equals("보"))   {
		            if(a==1) {
		               System.out.println("졌습니다!");
		            } else if(a==2)   {
		               System.out.println("이겼습니다!");
		            } else   {
		               System.out.println("비겼습니다!");
		            }
		         }
//사용자의 가위바위보(choice)와 컴퓨터의 가위바위보(a)를 비교한 후 결과에 따라 적절한 승패 메시지를 출력.
		         else {
		            System.out.println("잘못된 입력입니다.");
		         }
		      }
//사용자가 "가위", "바위", "보" 이외의 값을 입력한 경우, "잘못된 입력입니다."라는 메시지를 출력
		      


	}

