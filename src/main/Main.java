package main;

import Class.BasicPlanning;
import Class.DebitPlanning;

import javax.sound.midi.Soundbank;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==========MENU======== ");
        System.out.println("1 - Basic Planning");
        System.out.println("2 - Debit Planning");
        System.out.print("Escolha: ");
        int esc = input.nextInt();

        try {
            if(esc == 1) {
                BasicPlanning planning = new BasicPlanning();

                planning.setPercentReserve(0.20F);
                planning.setPercentInvestment(0.30F);
                planning.setPercentExpenses(0.50F);

                planning.calculateDistribution(864.64F);
            } else if (esc == 2) {
                DebitPlanning planning = new DebitPlanning();

                planning.setPercentReserve(0.20F);
                planning.setPercentInvestment(0.30F);
                planning.setPercentExpenses(0.50F);

                System.out.print("Valor da dívida: R$");
                float debit = input.nextFloat();

                planning.calculateDistribution(864.64F, debit);
            }
        } catch (Exception e) {
            System.out.println("Não foi possível completar a operação");
        }
    }
}