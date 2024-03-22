package com.nostratech;


public class Game {
	private Player[] players;
    private int[] dice;
    private int numberOfPlayers;
    private int maxDice;
    private String winner;
    
    public Game(Player[] players) {
        this.players = players;
    }
    
    public void startGame() {
        randomDice();
        decideWinner();
    }
    
    public void randomDice() {
    	dice = new int[players.length];
        numberOfPlayers = players.length;
        for (int i = 0; i < numberOfPlayers; i++) {
        	dice[i] = (int) (Math.random() * 6) + 1;
            System.out.println(players[i].getName() + " mendapatkan dadu " + dice[i]);
        }
    }

    public void decideWinner() {
    	maxDice = 0;
        winner = "";
        boolean draw = false;
        for (int i = 0; i < numberOfPlayers; i++) {
            if (dice[i] > maxDice) {
            	maxDice = dice[i];
                winner = players[i].getName();
                draw = false;
            } else if (dice[i] == maxDice) {
            	draw = true;
            }
        }
        if (draw) {
            System.out.println("\nPermainan seri, ulangi untuk pemain dengan dadu tertinggi");
            maxRandomDice();
        } else {
            System.out.println("\nPemenang permainan ini adalah " + winner);
        }
    }

    private void maxRandomDice() {
        boolean adaPemenang = false;
        for (int i = 0; i < numberOfPlayers; i++) {
            if (dice[i] == maxDice) {
            	dice[i] = (int) (Math.random() * 6) + 1;
                System.out.println(players[i].getName() + " mendapatkan dadu " + dice[i]);
                if (dice[i] != maxDice) {
                    adaPemenang = true;
                }
            }
        }
        if (adaPemenang) {
        	maxDice = 0;
            for (int i = 0; i < numberOfPlayers; i++) {
                if (dice[i] > maxDice) {
                	maxDice = dice[i];
                }
            }
            winner = "";
            for (int i = 0; i < numberOfPlayers; i++) {
                if (dice[i] == maxDice) {
                	winner = players[i].getName();
                    break;
                }
            }
            System.out.println("\nPemenang permainan ini adalah " + winner);
        }
    }
}
