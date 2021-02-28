import java.util.Stack;

public class Calculadora {

    Vector_<Integer> data;

    //Se crea un objeto en la clase, el cual servirá para ser la única instancia de esta clase
    private  static Calculadora calc = new Calculadora();
    private Factory factory = new Factory();

    //Se declara un constructor para impedir que se puedan crear nuevas instancias, y lo declaramos como privado
    //Se evita tambien que creemos objetos desde otras clases 
    private Calculadora() {}

    //Declaramos un método público para obtener la unica instancia que hemos declarado en nuestra clase
    public static  Calculadora Singelton() {
      if (calc == null){

        calc = new Calculadora();
      }
      return calc;
    }

    //Método para hacer el calculo de la operacion
    public String calculo(String aString) 
    {
        int b = 0;
        int a = 0;
        data = new Vector_<Integer>();
        char ch[] = aString.toCharArray();
        for(char i: ch) 
        {
            if( i <= '9' && i >= '0' ) 
            {
              data.push((Integer)(i - '0'));
            } 
            //De lo contrario
            else {
              //Se ejecuta el método pop igualado a A y B
              b = data.pop();
              a = data.pop();
              //Se verifica si el caracter es un simbolo para su procesamiento
              switch(i){
                case '/':
                data.push(a/b);
                break;
                case '-':
                data.push(a-b);
                break;
                case '*':
                data.push(a*b);
                break;
                case '+':
                data.push(a+b);
                break;
              }
            }
        }

        return String.valueOf(data.pop());
    }

    //Método para verificar los signos correctos
    //Codigo reciclado con cambios
    public static int verif(char c){
        if (c == '+' || c == '-'){
            return 1;
        }
        else if (c == '/' || c == '*'){
            return 2;
        }
        else if (c == '^'){
            return 3;
        }
        else{
            return -1;
        }
    }



   //Calculadora de infixA postfix
   //Código reciclado de la calculadora 
    public static String infixtoPostfix(String parametro){
        String resultadoString = new String(""); 
        Stack<Character> stack = new Stack<>(); 
        for (int i = 0; i < parametro.length(); ++i){ 
            char c = parametro.charAt(i); 
            if (Character.isLetterOrDigit(c)) 
                resultadoString += c; 
            else if (c == '(') 
                stack.push(c);
            else if (c == ')') { 
                while (!stack.isEmpty() &&  stack.peek() != '(') 
                    resultadoString += stack.pop(); 
                
                    stack.pop(); 
            } 
            else{ 
                while (!stack.isEmpty() && verif(c)<= verif(stack.peek())){ 
                    resultadoString += stack.pop(); 
                } 
                stack.push(c); 
            }
        } 

        while (!stack.isEmpty()){ 
            if(stack.peek() == '(') 
                return "Operación es invalida"; 
            resultadoString += stack.pop(); 
        } 
        return resultadoString; 
    }
    
    
}
