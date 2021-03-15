import java.util.Scanner;

public class GugudanPractice1 {

	public static void main(String[] args) {
		
		System.out.println("구구단 중 출력할 단은? :");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("입력한 단은 " + number + "입니다.");
		
		int j;
		for(j=1; j<=number; j++) {
		  System.out.println(number + " X " + j + "=" + (number * j));
		}
		 
	}

}
