import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        boolean enProceso = true;
        while (enProceso){
            try{
                Scanner scan = new Scanner(System.in);
                Calculadora calcu = Calculadora.Singelton();
                String OperacionPersona;

                //Menú
                System.out.println("Bienvenido");
                System.out.println("Para utilizar nuestra calculadora, primero elija uno de los siguientes ADT a usar: ");
                System.out.println("1. Vector");
                System.out.println("2. ArrayList");
                System.out.println("3. SingleLinkedList");
                System.out.println("4. DoubleLinkedList");

                int opcion1 = scan.nextInt();
                scan.nextLine();
                if (opcion1 < 1 || opcion1 > 4){
                    throw new ArithmeticException("Error: El valor que Ud. debe seleccionar es de 1 a 4. ");
                }

                //Dependiendo de la opcion la persona hará que se operen los valores de cierta manera
                Varias fact = Factory.seleccionar(opcion1);
                fact.push("Hola");
                fact.push("Hola");
                fact.push("Hola");
                fact.push("Hola");
                System.out.println(fact.size());
                enProceso = false;
            }
            catch (Exception e){
                System.out.println("Usted no ha ingresado una opcion correcta.");
            }
        }

        
        
    }
}