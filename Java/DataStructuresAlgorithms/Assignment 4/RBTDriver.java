public class RBTDriver {
	public static void main(String[] args) {
		try {
			RBTree rbt = new RBTree();
			for(int i = 0; i < 50; i++) {
				rbt.insert(new Integer(i));
			}
			
			//rbt.insert(new Integer(30));	//exception
			
			System.out.println(rbt.findMax());
			System.out.println(rbt.findMin());
			
			while(!rbt.isEmpty()) {
				System.out.println(rbt.findMax());
				rbt.deleteMax();
			}
			
			//System.out.println(rbt.findMin()); //exception
			
			for(int i = 0; i < 50; i++) {
				rbt.insert(new Integer(i));
			}
			
			System.out.println(rbt.find(new Integer(25)));
			rbt.makeEmpty();
			System.out.println(rbt.isEmpty());
		} catch(ItemNotFoundException infe) {
			System.out.println("ItemNotFoundException");
		} catch(DuplicateItemException die) {
			System.out.println("DuplicateItemException");
		}
	}
}
