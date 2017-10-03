package honux.calendar;
import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int first = scanner.nextInt();
		int second = scanner.nextInt();
		System.out.printf("입력하신 %d와 %d의 합은 %d 입니다.",first, second, first + second);
		scanner.close();
	}

}
