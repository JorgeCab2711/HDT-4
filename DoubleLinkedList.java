//Codigo del módulo compartido del libro por Douglas
public class DoubleLinkedList<T> extends Lista<T>{
    protected int count;
    protected DoubleNode<T> head;
    protected DoubleNode<T> tail;

    public DoubleLinkedList(){
        head = null;
        tail = null;
        count = 0;
    }
    
    /** 
     * @param e
     */
    public void push(T e){
        head = new DoubleNode<T>(e, head, null);
        if (tail == null) tail = head;
        count++;
    }
    
    /** 
     * @return T
     */
    public T pop(){
        //pop de numeros
        DoubleNode<T> temp = head;
        head = head.next(); // move head down list
        count--;
        return temp.value();
    }
    
    
    /** 
     * @return int
     */
    @Override
    public int size(){
        return count;
    }
}