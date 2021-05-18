package Math_1;
//미완성, 1번 실패

import java.util.*;

public class _2839 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int weight = input.nextInt();
		Tree tree = new Tree();
		Node node_weight = ;	
	}
	static class Tree{
		int level;
		
		Tree(){
			level = 0;
		}
		class Node {
			Node left;
			Node right;
			
			int weight;
			
			Node(int weight) {
				this.weight = weight;
				this.left = null;
				this.right = null;
			}
			Node addNode(int weight) {
				Node node = new Node(weight);
				return node;
			}
			void addLeft(Node node) {
				left = node;
				level++;
			}
			void addRight(Node node) {
				right = node;
				level++;
			}
		}
	}
}

