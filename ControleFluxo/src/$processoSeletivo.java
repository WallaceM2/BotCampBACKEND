import java.sql.SQLOutput;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class $processoSeletivo {
    public static void main(String[] args) {
            String[] candidatos = {"Ana", "Louise", "Daiana", "Edlaercio", "Mateus", "Dandara", "Noah", "Livia", "Elisa", "Jane"};
            for(String candidato: candidatos) {
                entrandoContato(candidato);
        }

        /*analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);*/
    }

            static void entrandoContato(String candidato){
                int tentativasRealizadas = 1;
                boolean continuarTentando = true;
                boolean atendeu = false;

                do {  //elas precisam sofrer alterações, caso contrario looping eterno = error;

                    atendeu = atender();
                    continuarTentando = !atendeu;

                    if (continuarTentando) {
                        tentativasRealizadas++;
                    }else {
                        System.out.println("CONTATO REALIZADO COM SUCESSO!!!");
                    }
                    
                } while (continuarTentando && tentativasRealizadas < 3);

                    if (atendeu) {
                        System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTIVA");
                    }else {
                        System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NUMERO MAXIMO DE TENTATIVAS REALIZADAS.");
                    }

            }

            //metodo auxiliar;
            static boolean atender() {
                return new Random().nextInt(3) == 1;
            }


            static void imprimirSelecionados() {
                        String[] candidatos = {"Ana", "Louise", "Daiana", "Edlaercio", "Mateus", "Dandara", "Noah", "Livia", "Elisa", "Jane"};
                        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
                        for (int indice = 0; indice < candidatos.length; indice++) {
                            System.out.println("O candidato de n " + indice + " é " + candidatos[indice]);
                        }

                        System.out.println("Forma abreviada do for each");

                        for (String candidato: candidatos) {
                            System.out.println("O candidato selecionado foi " + candidato);
                        }
            }

                static void selecaoCandidatos() {
                        String[] candidatos = {"Ana", "Louise", "Daiana", "Edlaercio", "Mateus", "Dandara", "Noah", "Livia", "Elisa", "Jane"};
                            int candidatosSelecionados = 0;
                            int candidatoAtual = 0;
                            double salarioBase = 2000.0;
                            while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
                                String candidato = candidatos[candidatoAtual];
                                double salarioPrentedido = valorPretendido();

                                System.out.println("O candidato " + candidato + " Solicitou este valor de salario " + salarioPrentedido);

                                if (salarioBase >= salarioPrentedido) {
                                    System.out.println("Candidato " + candidato + " foi selecionado para a vaga!!!");
                                        candidatosSelecionados++;
                                } else {
                                    System.out.println("Candidato reprovado");
                                }

                                candidatoAtual++;
                            }
                  }

                    static double valorPretendido() {
                        return ThreadLocalRandom.current().nextDouble(1800, 2200);
                    } //Threadlocalrandom serve para jogar aleatoriamente um numero entre 1800 / 2200;

                    static void analisarCandidato(double salarioPretendido) {
                        double salarioBase = 2000.0;
                            if (salarioBase > salarioPretendido) {
                                System.out.println("Ligar para o candidato");
                            } else if (salarioBase == salarioPretendido) {
                                System.out.println("Ligando com uma contraproposta");

                            }else  {
                                System.out.println("Aguardando demais candidatos");
                            }
                    }
 }

