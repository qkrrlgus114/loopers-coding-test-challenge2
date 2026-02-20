import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if (n == 0) {
			System.out.println(0);
			return;
		}
		
		if (n == 1) {
			System.out.println(1);
			return;
		}
		
		long a = 0L;
		long b = 1L;
		
		for (int i = 2; i <= n; i++) {
			long temp = a + b;
			a = b;
			b = temp;
		}
		
		System.out.println(b);
	}
}
