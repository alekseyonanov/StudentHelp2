package lab7;

public interface Observable {    // Observable - Наблюдаемый
    void registerObserver(Observer o);

    void notifyObservers(String message); //notify Observers - уведомить слушателей
}
