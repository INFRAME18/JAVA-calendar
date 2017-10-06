package honux.calendar;

public class Calendar {
	boolean prime(int x) {
		for(int i = 2; i*i<= x; i++) {
			if(x%i == 0)
				return false;}
		return true;
		}
	public static void main(String[] args) {
		Calendar P = new Calendar();
		int t = 1;
		for(int j = 2; j < 10000000; j++) {
			if(P.prime(j)) {
				System.out.println(j + "는" + t++ + "번째 소수입니다.");
			}
		}
	}
	
	}
