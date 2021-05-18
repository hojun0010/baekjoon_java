package Math_1;
import java.util.*;

import Math_1.Main.Tree;
import Math_1.Main.Tree.Node;

public class Main {
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

