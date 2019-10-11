import java.util.ArrayList;

public class ArrayStack implements Stack{

	ArrayList<Object> aStack = new ArrayList<Object>();


	@Override
	public Object peek() {
		if (aStack.isEmpty())
			return null;
		return aStack.get(size()-1);
	}


	@Override
	public Object pop() {
		if (aStack.isEmpty())
			return null;
		return aStack.remove(size()-1);
	}


	@Override
	public void push(Object object) {
		aStack.add(object);
		
	} 

	@Override
	public int size() {
		return aStack.size();
	}

}
