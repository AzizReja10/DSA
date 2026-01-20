import java.util.Stack;
class MinStack {
 private Stack<Integer> ob=new Stack<>();;
  private Stack<Integer> ms=new Stack<>();;
    public MinStack() {
    }
    
    public void push(int val) {
         ob.push(val);
        if(ms.isEmpty()||val<=ms.peek())
          ms.push(val);
       
    }
    
    public void pop() {
        if(ob.peek().equals(ms.peek()))
        ms.pop();
        ob.pop();
    }
    
    public int top() {
       return ob.peek();
    }
    
    public int getMin() {
      return ms.peek();
    }
}
