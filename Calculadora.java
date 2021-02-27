public class Calculadora {

    Vector_<Integer> data;

    //Se crea un objeto en la clase, el cual servirá para ser la única instancia de esta clase
    private  static Calculadora calc = new Calculadora();

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
    
    
}
