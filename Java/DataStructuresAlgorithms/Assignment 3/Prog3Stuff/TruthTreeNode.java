//a truth tree node class
public class TruthTreeNode {
	
	private String pcSentence;
	private TruthTreeNode leftChild;
	private TruthTreeNode rightChild;
	private TruthTreeNode parent;
	private boolean checked;
	private boolean closed;

//a constructor
	public TruthTreeNode(String pcSentence) {
		this.pcSentence = pcSentence;
		this.leftChild = null;
		this.rightChild = null;
		this.parent = null;
		this.checked = false;
		this.closed = false;
	}
	
//another constructor - not needed for this program
	public TruthTreeNode(String pcSentence,TruthTreeNode leftChild, TruthTreeNode rightChild, TruthTreeNode parent, boolean checked, boolean closed) {
		this.pcSentence = pcSentence;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
		this.parent = parent;
		this.checked = false;
		this.closed = false;
	}
	
//setter for the left child 	
	public void setLeftChild(TruthTreeNode leftChild)
	{
		this.leftChild = leftChild;
	}
	
//getter for the left child	
	public TruthTreeNode getLeftChild()
	{
		return leftChild;
	}
	
//setter for the right child	
	public void setRightChild(TruthTreeNode rightChild)
	{
		this.rightChild = rightChild;
	}
	
//getter for the right child	
	public TruthTreeNode getRightChild()
	{
		return rightChild; 
	}
	
//setter for the parent
	public void setParent(TruthTreeNode parent)
	{
		this.parent = parent;
	}
	
//getter for the parent
	public TruthTreeNode getParent()
	{
		return parent;
	}
	
//setter for checking TruthTreeNode object	
	public void setChecked(boolean checked)
	{
		this.checked = checked;
	}

//getter for checked TruthTreeNode object	
	public boolean getChecked()
	{
		return checked;
	}

//setter for closed 	
	public void setClosed(boolean closed)
	{
		this.closed = closed;
	}
	
//getter for the closed	
	public boolean getClosed()
	{
		return closed;
	}
	
//get the left component of a conjunction, disjunction, conditional or biconditional
	public static String getLeftComponent(String expression) {
	
		int index = 1;
		int counter = 1;
		do {
			switch(expression.charAt(index)) {
				case 'p':
				case 'q':
				case 'r':
				case 's':
				case 't':
					counter--;
					index++;
					break;
				case '-':
					index++;
					break;
				case 'v':
				case '&':
				case '>':
				case '=':
					counter++;
					index++;
					break;
			}
		} while (counter != 0 && index < expression.length());
			return expression.substring(1,index);
	}
//get the right component of a conjunction, disjunction, conditional or biconditional
	public static String getRightComponent(String expression) {
	
		int index = 1;
		int counter = 1;
		do {
			
			switch(expression.charAt(index)) {
				case 'p':
				case 'q':
				case 'r':
				case 's':
				case 't':
					counter--;
					index++;
					break;
				case '-':
					index++;
					break;
				case 'v':
				case '&':
				case '>':
				case '=':
					counter++;
					index++;
					break;
			}
		} while (counter > 0 && index < expression.length());
			return expression.substring(index);
	}
//a setter method for the "cargo"
	public void setPcSentence(String pcSentence) {
		this.pcSentence = pcSentence;
	}
//a getter method
	public String getPcSentence() {
		return pcSentence;
	}

// methods to check the type of a sentence
	public boolean isDisjunction(String pcSentence) {
		if (pcSentence.charAt(0) == 'v')
			return true;
		return false;
	}
	
	public boolean isConjunction(String pcSentence) {
		if (pcSentence.charAt(0) == '&')
			return true;
		return false;
	}	

	public boolean isConditional(String pcSentence) {
		if (pcSentence.charAt(0) == '>')
			return true;
		return false;
	}
	
	public boolean isBiConditional(String pcSentence) {
		if (pcSentence.charAt(0) == '=')
			return true;
		return false;
	}	
	
