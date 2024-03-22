package com.nostratech;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah pemain yang ikut : ");
        int numberOfPlayers = scanner.nextInt();
        Player[] players = new Player[numberOfPlayers];
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.print("Masukkan nama masing-masing peserta yang ikut " + (i+1) + ": ");
            String name = scanner.next();
            players[i] = new Player();
            players[i].setName(name);
        }
        System.out.println("Nama-nama pemain yang ikut:");
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Pemain " + (i+1) + ": " + players[i].getName());
        }
        Game game = new Game(players);
        game.startGame();
        
        scanner.close();
    }
}