package org.example.ex3Pet;

import java.util.Scanner;

public class Main {

    private final static Scanner scanner= new Scanner(System.in);
    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {

        var option = -1;

        do {
            System.out.println("""
                Escolha uma das opções:
                =======================
                0 - Sair
                1 - Dar banho no Pet
                2 - Abastecer Máquina com água
                3 - Abastecer Máquina com shampoo
                4 - Verificar água
                5 - Verificar Shampoo
                6 - Verificar se tem pet no banho
                7 - Colocar pet na máquina
                8 - Retirar pet da máquina
                9 - Limpar máquina
                =======================
                """);
            option = scanner.nextInt();

            switch(option){
                case 1 -> petMachine.takeAShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 ->  verifyShampoo();
                case 6 -> CheckIfHasPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida");
            }

        }while (true);
    }

    private static void setWater() {
        System.out.println("Testando colocar água na máquina");
        petMachine.addWater();
    }

    private static void setShampoo() {
        System.out.println("Testando colocar shampoo na máquina");
        petMachine.addShampoo();
    }

    private static void verifyWater() {
        var amount = petMachine.getWater();
        System.out.println("A máquina está no momento com " + amount + "litro(s) de água" );
    }

    private static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println("A máquina está no momento com " + amount + "litro(s) de Shampoo" );
    }

    private static boolean CheckIfHasPetInMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina" : "Não tem pet na máquina");
        return hasPet;
    }

    public static void setPetInPetMachine() {
        var name = "";
        while (name == null || name.isEmpty()) {
            System.out.println("Informe o nome do pet");
            name = scanner.nextLine();
        }

        var pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina");
    }


}