	public boolean isNegatedDisjunction(String pcSentence) {
		if (pcSentence.charAt(1) == 'v' && pcSentence.charAt(0) == '-')
			return true;
		return false;
	}	
	
	public boolean isNegatedConjunction(String pcSentence) {
		if (pcSentence.charAt(1) == '&' && pcSentence.charAt(0) == '-')
			return true;
		return false;
	}
	
	public boolean isNegatedConditional(String pcSentence) {
		if (pcSentence.charAt(1) == '>' && pcSentence.charAt(0) == '-')
			return true;
		return false;
	}
	
	public boolean isNegatedBiConditional(String pcSentence) {
		if (pcSentence.charAt(1) == '=' && pcSentence.charAt(0) == '-')
			return true;
		return false;
	}
	
	public boolean isDoubleNegated(String pcSentence) {
		if (pcSentence.charAt(1) == '-' && pcSentence.charAt(0) == '-')
			return true;
		return false;
	}
	
//A method for attaching new leaves
	public void attach(String pcSentence) 
	{
		//if the sentence is a disjunction, attach like this
		if (this.isDisjunction(pcSentence) ) 
		{
			TruthTreeNode left = new TruthTreeNode(this.getLeftComponent(pcSentence));
			this.setLeftChild(left);
			left.setParent(this);
			//if it's atomic or the negation of an atomic sentence, check it
			if (left.getPcSentence().length() <= 2)
				left.setChecked(true);
			TruthTreeNode right = new TruthTreeNode(this.getRightComponent(pcSentence));
			this.setRightChild(right);
			right.setParent(this);
			//if it's atomic or the negation of an atomic sentence, check it
			if (right.getPcSentence().length() <= 2)
				right.setChecked(true);
		}
		//attach method for double negated sentence
		if (this.isDoubleNegated(pcSentence))
		{
			TruthTreeNode left = new TruthTreeNode(this.pcSentence.substring(2));
			this.setLeftChild(left);
			left.setParent(this);
			if (left.getPcSentence().length() <= 2)
				left.setChecked(true);
		}
		//attach method for conditional sentence
		if (this.isConditional(pcSentence))
		{
			TruthTreeNode left = new TruthTreeNode(this.getLeftComponent('-' + pcSentence));
			this.setLeftChild(left);
			left.setParent(this);
			//if it's atomic or the negation of an atomic sentence, check it
			if (left.getPcSentence().length() <= 2)
				left.setChecked(true);
			TruthTreeNode right = new TruthTreeNode(this.getRightComponent(pcSentence));
			this.setRightChild(right);
			right.setParent(this);
			//if it's atomic or the negation of an atomic sentence, check it
			if (right.getPcSentence().length() <= 2)
				right.setChecked(true);
		}
		
		//method for negated conjunction
		if (this.isNegatedConjunction(pcSentence))
		{
			TruthTreeNode left = new TruthTreeNode(this.getLeftComponent('-' + pcSentence));
			this.setLeftChild(left);
			left.setParent(this);
			//if it's atomic or the negation of an atomic sentence, check it
			if (left.getPcSentence().length() <= 2)
				left.setChecked(true);
			TruthTreeNode right = new TruthTreeNode(this.getRightComponent('-' + pcSentence));
			this.setRightChild(right);
			right.setParent(this);
			//if it's atomic or the negation of an atomic sentence, check it
			if (right.getPcSentence().length() <= 2)
				right.setChecked(true);
		}
		
		//if the sentence is a conjunction attach like this
		if (this.isConjunction(pcSentence)) 
		{
			TruthTreeNode left = new TruthTreeNode(this.getLeftComponent(pcSentence));
			this.setLeftChild(left);
			left.setParent(this);
			//if it's atomic or the negation of an atomic sentence, check it
			if (left.getPcSentence().length() <= 2)
				left.setChecked(true);
			//have to check for closure here
			boolean isClosed = false;
			TruthTreeNode temp = left;
			while (temp.getParent() != null) 
			{
				temp = temp.getParent();
				if (isContradiction(left.getPcSentence(), temp.getPcSentence()))
					isClosed = true;
			}
			
			TruthTreeNode leftleft = new TruthTreeNode(this.getRightComponent(pcSentence));
			left.setLeftChild(leftleft);
			leftleft.setParent(left);
			//if it's atomic or the negation of an atomic sentence, check it
			if (leftleft.getPcSentence().length() <= 2)
				leftleft.setChecked(true);
			//if the branch was closed because of the left conjunct, close the branch here
			if (isClosed)
				leftleft.setClosed(true);
		}
		
		//attach method for negated disjunction
		if (this.isNegatedDisjunction(pcSentence))
		{
			TruthTreeNode left = new TruthTreeNode(this.getLeftComponent('-' + pcSentence));
			this.setLeftChild(left);
			left.setParent(this);
			//if it's atomic or the negation of an atomic sentence, check it
			if (left.getPcSentence().length() <= 2)
				left.setChecked(true);
			//have to check for closure here
			boolean isClosed = false;
			TruthTreeNode temp = left;
			while (temp.getParent() != null) 
			{
				temp = temp.getParent();
				if (isContradiction(left.getPcSentence(), temp.getPcSentence()))
					isClosed = true;
			}
			
			TruthTreeNode leftleft = new TruthTreeNode(this.getRightComponent('-' + pcSentence));
			left.setLeftChild(leftleft);
			leftleft.setParent(left);
			//if it's atomic or the negation of an atomic sentence, check it
			if (leftleft.getPcSentence().length() <= 2)
				leftleft.setChecked(true);
			//if the branch was closed because of the left conjunct, close the branch here
			if (isClosed)
				leftleft.setClosed(true);
		}
		
		//attach method for negated conditional
		if (this.isNegatedConditional(pcSentence))
		{
			TruthTreeNode left = new TruthTreeNode(this.getLeftComponent(pcSentence));
			this.setLeftChild(left);
			left.setParent(this);
			//if it's atomic or the negation of an atomic sentence, check it
			if (left.getPcSentence().length() <= 2)
				left.setChecked(true);
			//have to check for closure here
			boolean isClosed = false;
			TruthTreeNode temp = left;
			while (temp.getParent() != null) 
			{
				temp = temp.getParent();
				if (isContradiction(left.getPcSentence(), temp.getPcSentence()))
					isClosed = true;
			}
			
			TruthTreeNode leftleft = new TruthTreeNode(this.getRightComponent('-' + pcSentence));
			left.setLeftChild(leftleft);
			leftleft.setParent(left);
			//if it's atomic or the negation of an atomic sentence, check it
			if (leftleft.getPcSentence().length() <= 2)
				leftleft.setChecked(true);
			//if the branch was closed because of the left conjunct, close the branch here
			if (isClosed)
				leftleft.setClosed(true);
		}
		
		//attach method for BiConditional
		if(this.isBiConditional(pcSentence))
		{
			TruthTreeNode left = new TruthTreeNode(this.getLeftComponent(pcSentence));
			this.setLeftChild(left);
			left.setParent(this);
			//if it's atomic or the negation of an atomic sentence, check it
			if (left.getPcSentence().length() <= 2)
				left.setChecked(true);
			//have to check for closure here
			boolean isClosed = false;
			TruthTreeNode temp = left;
			while (temp.getParent() != null) 
			{
				temp = temp.getParent();
				if (isContradiction(left.getPcSentence(), temp.getPcSentence()))
					isClosed = true;
			}
			
			TruthTreeNode leftleft = new TruthTreeNode(this.getRightComponent(pcSentence));
			left.setLeftChild(leftleft);
			leftleft.setParent(left);
			//if it's atomic or the negation of an atomic sentence, check it
			if (leftleft.getPcSentence().length() <= 2)
				leftleft.setChecked(true);
			//if the branch was closed because of the left conjunct, close the branch here
			if (isClosed)
				leftleft.setClosed(true);
			
			TruthTreeNode right = new TruthTreeNode(this.getLeftComponent('-' + pcSentence));
			this.setRightChild(right);
			right.setParent(this);
			if (right.getPcSentence().length() <= 2)
			{
				right.setChecked(true);
			}
			isClosed = false;
			temp = right;
			while (temp.getParent() != null) 
			{
				temp = temp.getParent();
				if (isContradiction(right.getPcSentence(), temp.getPcSentence()))
					isClosed = true;
			}
			
			TruthTreeNode rightleft = new TruthTreeNode(this.getRightComponent('-' + pcSentence));
			right.setLeftChild(rightleft);
			rightleft.setParent(right);
			//if it's atomic or the negation of an atomic sentence, check it
			if (rightleft.getPcSentence().length() <= 2)
				rightleft.setChecked(true);
			//if the branch was closed because of the left conjunct, close the branch here
			if (isClosed)
				rightleft.setClosed(true);
		}
		
		if (this.isNegatedBiConditional(pcSentence))
		{
			TruthTreeNode left = new TruthTreeNode(this.getLeftComponent(pcSentence));
			this.setLeftChild(left);
			left.setParent(this);
			//if it's atomic or the negation of an atomic sentence, check it
			if (left.getPcSentence().length() <= 2)
				left.setChecked(true);
			//have to check for closure here
			boolean isClosed = false;
			TruthTreeNode temp = left;
			while (temp.getParent() != null) 
			{
				temp = temp.getParent();
				if (isContradiction(left.getPcSentence(), temp.getPcSentence()))
					isClosed = true;
			}
			
			TruthTreeNode leftleft = new TruthTreeNode(this.getRightComponent('-' + pcSentence));
			left.setLeftChild(leftleft);
			leftleft.setParent(left);
			//if it's atomic or the negation of an atomic sentence, check it
			if (leftleft.getPcSentence().length() <= 2)
				leftleft.setChecked(true);
			//if the branch was closed because of the left conjunct, close the branch here
			if (isClosed)
				leftleft.setClosed(true);
			
			TruthTreeNode right = new TruthTreeNode(this.getLeftComponent('-' + pcSentence));
			this.setRightChild(right);
			right.setParent(this);
			if (right.getPcSentence().length() <= 2)
			{
				right.setChecked(true);
			}
			isClosed = false;
			temp = right;
			while (temp.getParent() != null) 
			{
				temp = temp.getParent();
				if (isContradiction(right.getPcSentence(), temp.getPcSentence()))
					isClosed = true;
			}
			
			TruthTreeNode rightleft = new TruthTreeNode(this.getRightComponent(pcSentence));
			right.setLeftChild(rightleft);
			rightleft.setParent(right);
			//if it's atomic or the negation of an atomic sentence, check it
			if (rightleft.getPcSentence().length() <= 2)
				rightleft.setChecked(true);
			//if the branch was closed because of the left conjunct, close the branch here
			if (isClosed)
				rightleft.setClosed(true);
		}
		
	}
	
//A method that returns true if sentence1 and sentence2 constitute a contradiction
//Implement it!!
	public boolean isContradiction(String sentence1, String sentence2) 
	{
		if (sentence1.substring(1, sentence1.length()).equals(sentence2) || sentence1.equals(sentence2.substring(1, sentence2. length())))
		{
			return true;
		}
		else
		{
		return false;
		}
	}
//A method to determine if a branch is closed.  Implement it!!
	public boolean findIfClosed(TruthTreeNode leaf) 
	{
		//if (isContradiction(leaf.getPcSentence(), leaf.getParent().getPcSentence()))
		if (leaf.getClosed() )
		{
			return true;
		}
		return false;
	}
}