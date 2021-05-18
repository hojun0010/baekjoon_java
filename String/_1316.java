package String;
import java.util.*;

public class _1316 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		input.nextLine();
		String[] str = new String[n+1];
		int num = n;
		
		for(int i = 0; i < n; i++) {
			String input_str = input.nextLine();
			str[i] = input_str;
		}
		for(int i = 0; i < n; i++) {
			String word = str[i];
			ArrayList<String> list = new ArrayList<String>();
			Queue<String> queue = new LinkedList<>();
			
			for(int k = 0; k < word.length(); k++) {
				String word_chr = String.valueOf(word.charAt(k));
				if(queue.peek() == null){
					queue.add(word_chr);
				}
				else if(word_chr.equals(queue.peek()) == false) {
					String continuous_chr = queue.poll();
					if(list.contains(word_chr)) {
						num--;
						break;
					}
					list.add(continuous_chr);
					queue.add(word_chr);
				}
				else if(word_chr.equals(queue.peek()) == true) {
					queue.add(queue.poll());
					continue;
				}
				
			}
		}
		System.out.println(num);
		
	}
	

}
