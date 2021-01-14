package lab7;

/*
* Это интерфейс для организации паттерна Слушатель
https://ru.wikipedia.org/wiki/Наблюдатель_(шаблон_проектирования)
* */
interface Observer {     // слушатель
    void notification(String message);   // notification - уведомление
}
