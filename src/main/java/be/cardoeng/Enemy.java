package be.cardoeng;

import be.cardoeng.interfaces.Observable;
import be.cardoeng.interfaces.Observer;

/**
 * Enemy class. This is the observer class (the thing that observes the
 * observable). It has a focused player and attach itself to it (observe it)
 *
 * Classe Enemy. C'est la classe observatrice (la chose qui observe l'observable).
 * Elle a un joueur suivi et s'attache à lui (l'observe).
 */
public class Enemy implements Observer {

    private Player focusedPlayer;

    @Override
    public void update(Observable o) {
        System.out.printf("Enemy: Something has changed with %s%n", o);
        // We know something has changed with o, but we don't know what
        // Player is the only observable in this example
        // so we can safely cast o to Player
        // And we know that the only thing that can change is the position
        // (here at least)
        // On sait que quelque chose a changé avec o, mais on ne sait pas quoi
        // Player est le seul observable dans cet exemple
        // donc on peut caster o en Player sans risque
        // Et on sait que la seule chose qui peut changer est la position
        // (ici du moins)
        Player p = (Player) o;
        System.out.printf("Enemy: The player has moved to (%f, %f)%n", p.getPosition().getX(), p.getPosition().getY());
        // Do whatever you gat to do with the player
        // ...
    }

    /**
     * Set the focused player of the enemy.
     * This is the player the enemy will follow.
     *
     * Définit le joueur suivi par l'ennemi.
     * C'est le joueur que l'ennemi va suivre.
     * @param p the player to follow
     */
    public void setFocusedPlayer(Player p) {
        if (focusedPlayer != null)
            // We detach ourselves from the previous player
            // On se détache du joueur précédent
            focusedPlayer.detach(this);
        focusedPlayer = p;
        // We attach ourselves to the player so we can be notified when it moves
        // On s'attache au joueur pour être notifié quand il bouge
        focusedPlayer.attach(this);
    }

}
