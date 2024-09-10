import java.util.concurrent.ThreadLocalRandom;

public class ExeploWhile {
    public static void main(String[] args) {
        
        double mesada = 50.0;
        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
             if (valorDoce > mesada) 
                    valorDoce = mesada;

                    System.out.println("Doce valor: " + valorDoce + " Adicionado no carrinho ");
                    mesada = mesada - valorDoce;
        }  

                    System.out.println("Mesada: " + mesada);
                    System.out.println("Louise gastou toda a sua mesada em doces.");
        }
    

    private static Double valorAleatorio() {
        
        return ThreadLocalRandom.current().nextDouble(2, 15);
        }

}
