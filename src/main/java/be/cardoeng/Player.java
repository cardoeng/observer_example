package be.cardoeng;

import be.cardoeng.interfaces.Observable;
import be.cardoeng.interfaces.Observer;

import java.awt.geom.Point2D;
import java.util.LinkedList;
import java.util.List;

/**
 * Player class. This is the observable class (the thing we want to know
 * when something changes).
 * It has a position and notifies its observers when it moves.
 *
 * Classe Player. C'est la classe observable (la chose dont on veut savoir
 * quand quelque chose change).
 * Elle a une position et notifie ses observateurs quand elle bouge.
 */
public class Player implements Observable {

    /**
     * List of observers. In this example, the only observer is the enemy.
     * But we could have multiple observers.
     *
     * Liste des observateurs. Dans cet exemple, le seul observateur est l'ennemi.
     * Mais on pourrait avoir plusieurs observateurs.
     */
    private List<Observer> observers;

    /**
     * Position of the player.
     *
     * Position du joueur.
     */
    private Point2D position;

    public Player() {
        position = new Point2D.Double(0, 0);
        observers = new LinkedList<>();
    }

    @Override
    public void attach(Observer o) {
        // We add the observer to the list of observers
        // On ajoute l'observateur à la liste des observateurs
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        // We remove the observer from the list of observers
        // On retire l'observateur de la liste des observateurs
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        System.out.println("Player: I'm notifying my observers");
        // We notify all the observers
        // On notifie tous les observateurs
        for (Observer o : observers)
            o.update(this);
    }

    public void move(double x, double y) {
        System.out.println("Player: I'm moving to (" + x + ", " + y + ")");
        position.setLocation(x, y);
        // Something changed, so we notify the observers
        // Quelque chose a changé, donc on notifie les observateurs
        notifyObservers();
    }

    public Point2D getPosition() {
        return position;
    }
}
