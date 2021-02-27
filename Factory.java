public class Factory {
    
    public Varias getArrayL(){
        return new ArrayL<>();
    }

    public Varias getListas(int n){
        Varias a = null;
        if (n == 1){

            a = new SingleLinkedList<>();

        }else if (n ==2){
            a = new DoubleLinkedList<>();
        }
        

        return a;
    }

    public Varias getVector(){

        return new Vector_<>();
    }
}
