
public class BinarySearchThree {
	
	BinarySearchThree right;
	BinarySearchThree left;
	int key;
	
	public BinarySearchThree(int key) {
		this.right = null;
		this.left = null;
		this.key = key;
	}
	
	
	int getkey() {
		return this.key;
	}
	
	boolean search(int searchValue) {
		if(this.key == searchValue)
			return true;
		
		if(searchValue < this.key) {
			if(this.left == null)
				return false;
			
			return this.left.search(searchValue);
		}else {
			if(this.left == null) 
				return false;
			
			return this.right.search(searchValue);
		}
	}
	
	
	boolean insert(int value) {
		if(value < this.key) {
			if(this.left == null) {
				this.left = new BinarySearchThree(value);
				return true;
				
			}else 
				return this.left.insert(value);
								
	}else {
		if(this.right == null) {
			this.right = new BinarySearchThree(value);
			return true;
		}else {
			return this.right.insert(value);
		}
	}
		
		}

	
	void preOrder() {
		
		System.out.print(this.key + " ");
		
		if(this.left != null) 
			this.left.preOrder();
		
		
		if(this.right != null)
			this.right.preOrder();
		
	}
		
	
	void inOrder(){
		if(this.left != null) 
			this.left.inOrder();
		
		System.out.print(this.key + " ");
		
		if(this.right != null) 
			this.right.inOrder();
		
	}
	
	void postOrder() {
		if(this.left != null)
			this.left.postOrder();
		
		if(this.right != null)
			this.right.postOrder();
		
	}

	
}
	


