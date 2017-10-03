package honux.calendar;
import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
//		System.out.println("일    월    화    수    목   금   토");
//		System.out.println("--------------------");
//		System.out.println("1  2  3  4  5  6  7");
//		System.out.println("8  9  10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28 ");
		
		//입력하는 달의 최대 일수를 출력하는 프로그램
		Scanner scanner = new Scanner(System.in);
		System.out.println("Month를 입력해주세요.");
		int num = scanner.nextInt();
		int[] finalDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		System.out.printf("%d달의 마지막 날은 %d일 입니다.", num, finalDay[num-1]);
		scanner.close();
					
				}
			}
