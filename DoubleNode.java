//Codigo del módulo compartido del libro por Douglas
public class DoubleNode<T> {
    protected T t;
    protected DoubleNode<T> nextElement;
    protected DoubleNode<T> previousElement;

    public DoubleNode(T v, DoubleNode<T> next,DoubleNode<T> previous){
        t = v;
        nextElement = next;
        if (nextElement != null)
            nextElement.previousElement = this;
        previousElement = previous;
        if (previousElement != null)
            previousElement.nextElement = this;
    }

    public DoubleNode(T v){   
        this(v,null,null);
    }

    
    /** 
     * @return DoubleNode<T>
     */
    public DoubleNode<T> next()
    // post: returns reference to next value in list
    {
       return nextElement;
    }

    
    /** 
     * @param next
     */
    public void setNext(DoubleNode<T> next)
   // post: sets reference to new next value
   {
      nextElement = next;
   }

   
   /** 
    * @return T
    */
   public T value()
   // post: returns value associated with this element
   {
      return t;
   }

   
   /** 
    * @param value
    */
   public void setValue(T value)
   // post: sets value associated with this element
   {
      t = value;
   }


/** 
 * @return DoubleNode<T>
 */
public DoubleNode<T> previous() {
	return null;
}
}
