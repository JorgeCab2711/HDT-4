import java.util.Vector;

public class Vector_ <T> extends Varias <T>{
//-----------atributos*--------------
  Vector<T> vect = new Vector<T>();

  @Override
  public void push(T e) {
    // TODO Auto-generated method stub
    vect.add(e);
  }

  @Override
  public T pop() {
    // TODO Auto-generated method stub
    T p = vect.get(size()-1);
    vect.remove(p);
    return p;
  }


  @Override
  public int size() {
    // TODO Auto-generated method stub
    return vect.size();
  }


  
}
