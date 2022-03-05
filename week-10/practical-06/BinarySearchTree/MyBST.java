public class MyBST{
	private Node root; // The reference to the root node in this tree

	public MyBST(){
		this.root = null;
	}

	public Node getRoot(){
		return root;
	}

	public void print(Node root){
		if(root == null){
			return;
		}else{
			System.out.print(root.getData()+" ");
			print(root.getLeft());
			print(root.getRight());
		}
		System.out.println();
	}


	public void insert(int value){
        Node current = this.root;
		if (this.root == null){
			this.root = new Node(value);
		}else{
			insertRec(current, value);
		}
	}
	private void insertRec(Node current, int value){
		if (current == null){
			current = new Node(value);
		}else{
			while(current != null){
				if (current.getData()< value){
					if(current.getRight() == null){
						current.setRight(new Node(value));
						current = null;
					}else{
						insertRec(current.getRight(), value);
					}
				}else{
					if(current.getLeft() == null){
						current.setLeft(new Node(value));
						current = null;
					}else{
						insertRec(current.getLeft(), value);
					}
				}
			}
		}
	}

	public boolean search(int value){
		boolean found = true;
		Node current = this.root;
		if(this.root == null){
			found = false;
		}else{
			if(this.root.getData() == value){
				found = true;
			}else{
				found = this.searchRec(current, value);
			}
		}
		return found;	
	}
	private boolean searchRec(Node current, int value){
        if(current == null)
        	return false;
        if(current.getData() == value)
        	return true;
        else if(current.getData() < value)
        	return searchRec(current.getRight(), value);
        else if(current.getData() > value)
        	return searchRec(current.getLeft(), value);
        return false;
	}
		
		
}