// Пакет, в котором находится интерфейс
package Interfaces;

// Импорт класса Actor, используемого в интерфейсе
import Classes.Actor;

// Интерфейс iActorBehavior определяет поведение для клиентов
public interface iActorBehavior {

    // Метод для проверки, принимает ли клиент заказ
    public boolean isTakeOrder();

    // Метод для проверки, выполняет ли клиент заказ
    public boolean isMakeOrder();

    // Метод для установки флага принятия заказа
    public void setTakeOrder(boolean val);

    // Метод для установки флага выполнения заказа
    public void setMakeOrder(boolean val);

    // Метод для получения объекта клиента
    public Actor getActor();
}
