package trees;

public class BinaryTreeClient {

	public static void main(String[] args) {
		// 50 true 25 true 38 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
		BinaryTree b=new BinaryTree();
		b.display();
		System.out.println("The height of tree is "+b.height());
		b.preOrder();	
		b.postOrder();
		b.InOrder();
		b.levelOrder();
		System.out.println(b.isBST());
		System.out.println(b.DiameterOfTree());
		System.out.println(b.sumOfLeafNodes());
		
	}

}
