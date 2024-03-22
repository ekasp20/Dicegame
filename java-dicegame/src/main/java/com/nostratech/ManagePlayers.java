package com.nostratech;

class ManagePlayers {
    private Player[] players;

    public ManagePlayers() {
        this.players = new Player[4];
    }

    public void addPlayer(String name, int playerNumber) {
        if (playerNumber >= 1 && playerNumber <= 4) {
            players[playerNumber - 1] = new Player();
            players[playerNumber - 1].setName(name);
        } else {
            System.out.println("Nomor pemain tidak valid.");
        }
    }

    public void start() {
        System.out.println("Permainan dimulai");
    }

    public void displayPlayers() {
        System.out.println("Nama-nama pemain yang ikut:");
        for (int i = 0; i < players.length; i++) {
            if (players[i] != null && !players[i].getName().isEmpty()) {
                System.out.println("Pemain " + (i + 1) + ": " + players[i].getName());
            }
        }
    }
}