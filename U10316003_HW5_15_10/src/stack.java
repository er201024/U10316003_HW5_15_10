import java.lang.Cloneable;
import java.util.ArrayList;
import static java.lang.System.out;

class MyStack implements  Cloneable{
	//new ArrayList name List
	public ArrayList<Object> list = new ArrayList<Object>();
	
	//Check stack empty
	public boolean isEmpty() {
		return isEmpty();
	}
	//Get size
	public int getSize() {
		return getSize();
	}
	//Peek stack
	public Object peek() {
		return list.get(getSize() - 1);
	}
	//remove string
	public Object pop() {
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}
	//push stack
	public void push(Object o) {
		list.add(o);
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		//super clone
		MyStack clone = (MyStack)super.clone();
		//deep copy
		clone.list = (ArrayList<Object>)(list.clone());
		return clone;
		} 
	/** Override the toString in the Object class */
	@Override 
	public String toString() {
		return "stack: " + toString();
	}
 
}

	public class stack{
		/*main method*/
		public static void main(String[] args) throws CloneNotSupportedException{	
		//call list1
		MyStack list1 = new MyStack();
		//call list2
		MyStack list2 = (MyStack)(list1.clone());
		//print list1 if not equal list2 is false
		out.print("list1 == list2 ? "+ (list1 == list2) + "\n");
		//print list1.list if not equal list2.list is false
		out.print("list1.list == list2.list ? "+ (list1.list == list2.list));
		}

	}

