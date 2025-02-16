import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void  main (String[] args) {
        double mesada = 50.0;

        while (mesada > 0 ){
          double valorDoce = valorAleatorio();

            if (valorDoce > mesada ) {
                valorDoce = mesada;
               
            }

            System.out.println("Doce do valor: R$" + valorDoce + " adicionado ao carrinho");
            mesada -= valorDoce; 
            System.out.println("Mesada restante: R$" + mesada);
        } 

        System.out.println("Guilherme gastou toda sua mesada em doces!");
    }


        private static double valorAleatorio() {
            return ThreadLocalRandom.current().nextDouble(5,10);
        }
   
}
