public class _ExemploBreakContinue {
    public static void main(String[] args) {
        
        for (int numero = 1; numero <=5; numero++) {
            if (numero == 3) 
                continue; //Continue muda o fluxo, porem, nao para a proposta;
                // diferente do break, ele desconsidera e continua a proposta;

                System.out.println(numero);
            
        }
    }
}
