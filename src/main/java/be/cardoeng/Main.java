package be.cardoeng;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

    /**
     * TimerTask that moves the player to a random position.
     * This is just for the sake of the example.
     */
    protected static class MovePlayerTask extends TimerTask {

        private Player p;

        public MovePlayerTask(Player p) {
            this.p = p;
        }

        @Override
        public void run() {
            System.out.println("Main: Moving the player");
            p.move(Math.random() * 100, Math.random() * 100);
        }
    }

    public static void main(String[] args) {
        Timer timer = new Timer();
        Player p = new Player();
        Enemy e = new Enemy();
        // We set the focused player of the enemy
        e.setFocusedPlayer(p);

        timer.scheduleAtFixedRate(new MovePlayerTask(p), 0, 6000);
    }
}