import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		
		/* 1. 2단과 3단 출력하기 
	
		System.out.println("2단");
		System.out.println(2 * 1);
		System.out.println(2 * 2);
		System.out.println(2 * 3);
		System.out.println(2 * 4);
		System.out.println(2 * 5);
		System.out.println(2 * 6);
		System.out.println(2 * 7);
		System.out.println(2 * 8);
		System.out.println(2 * 9);
		
		System.out.println("======================");

		System.out.println("3단");
		System.out.println(3 * 1);
		System.out.println(3 * 2);
		System.out.println(3 * 3);
		System.out.println(3 * 4);
		System.out.println(3 * 5);
		System.out.println(3 * 6);
		System.out.println(3 * 7);
		System.out.println(3 * 8);
		System.out.println(3 * 9);
		
		System.out.println("======================");*/

		/* 변수를 이용해 출력하기
		int result = 4*1;
		System.out.println(result);
		result = 4*2;
		System.out.println(result);
		result = 4*3;
		System.out.println(result);
		result = 4*4;
		System.out.println(result);
		result = 4*5;
		System.out.println(result);
		result = 4*6;
		System.out.println(result);
		result = 4*7;
		System.out.println(result);
		result = 4*8;
		System.out.println(result);
		result = 4*9;
		System.out.println(result);*/
		
		
		/* 입력받는 Scanner 클래스를 이용해 출력하기
		System.out.println("구구단 중 출력할 단은? :");

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("number : " + number);
		
		int result = number * 1;
		System.out.println(number * 1);
		System.out.println(number * 2);
		System.out.println(number * 3);
		System.out.println(number * 4);
		System.out.println(number * 5);
		System.out.println(number * 6);
		System.out.println(number * 7);
		System.out.println(number * 8);
		System.out.println(number * 9);*/
		
		//반복문 while을 통해 더 짧게 출력하기
		/*int i = 1;
		while(i <10) {
			System.out.println(6 * i);
			//i++;
			//i = i+1;
			++i;
		}*/
		
		//반복문 while을 통해 2단부터 9단까지 출력하기
		/*int i = 2;
		int j;
		
	    while(i <= 9) {
	    	j=1;
	    	while(j <= 9 ) {
	    		System.out.println( i * j);
	    		j++;
	    	}
	    i++;	
	    System.out.println(" ");
	    }*/
		
		//반복문 for문을 통해 '더 효율적으로' 2단부터 9단까지 출력하기
		/*int i;
		int j;
		
		for(i=2; i<=9; i++) {
			for(j=1; j<=9; j++) {
				System.out.println(i + " x " + j + " =" + ( i * j));
			}
			System.out.println(" ");
		}*/
		
		
		
		//조건문으로 구구단 출력하기
		/*System.out.println("구구단 중 출력할 단은? :");

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("입력한 단은 " + number + "입니다.");

		if(number < 2) {
			System.out.println("2단부터 출력이 가능합니다.");
		}else if (number > 9 ) {
			System.out.println("9단까지만 출력이 가능합니다.");
		}else {
			int i;
			
			for(i=1; i<=9; i++) {
				System.out.println(number + " X " + i + "=" + (number * i));
		} 
	}*/
		
		  
		
		//for문을 돌면서 2단 실행 결과를 배열에 저장하고, 배열 크기만큼 for문을 통해 결과출력하기
		/*System.out.println("구현 방법 1");
		int arr[] = new int[9];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]= 2 * (i+1);
		}
	    for(int i=0; i<arr.length; i++) {
	    	System.out.println(arr[i]);
	    }*/
		
		/*System.out.println("구현 방법 2");
	    
	    int arr[] = new int[9];
		
			for(int j=0; j<arr.length; j++) {
			  arr[j]= 2 * (j+1);
			  System.out.println(arr[j]);
			}*/
			
		
		//이 중 for 문을 이용해 2단부터 9단까지 출력
		//System.out.println("구현 방법 1");
		/*int arr[] = new int[9];
		
		
		for(int a=2; a < arr.length; a++) {
			for(int count=1; count<=9; count++) {
				System.out.println(a + " x " + count + " =" + ( a * count));
			}
			System.out.println(" ");
		}*/
		
		
		//System.out.println("구현 방법 2");
		 int[] result = new int[9];

	        for(int i=2; i < result.length; i++) {
	           for(int j=0; j< result.length; j++) {
	        	   result[j]= i * (j+1);
	        	   System.out.println(result[j]);
	           }
	           
	        }
		
	}
}
