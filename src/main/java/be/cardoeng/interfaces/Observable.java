package be.cardoeng.interfaces;

/**
 * Observable interface. Basically saying that every class we want to observe
 * should have a few methods :
 * - {@link #attach(Observer)} : to attach an observer to the observable
 * (so an observer wants to know when something happens/when something changes)
 * - {@link #detach(Observer)} : to detach an observer from the observable
 * (so an observer doesn't want to know anoymore when something happens/
 * when something changes)
 * - {@link #notifyObservers()} : to notify all the observers that something
 * happened/changed
 * Note that a Java {@link java.util.Observable} class already exists, but
 * is deprecated.
 *
 * L'interface Observable. En gros, chaque classe que l'on veut observer
 * doit avoir quelques méthodes :
 * - {@link #attach(Observer)} : pour attacher un observateur à l'observable
 * (donc un observateur veut savoir quand quelque chose se passe/quand
 * quelque chose change)
 * - {@link #detach(Observer)} : pour détacher un observateur de l'observable
 * (donc un observateur ne veut plus savoir quand quelque chose se passe/
 * quand quelque chose change)
 * - {@link #notifyObservers()} : pour notifier tous les observateurs que
 * quelque chose s'est passé/a changé
 */
public interface Observable {

    /**
     * Attach an observer to the observable.
     * (in other words, from now on, each times something changes,
     * {@code o} should be notified)
     *
     * Ajoute un observateur à l'observable.
     * (en d'autres termes, à partir de maintenant, chaque fois que quelque
     * chose change, {@code o} doit être notifié)
     *
     * @param o the observer to attach
     */
    void attach(Observer o);

    /**
     * Detach an observer from the observable.
     *
     * Détache un observateur de l'observable.
     *
     * @param o the observer to detach
     */
    void detach(Observer o);

    /**
     * Notify all the observers that something happened/changed.
     *
     * Notifie tous les observateurs que quelque chose s'est passé/a changé.
     */
    void notifyObservers();

}
