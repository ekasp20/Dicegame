package com.nostratech;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagePlayers game = new ManagePlayers();
        System.out.print("Masukkan jumlah pemain yang ikut : ");
        int numberOfPlayers = scanner.nextInt();
        scanner.nextLine();
        if (numberOfPlayers < 2 || numberOfPlayers > 4) {
            System.out.println("Jumlah pemain tidak valid.");
            return;
        }
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.print("Masukkan nama masing-masing peserta yang ikut " + (i + 1) + ": ");
            String name = scanner.nextLine();
            game.addPlayer(name, i + 1);
        }
        game.displayPlayers();
        game.start();
    }
}
