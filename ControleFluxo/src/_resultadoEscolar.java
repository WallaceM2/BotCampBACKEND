public class _resultadoEscolar {
    public static void main(String[] args) {
        
        int nota = 6; //Metodo otimizado do codigo, com "Se,senao-se,Senao";

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota >= 7 ? "Recuperação" : "Reprovado"; 


        /*int nota = 7
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado); */ // metodo menos extenso do codigo;

        /*int nota = 6;

        if (nota >= 7) 
            System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7) 
            System.out.println("Prova de recuperação");
        else 
            System.out.println("Reprovado");*/ // metodo extenso do codigo;p
    }
}
