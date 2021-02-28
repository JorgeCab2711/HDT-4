public class Factory {
    
    public static Varias seleccionar(int clase){
        
        switch(clase){
            case 1:
                return new Vector_<>();
            case 2:
                return new ArrayL<>();
            case 3:
                return new SingleLinkedList<>();
            case 4:
                return new DoubleLinkedList<>();
            default:
            System.out.println("No se encuentra el objeto en factory.");
            return null;
        }
    }
}
