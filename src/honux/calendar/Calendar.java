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
		int num = scanner.nextInt();
		
		if(num == 1 || num == 3 || num == 5 || num == 7 || num == 8 || num ==10 || num==12) {
			System.out.printf("%s월은 31일까지 있습니다.",num);
		} else if(num ==  2 || num == 4 || num == 6 || num == 9 || num == 11) {
			if(num == 2) {
				System.out.println("2월은 28일(윤년엔 29일)까지 있습니다.");
			}else {
				System.out.printf("%s월은 30일까지 있습니다.",num);
			}
		}
		else {
			System.out.println("이런 달은 없습니다.");
		}
		scanner.close();
					
				}
			}
