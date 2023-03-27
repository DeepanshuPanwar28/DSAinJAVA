package Lecture37;

public class Binary_Tree {
	Node root;
	class Node {
		int data; 
		Node left;
		Node right; 
		
		

		public Node(int i) {
			
		}
	}
	
	
	public void disp() {
		disp (root); 
		
	}
	private void disp(Node nn) {
		if (nn == null) {
			return; 
		}
		disp(nn.left);
		disp(nn.right);
		System.out.println(nn.data);
		
	}
	private Node createInPre(int [] Pre, int Pre_s, int Pre_e, int [] In, int In_s, int In_e) {
		Node nn = new Node(Pre[Pre_s]);
		int ali = Pre[Pre_s]; 
		int found = In_s; 
		int L_Size = 0;
		for (int i = In_s; i <= In_e; i++) {
			if (In[i] == ali) {
				found = i; 
				break; 
			}
			L_Size++; 
		}
		nn.left = createInPre (Pre, Pre_s+1, Pre_s+L_Size, In, In_s, found - 1);
		nn.right = createInPre (Pre, Pre_s+L_Size + 1, Pre_e, In, found + 1, In_e);
		return nn; 
		
		
	}
	
}
