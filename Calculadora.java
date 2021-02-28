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

    static String infixToPostfix(String exp) 
    { 
        // initializing empty String for result 
        String result = new String(""); 
          
        // initializing empty stack 
        factory.seleccionar();
          
        for (int i = 0; i<exp.length(); ++i) 
        { 
            char c = exp.charAt(i); 
              
            // If the scanned character is an 
            // operand, add it to output. 
            if (Character.isLetterOrDigit(c)) 
                result += c; 
               
            // If the scanned character is an '(',  
            // push it to the stack. 
            else if (c == '(') 
                stack.push(c); 
              
            //  If the scanned character is an ')',  
            // pop and output from the stack  
            // until an '(' is encountered. 
            else if (c == ')') 
            { 
                while (!stack.isEmpty() &&  
                        stack.peek() != '(') 
                    result += stack.pop(); 
                  
                    stack.pop(); 
            } 
            else // an operator is encountered 
            { 
                while (!stack.isEmpty() && Prec(c)  
                         <= Prec(stack.peek())){ 
                    
                    result += stack.pop(); 
             } 
                stack.push(c); 
            } 
       
        } 
       
        // pop all the operators from the stack 
        while (!stack.isEmpty()){ 
            if(stack.peek() == '(') 
                return "Invalid Expression"; 
            result += stack.pop(); 
         } 
        return result; 
    }
    
    
}
