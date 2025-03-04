package org.example.model;

import java.util.Scanner;

public class Banco {

     public void menu() {

        Scanner sc = new Scanner(System.in);

         System.out.println("""
                0 - Sair
                1 - Consultar Saldo
                2 - Consultar Cheque Especial
                3 - Depositar dinheiro
                4 - Sacar dinheiro
                5 - Pagar boleto
                6 - Verficiar se a conta está usando cheque especial
                
                """);

        int opcao = sc.nextInt();


        while (opcao != 0) {
            switch (opcao) {
                case 1 -> consultar_saldo();
                case 2 -> consultar_cheque_especial();
                case 3 -> depositar();
                case 4 -> sacar();
                case 5 -> pagar_boleto();
                case 6 -> esta_usando_cheque_especial();
            }
        }
     }

    private void esta_usando_cheque_especial() {
    }

    private void pagar_boleto() {
    }

    private void sacar() {
    }

    private void depositar() {
    }

    private void consultar_cheque_especial() {
    }

    private void consultar_saldo() {
        int saldo = 0;
        int limiteChequeEspecial = 0;
    }
}
