import java.lang.Cloneable;
import java.util.ArrayList;

import static java.lang.System.out;

class MyStack implements  Cloneable{
	
	public ArrayList<Object> list = new ArrayList<Object>();
	
	
  public boolean isEmpty() {
    return isEmpty();
  }

  public int getSize() {
    return getSize();
  }

  public Object peek() {
    return list.get(getSize() - 1);
  }

  public Object pop() {
    Object o = list.get(getSize() - 1);
    list.remove(getSize() - 1);
    return o;
  }

  public void push(Object o) {
    list.add(o);
  }
  @Override
  public Object clone() throws CloneNotSupportedException{
	
		
	  MyStack clone = (MyStack)super.clone();
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
 public static void main(String[] args) throws CloneNotSupportedException{
		
		MyStack list1 = new MyStack();
		MyStack list2 = (MyStack)(list1.clone());
		out.print("list1 == list2 ? "+ (list1 == list2) + "\n");
		out.print("list1.list == list2.list ? "+ (list1.list == list2.list));
	}

	
}

