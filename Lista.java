import java.util.LinkedList;
//Codigo del módulo compartido del libro por Douglas
public class Lista <T> implements Varias<T> {

    LinkedList<T> list = new LinkedList<T>();

    @Override
    public void push(T e) {
        // TODO Auto-generated method stub
        list.add(e);
    }

    @Override
    public T pop() {
        // TODO Auto-generated method stub
        T d = list.get(size()-1);
        list.remove(d);
        return d;
        
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return list.size();
    }
       
    
}
