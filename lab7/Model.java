package lab7;
/*
здесь вычисления и внутреннее хранение данных
а также регистрация и уведомление слушателей
* */

import java.util.*;

public class Model implements Observable {
    private List<Observer> observers; // список слушателей
    private String result;
    private String varX;

    // конструктор: создаем новый список для <a>
    Model() {
        observers = new LinkedList<>();
    }

    // регистрация слушателя
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    // уведомление слушателей
    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.notification(message);
        }
    }

    public void setVarX(String s) {
        varX = s;
    }

    public String getVarX() {
        return varX;
    }

    public String getResult() {
        return result;
    }

    public void calculate() {
        summa();
        notifyObservers("summa");
    }

    private void summa() {
        Float array[] = new Float[Integer.parseInt(varX)];
        Random random = new Random();

        result = "Исходный массив: [";
        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextFloat() * 100) - 50f;
            result += array[i] + " ";
        }
        result += "]";

        Arrays.sort(array, Collections.reverseOrder());

        result += "\nИзмененный массив: [";
        for (int i = 0; i < array.length; i++) {
            result += array[i] + " ";
        }
        result += "]";

    }
}
