import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Calculadora calcu = Calculadora.Singelton();
        


        int opcion0 = 0;
        int opcion1 = 0;
        String OperacionPersona;


        System.out.println("Bienvenido");
        System.out.println("Para utilizar nuestra calculadora, primero elija uno de los siguientes ADT a usar: ");
        System.out.println("1. Vector");
        System.out.println("2. ArrayList");
        System.out.println("3. SingleLinkedList");
        System.out.println("4. DoubleLinkedList");

        opcion1 = scan.nextInt();
        scan.nextLine();

        Varias fact = Factory.seleccionar(opcion1);

        System.out.println("A continuacion, ingrese la operacion que desea realizar: ");
        OperacionPersona = scan.next();
        scan.nextLine();
        
    }
}