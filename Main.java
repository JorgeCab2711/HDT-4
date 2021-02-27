import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Calculadora calcu = Calculadora.Singelton();
        Factory facto = new Factory();
        


        int opcion0 = 0;
        int opcion1 = 0;


        System.out.println("Bienvenido");
        System.out.println("Para utilizar nuestra calculadora, primero elija uno de los siguientes ADT a usar: ");
        System.out.println("1. Vector");
        System.out.println("2. ArrayList");
        System.out.println("3. Listas");

        opcion1 = scan.nextInt();
        scan.nextLine();

        if (opcion1 == 1){
            System.out.println("Ha seleccionado Vector.");
            facto.getVector();
        }
        else if (opcion1 == 2){

            System.out.println("Ha seleccionado ArrayList.");
            facto.getArrayL();
        }
        else if (opcion1 == 3){
            System.out.println("\nIngrese la lista que desea usar: \n[1] Singly Linked List\n[2] Double Linked List");
            int opcion2 = scan.nextInt();
            scan.nextLine();
            if (opcion2 == 1){
                facto.getListas(1);
            }
            else if (opcion2 == 2){
                System.out.println("Ha seleccionado Double Linked List.");
                facto.getListas(2);
            }

        }



    }
}