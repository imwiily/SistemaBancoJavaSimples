package main;

import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        String menu = """
                
                Operaçoes:
                1- Consultar saldos
                2- receber valores
                3- Transferir valores
                4- Sair
                
                Digite a operaçao desejada:""";
        int opcao = 0;
        String nome = "Milene Ribeiro Alves";
        double saldo = 2500f;
        Scanner leitor = new Scanner(System.in);

        System.out.println(String.format("""
                        ***********************************
                        Dados iniciais do cliente:
                        Nome:          %s
                        Tipo de conta: Corrente
                        Saldo inicial: R$ %.2f
                        ***********************************""", nome, saldo));
        System.out.print(menu);
        opcao = leitor.nextInt();
        while(opcao != 4) {
            switch (opcao) {
                case 1: {
                    System.out.println(String.format("O saldo atual é R$ %.2f", saldo));
                    System.out.print(menu);
                    opcao = leitor.nextInt();
                    break;
                }
                case 2: {
                    System.out.print("Informe o valor deseja depositar: ");
                    double depositoValor = leitor.nextDouble();
                    saldo += depositoValor;
                    System.out.println(String.format("Saldo atualizado para R$ %.2f", saldo));
                    System.out.print(menu);
                    opcao = leitor.nextInt();
                    break;
                }
                case 3: {
                    System.out.print("Informe o valor que deseja transferir: ");
                    double transfValor = leitor.nextDouble();
                    if (transfValor > saldo) {
                        System.out.println("Não há saldo o suficiente para realizar essa transferência!");
                    } else {
                        saldo -= transfValor;
                        System.out.println(String.format("Saldo atualizado para R$ %.2f", saldo));
                        System.out.print(menu);
                        opcao = leitor.nextInt();
                    }
                    break;
                }
                default: {
                    System.out.println("Opção inválida");
                    System.out.print(menu);
                    opcao = leitor.nextInt();
                    break;
                }
            }


        }
        System.out.println("Banco Regis Roger agradece a preferência! Até logo!");
    }
}
