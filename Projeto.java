package calculadoraBasesDiferentes;

import java.util.Scanner;

public class Projeto {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Selecoes s = new Selecoes();
        Operacoes operador = new Operacoes();



            while(s.getOpcaoIncial() != -1) {

            System.out.print(" Digite 1 para conversão // 2 para operações matematicas com retorno em mesma base // 3 para retorno em base diferente: ");
            s.setOpcaoIncial(entrada.nextInt());
            System.out.println(" Caso queria sair digite -1 em qualquer seleção");

                if (s.getOpcaoIncial() == 1) {

                    System.out.println(" Você selecionou a opção de Conversão entre diferentes bases");
                    System.out.print(" Digite o numero a ser convertido: ");
                    operador.setNuA(entrada.next());
                    System.out.print(" Em qual base ele se encontra: ");
                    operador.setBaseAtual(entrada.nextInt());
                    System.out.print(" Para qual base converter: ");
                    operador.setBaseConv(entrada.nextInt());
                    System.out.print(" O valor convertido é igual a: " + operador.converteNu());

                } else if (s.getOpcaoIncial() == 2) {

                    System.out.println(" Você selecionou a opção de Operações Matematicas entre bases iguas");
                    System.out.print(" 1-Soma // 2-Subtração // 3-Multiplicação // 4-Divisão");
                    System.out.print(". Digite a operação desejada:");
                    s.setOpcaoCalculo(entrada.nextInt());

                    if (s.getOpcaoCalculo() == 1){
                        System.out.println("Voce selecionou a opção soma.");
                        System.out.print(" Digite o primeiro numero: ");
                        operador.setNuA(entrada.next());
                        System.out.print(" Digite o segundo numero: ");
                        operador.setNuB((entrada.next()));
                        System.out.print(" Digite a base que eles estão: ");
                        operador.setBaseAtual((entrada.nextInt()));
                        System.out.printf("O resultado da conta foi: %s%n", operador.somarMesma());
                    } else if (s.getOpcaoCalculo() == 2){
                        System.out.println("Voce selecionou a opção subtração.");
                        System.out.print(" Digite o primeiro numero: ");
                        operador.setNuA(entrada.next());
                        System.out.print(" Digite o segundo numero: ");
                        operador.setNuB(entrada.next());
                        System.out.print(" Digite a base que eles estão: ");
                        operador.setBaseAtual((entrada.nextInt()));
                        System.out.printf("O valor da subtração foi: %s%n", operador.substracaoMesma());
                    } else if (s.getOpcaoCalculo() == 3){
                        System.out.println("Voce selecionou a opção multiplicação.");
                        System.out.print(" Digite o primeiro numero: ");
                        operador.setNuA(entrada.next());
                        System.out.print(" Digite o segundo numero: ");
                        operador.setNuB(entrada.next());
                        System.out.print(" Digite a base que eles estão: ");
                        operador.setBaseAtual((entrada.nextInt()));
                        System.out.printf("O valor da multiplicação foi: %s%n", operador.multiplicacaoMesma());
                    } else if (s.getOpcaoCalculo() == 4) {
                        System.out.println("Voce selecionou a opção divisão.");
                        System.out.print(" Digite o primeiro numero: ");
                        operador.setNuA(entrada.next());
                        System.out.print(" Digite o segundo numero: ");
                        operador.setNuB(entrada.next());
                        System.out.print(" Digite a base que eles estão: ");
                        operador.setBaseAtual((entrada.nextInt()));
                        System.out.printf(" O valor da divisão é: %s%n", operador.divisaoMesma());
                    }

                } else if (s.getOpcaoIncial() == 3) {

                    System.out.println(" Você selecionou a opção de Operações Matematicas entre diferentes bases");
                    System.out.print(" 1-Soma // 2-Subtração // 3-Multiplicação // 4-Divisão");
                    System.out.print(". Digite a operação desejada:");
                    s.setOpcaoCalculo(entrada.nextInt());

                    if (s.getOpcaoCalculo() == 1){
                        System.out.println("Voce selecionou a opção soma.");
                        System.out.print(" Digite o primeiro numero: ");
                        operador.setNuA(entrada.next());
                        System.out.print(" Digite o segundo numero: ");
                        operador.setNuB((entrada.next()));
                        System.out.print(" Digite a base que eles estão: ");
                        operador.setBaseAtual((entrada.nextInt()));
                        System.out.print(" Digite a base que você deseja o resultado: ");
                        operador.setBaseConv((entrada.nextInt()));
                        System.out.printf("O resultado da conta foi: %s%n", operador.somarDiferente());
                    } else if (s.getOpcaoCalculo() == 2){
                        System.out.println("Voce selecionou a opção subtração.");
                        System.out.print(" Digite o primeiro numero: ");
                        operador.setNuA(entrada.next());
                        System.out.print(" Digite o segundo numero: ");
                        operador.setNuB(entrada.next());
                        System.out.print(" Digite a base que eles estão: ");
                        operador.setBaseAtual((entrada.nextInt()));
                        System.out.print(" Digite a base que você deseja o resultado: ");
                        operador.setBaseConv((entrada.nextInt()));
                        System.out.printf("O valor da subtração foi: %s%n", operador.substracaoDiferente());
                    } else if (s.getOpcaoCalculo() == 3){
                        System.out.println("Voce selecionou a opção multiplicação.");
                        System.out.print(" Digite o primeiro numero: ");
                        operador.setNuA(entrada.next());
                        System.out.print(" Digite o segundo numero: ");
                        operador.setNuB(entrada.next());
                        System.out.print(" Digite a base que eles estão: ");
                        operador.setBaseAtual((entrada.nextInt()));
                        System.out.print(" Digite a base que você deseja o resultado: ");
                        operador.setBaseConv((entrada.nextInt()));
                        System.out.printf("O valor da multiplicação foi: %s%n", operador.multiplicacaoDiferente());
                    } else if (s.getOpcaoCalculo() == 4) {
                        System.out.println("Voce selecionou a opção divisão.");
                        System.out.print(" Digite o primeiro numero: ");
                        operador.setNuA(entrada.next());
                        System.out.print(" Digite o segundo numero: ");
                        operador.setNuB(entrada.next());
                        System.out.print(" Digite a base que eles estão: ");
                        operador.setBaseAtual((entrada.nextInt()));
                        System.out.print(" Digite a base que você deseja o resultado: ");
                        operador.setBaseConv((entrada.nextInt()));
                        System.out.printf(" O valor da divisão é: %s%n", operador.divisaoDiferente());
                    }
                }

        }

        System.out.println("OOBRIGADO POR UTILIZAR NOSSA CALCULADORA !!!");
        System.out.println("SISTEMA ENCERRADO !!!");
        entrada.close();
    }

}
