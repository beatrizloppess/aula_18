public class ExemplosBasicos{
   public static void main (String args []){
    //Repetição controlada por contador
    //Declarar o contador
     int cont = 1;
     while (cont <= 3){ //Boleana
        System.out.println(cont);
        cont = cont + 1;
     }
     for(int cont = 1;cont <= 3;cont = cont + 1){
      System.out.println(cont);
     }
     int cont = 1;
     do{
      System.out.printf("Valor da vez %d\n", cont);
     }while(cont <= 3);
   }

