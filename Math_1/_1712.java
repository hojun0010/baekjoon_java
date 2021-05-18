package Math_1;
import java.util.*;

public class _1712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		long fixed_cost = input.nextInt();
		long changed_cost = input.nextInt();
		long price = input.nextInt();
		long sale = 1;
		
		long all_cost = fixed_cost+changed_cost;
		long all_sale = price;
		
		if(changed_cost >= price) {
			System.out.println(-1);
		}
		else {
			while(all_sale <= all_cost) {
				sale++;
				all_cost += changed_cost;
				all_sale += price;
			}
			System.out.println(sale);
		}
	}
}
