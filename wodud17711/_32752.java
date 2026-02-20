import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.StringTokenizer;

public class _32752 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			Integer number = Integer.parseInt(st.nextToken());
			list.add(number);
		}
		
		Collections.sort(list.subList(L-1, R));


		Iterator<Integer> it = list.iterator();
		
		int prev = (int)it.next();
		
		end: while(true) {
			while(it.hasNext()) {
				int next = (int)it.next();
				if(prev > next) {
					System.out.println(0);
					break end;
				}
				prev = next;
			}
			System.out.println(1);
			break;
		}

	}

}