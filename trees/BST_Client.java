package trees;

public class BST_Client {

	public static void main(String[] args) {
		
		int []arr= {10,20,30,40,50,60,70};
		BST tree=new BST(arr);
		tree.display();
		System.out.println(tree.find(55));
		tree.add(55);
		tree.display();
		tree.remove(55);
		tree.display();
		tree.remove(40);
		tree.display();
	}

}
