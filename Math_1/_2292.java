package Math_1;
import java.util.*;

public class _2292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int trial_num = 0; //공식 시도 횟수 = 통과한 방 갯수 -1
		
		int first_room = 1;
		int final_room = 1;
		
		while(n < first_room || n > final_room ) {
			first_room += 6*trial_num;
			final_room += 6*(trial_num+1);
			trial_num++;
		}
		System.out.println(trial_num+1);
	}
}
