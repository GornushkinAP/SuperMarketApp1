// Пакет, в котором находится класс
package Classes;

// Импорт интерфейса iActorBehavior
import Interfaces.iActorBehavior;

// Класс TaxInspector реализует интерфейс iActorBehavior
public class TaxInspector implements iActorBehavior {

    // Поле класса, хранящее имя налогового инспектора
    private String name;

    // Флаг, указывающий, принимает ли налоговый инспектор заказ
    private boolean isTakeOrder;

    // Флаг, указывающий, выполняет ли налоговый инспектор заказ
    private boolean isMakeOrder;

    // Конструктор класса, принимающий имя налогового инспектора при создании
    public TaxInspector(String name) {
        // Установка жестко заданного имени "Tax Inspector"
        this.name = "Tax Inspector";
    }

    // Метод для получения имени налогового инспектора
    public String getName() {
        return name;
    }

    // Переопределенный метод интерфейса для получения клиента (в данном случае, OrdinaryClient)
    @Override
    public Actor getActor() {
        // Создание и возвращение нового объекта OrdinaryClient с жестко заданными параметрами
        return new OrdinaryClient("Тайный покупатель",  4, true);
    }

    // Переопределенный метод интерфейса для проверки, выполняет ли налоговый инспектор заказ
    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    // Переопределенный метод интерфейса для проверки, принимает ли налоговый инспектор заказ
    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    // Переопределенный метод интерфейса для установки флага выполнения заказа
    @Override
    public void setMakeOrder(boolean val) {
        this.isMakeOrder = val;
    }

    // Переопределенный метод интерфейса для установки флага принятия заказа
    @Override
    public void setTakeOrder(boolean val) {
        this.isTakeOrder = val;
    }
}
