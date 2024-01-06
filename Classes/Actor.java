// Пакет, в котором находится класс
package Classes;

// Импорт интерфейса iActorBehavior
import Interfaces.iActorBehavior;


// Абстрактный класс Actor, реализующий интерфейс iActorBehavior
public abstract class Actor implements iActorBehavior{

    // Поля класса:

    // Имя 
    protected String name;
    
    // Флаг, указывающий, принимает ли клиента заказ
    protected boolean isTakeOrder;

    // Флаг, указывающий, выполняет ли клиента заказ
    protected boolean isMakeOrder;

    // Конструктор класса, принимающий имя клиента при создании
    public Actor(String name) {
        this.name = name;
    }

    // Абстрактный метод для получения имени клиента
    public abstract String getName();

    // Абстрактный метод для установки имени клиента
    public abstract void setName(String name);

    public abstract boolean haveReceipt(); 

    public abstract void returnOrder();
    
}
