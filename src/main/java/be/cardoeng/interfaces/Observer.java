package be.cardoeng.interfaces;

/**
 * Observer interface. Basically saying that every class that should be able
 * to observe an observable should have a few methods :
 * - {@link #update(Observable)} : to update the observer when something
 * happened/changed
 * Note that a Java {@link java.util.Observer} class already exists, but
 * is deprecated.
 *
 * L'interface Observer. En gros, chaque classe qui doit pouvoir observer
 * un observable doit avoir quelques méthodes :
 * - {@link #update(Observable)} : pour mettre à jour l'observateur quand
 * quelque chose s'est passé/a changé
 * Notez qu'une classe Java {@link java.util.Observer} existe déjà, mais
 * est dépréciée.
 */
public interface Observer {

    /**
     * Update the observer when something happened/changed.
     * Called each time one of the observables (one of the thing we observe)
     * changed.
     *
     * Met à jour l'observateur quand quelque chose s'est passé/a changé.
     * Appelée chaque fois qu'un des observables (une des choses que l'on
     * observe) a changé.
     * @param o the observable that changed
     */
    void update(Observable o);
}
