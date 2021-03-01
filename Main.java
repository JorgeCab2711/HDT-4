import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        boolean enProceso = true;
        while (enProceso){
            try{
                //Se intancia todas las clases necesarias
                Scanner scan = new Scanner(System.in);
                Calculadora calcu = Calculadora.Singelton();
                ArrayList<String> infix = new ArrayList<String>();
                ArrayList<String> postfix = new ArrayList<String>();
                
                //Se le pide al usuario su operación en infix
                System.out.println("--------------------Calculadora infix postfix--------------\nIngrese la operación infix: ");
                String operacion = scan.next();
                infix.add(operacion);
                System.out.println("Sus datos en infix: "+ infix.get(0));
                //Se convierte a postfix
                postfix.add(calcu.infixtoPostfix(operacion));
                String dato = postfix.get(0);
                System.out.println("Sus datos en postfix: "+ dato);


                //Menú de selección
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
                Varias<String> otroDato = Factory.seleccionar(opcion1);

                for (int i = 0; i < otroDato.size() ; i++) {
                    System.out.println("Hola");
                    System.out.println(otroDato.pop());
                }


                
                enProceso = false;
            }
            catch (Exception e){
                System.out.println("Usted no ha ingresado una opcion correcta.");
            }
        }

        
        
    }
}