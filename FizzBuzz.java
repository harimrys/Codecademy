public class FizzBuzz{

  public static void main(String[] args){
    for (int i = 1; i <= 100; i++){
      //Si i es multiplo de 3 Y i es multiplo de 5
      if(i % 3 == 0 && i % 5 == 0){
        System.out.println("FizzBuzz"); //se imprime esto
        }
        else if(i % 3 == 0){ //si solo es multiplo de 3
          System.out.println("Fizz"); //imprime esto
        }
        else if(i % 5 == 0){ //si solo es multiplo de 5
          System.out.println("Buzz"); //imprime esto
        }else{
          System.out.println(i); //si no, solo imprimira el numero
        }
    }
  }
}
