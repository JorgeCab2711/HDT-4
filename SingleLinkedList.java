public class SingleLinkedList<T> extends Lista<T>{
    protected int count; 
    protected Node<T> head; 

    public void SingleLinkedList(){
      head = null;
      count = 0;
    }

    
    /** 
     * @param e
     */
    public void push(T e){
        head = new Node<T>(e, head);
        count++;
    }
    
    /** 
     * @return T
     */
    public T pop(){
        //pop de numeros
        Node<T> temp = head;
        head = head.next(); // move head down list
        count--;
        return temp.value();
    }
    
    
    /** 
     * @return int
     */
    public int size(){
        return count;
    }
}