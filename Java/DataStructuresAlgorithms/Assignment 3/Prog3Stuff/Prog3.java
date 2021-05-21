import java.util.LinkedList;
import java.util.Iterator;

/**
A program that builds a truth tree for a valid prefix sentence
of a fragment of PC
Author:  Allan M. Hart
*/

public class Prog3 {

		public static void main(String[] args) {
			//A list for finding tree leaves and an Iterator
			//to iterate through the list
			LinkedList list = new LinkedList();
			Iterator iter = null;
			//Initialize the root of the tree
			TruthTreeNode tnode = new TruthTreeNode("-=vppp");
			tnode.setParent(null);
			//Initialize the root of the tree
			TruthTree tree = new TruthTree(tnode);
			//Find any unchecked sentences, attach new nodes to unclosed branches
			while (tree.findUnchecked(tree.getRoot()) != null) {
				TruthTreeNode node = tree.findUnchecked(tree.getRoot());
				list = tree.findLeaves(node,list);
				String pcSentence = node.getPcSentence();
				iter = list.listIterator();
				while (iter.hasNext()) {
					TruthTreeNode leaf = (TruthTreeNode) iter.next();
					if (!leaf.getClosed())
						leaf.attach(pcSentence);
					node.setChecked(true);
				}
				list.clear();
				//close branches that contain contradictions
				list = tree.findLeaves(node, list);
				iter = list.listIterator();
				while (iter.hasNext()) {
					TruthTreeNode leaf = (TruthTreeNode) iter.next();
					if (leaf.findIfClosed(leaf))
						leaf.setClosed(true);
				}
				list.clear();
			}
			//tree is now built
			//preOrder printout of the tree
			tree.printPreOrder(tree.getRoot());
			//find out if all branches are closed
			list = tree.findLeaves(tree.getRoot(), list);
			iter = list.listIterator();
			boolean closed = true;
			while (iter.hasNext()) {
				TruthTreeNode temp = (TruthTreeNode) iter.next();
				if (!temp.getClosed()) {
					closed = false;
				}
			}
			//print the result
			if (closed)
				System.out.println("Tree is closed");
			else
				System.out.println("Tree is open");
		}
}