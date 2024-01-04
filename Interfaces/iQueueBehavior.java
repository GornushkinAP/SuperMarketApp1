// Пакет, в котором находится интерфейс
package Interfaces;

// Импорт класса Actor, используемого в интерфейсе
import Classes.Actor;

// Интерфейс iQueueBehavior определяет поведение для работы с очередью
public interface iQueueBehavior {

    // Метод для добавления клиентов в очередь
    public void takeInQueue(iActorBehavior actor);

    // Метод для освобождения клиентов из очереди
    public void releaseFromQueue();

    // Метод для принятия заказов от клиентов в очереди
    public void takeOrder();

    // Метод для передачи заказов клиентам в очереди
    public void giveOrder();
}
