import java.util.Scanner;

public class GugudanPractice2 {

	public static void main(String[] args) {
		
		System.out.println("구구단 중, 단과 곱할 값을 콤마와 함께 입력하세요 :");
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine(); //문자열 nextLine, 정수입력 nextInt, 실수 입력 nextDouble
		
		String[] splitedValue = inputValue.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		for(int i=2; i<=first; i++) {
			for(int j=1; j<=second; j++)
				System.out.println(i + " x " + j + " =" + ( i * j));
		}
		
	}

}



/*참고 : next와 nextLine의 차이 
nextLine()메소드는 Enter를 치기 전까지 쓴 문자열을 모두 리턴하고 
next() 메소드는 스페이스 즉 공백 전까지 입력받은 문자열을 리턴한다.
 */

/*참고 :Spring[] split(String regex)
 split 함수는 입력받은 정규 표현식 또는 특정 문자를 기준으로 문자열을 나누어 배열에 저장하여 리턴.
 
 String str = "010-8484-7516";
 String[] moNum = str.split("-");
 String ret1 = moNum[0];
 String ret1 = moNum[1];
 String ret1 = moNum[2];
 System.out.println("ret1 =" + ret1);
 System.out.println("ret2 =" + ret2);
 System.out.println("ret3 =" + ret3);
 
split("-")를 기준으로 010,8484,7516이렇게 세번 나눠서 각 변수에 들어가게 된다.


Spring[] split(String regex, int limit)
String str2 = "0-10-8484-7516";
 String[] arr = str2.split("-",2);
 System.out.println("ret4 =" + arr[0]);
 System.out.println("ret5 =" + arr[2]);
  
=> 위와 같은 String 값이 있다고 했을 떄 "-"를 인자 값으로 split하면서 배열의 크기는 2로 한정.
첫번째 "-"를 기준으로 split하면 아래와 같은 결과 출력
'ret4 = 0
 ret5 = 10-8484-7516
  */


/* parseInt()는 문자열 String타입의 숫자를 int타입으로 변환해주는 메소드
 int뿐만 아니라 byte, short, long, float, double 등 숫자와 관련된 타입은 전부 가능하다.
 (char는 parseChar()가 아니라 이 전에 알아봤던 charAt()이 존재한다.)
(boolean은 없다.)
 */
