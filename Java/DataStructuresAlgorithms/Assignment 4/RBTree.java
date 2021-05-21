import java.util.*;

public class RBTree
{
	private TreeMap rbTree;
	
	public RBTree()
	{
		rbTree = new TreeMap();
	}
	
	public boolean isEmpty()
	{
		return rbTree.size() == 0;
	}
	
	public void makeEmpty()
	{
		rbTree.clear();
	}
	
	public void insert(Comparable x) throws DuplicateItemException
	{
		int num = 0;
		
		while (x.compareTo(num) != 0)
		{
			num++;
		}
		
		if(rbTree.containsKey(num))
		{
			throw new DuplicateItemException();
		}
		
		else
		{
			rbTree.put(num, 1);
		}
	}
	
	public void delete(Comparable x) throws ItemNotFoundException
	{
		int num = 0;
		
		while (x.compareTo(num) != 0)
		{
			num++;
		}
		
		if (rbTree.containsKey(num))
		{
			rbTree.remove(num);
		}
		else
		{
			throw new ItemNotFoundException();
		}
		
	}
	
	public void deleteMin() throws ItemNotFoundException
	{
		if (isEmpty() == false)
		{
			rbTree.remove(findMin());
		}
		else
		{
			throw new ItemNotFoundException();
		}
	}
	
	public void deleteMax() throws ItemNotFoundException
	{
		if (isEmpty() == false)
		{
			rbTree.remove(findMax());
		}
		else
		{
			throw new ItemNotFoundException();
		}
	}
	
	public Object find(Comparable x) throws ItemNotFoundException
	{
		int num = 0;
		
		while (x.compareTo(num) != 0)
		{
			num++;
		}
		
		if (rbTree.containsKey(num))
		{
			return num;
		}
		else
		{
			throw new ItemNotFoundException();
		}
	}
	
	public Object findMin() throws ItemNotFoundException
	{
		if (isEmpty() == false)
		{
			return rbTree.firstKey();
		}
		else
		{
			throw new ItemNotFoundException();
		}
	}
	
	public Object findMax() throws ItemNotFoundException
	{
		if (isEmpty() == false)
		{
			return rbTree.lastKey();
		}
		else
		{
			throw new ItemNotFoundException();
		}
	}
}