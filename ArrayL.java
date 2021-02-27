/*
Clase ArrayList
Creada por Natanael Girón y Jorge Caballeros
Feha de última modificación 23/02/2021
*/

import java.util.ArrayList;

public class ArrayL <T>  implements Varias <T>  {

    private ArrayList<T> arraylist = new ArrayList<T>();
    
    /** 
     * @param e
     */
    public void push(T e){
        arraylist.add(e);
    }
    
    /** 
     * @return T
     */
    public T pop(){
        //pop de numeros
        T d = arraylist.get(size()-1);
        arraylist.remove(d);
        return d;
    }
    
    
    /** 
     * @return int
     */
    public int size(){
        return arraylist.size();
    }
}
