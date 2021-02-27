public class Factory {
    
    public Varias getArrayL(){
        return new ArrayL<>();
    }

    public Varias getListas(int n){
        if (n == 1){
            return new SingleLinkedList<>();
        }else if (n ==2){
            return new DoubleLinkedList<>();
        }
    }

    public Varias getVector(){

        return new Vector_<>();
    }
}
