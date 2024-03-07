package main;

import java.util.Scanner;
import Class.BasicPlanning;
import Class.DebitPlanning;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            exibirMenu();
            int escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    realizarPlanejamentoBasico();
                    break;
                case 2:
                    realizarPlanejamentoDebito(input);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");

            }
        }
    }

    private static void exibirMenu() {
        System.out.println("==========MENU======== ");
        System.out.println("1 - Basic Planning");
        System.out.println("2 - Debit Planning");
        System.out.print("Escolha: ");
    }
    private static void realizarPlanejamentoBasico() {
        BasicPlanning planning = new BasicPlanning();
        configurarPlano(planning);
        planning.calculateDistribution(864.64F);
    }

    private static void realizarPlanejamentoDebito(Scanner input) {
        DebitPlanning planning = new DebitPlanning();
        configurarPlano(planning);
        System.out.print("Valor da dívida: R$");
        float debit = input.nextFloat();
        planning.calculateDistribution(864.64F, debit);
    }

    private static void configurarPlano(BasicPlanning planning) {
        planning.setPercentReserve(0.20F);
        planning.setPercentInvestment(0.30F);
        planning.setPercentExpenses(0.50F);
    }

    private static void configurarPlano(DebitPlanning planning) {
        planning.setPercentReserve(0.20F);
        planning.setPercentInvestment(0.30F);
        planning.setPercentExpenses(0.50F);
    }
}