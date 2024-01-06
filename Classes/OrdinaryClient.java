// Пакет, в котором находится класс
package Classes;

import Interfaces.iActionBehavior;
import Interfaces.iActorBehavior;
import Interfaces.iReturnOrder;

// Класс OrdinaryClient расширяет абстрактный класс Actor
public class OrdinaryClient extends Actor implements iReturnOrder{

    // Дополнительное поле класса, хранящее номер клиента
    private int number;
    // receipt
    private boolean haveReceipt;

 
    // Конструктор класса, принимающий имя и номер клиента при создании
    public OrdinaryClient(String name, int number, boolean haveReceipt) {
        // Вызов конструктора суперкласса (Actor) с передачей имени клиента
        super(name);
        // Установка номера клиента
        this.number = number;
        this.haveReceipt = haveReceipt;
    }

    // Переопределенный метод для получения имени клиента
    @Override
    public String getName() {
        return name;
    }

    // Переопределенный метод для установки имени клиента
    @Override
    public void setName(String name) {
        this.name = name;
    }

    // Метод для получения номера клиента
    public int getNumber() {
        return number;
    }

    // Метод для установки номера клиента
    public void setNumber(int number) {
        this.number = number;
    }

    // Метод для проверки, принимает ли клиент заказ (делегирование к суперклассу)
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    // Метод для проверки, выполняет ли клиент заказ (делегирование к суперклассу)
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    // Метод для установки флага принятия заказа (делегирование к суперклассу)
    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }

    // Метод для установки флага выполнения заказа (делегирование к суперклассу)
    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;
    }

    // Метод для получения самого объекта клиента
    public Actor getActor() {
        return this;
    }

    // Метод для возврата товара
    @Override
    public void returnOrder() {
       if (haveReceipt()) {
            // Логика возврата для клиента
            System.out.println("Возврат товара для покупателя");
        } else {
            System.out.println("Товар не возможно вернуть. У покупателя отсутствует чек");
        }   
    }

    // Проверка чека
    @Override
    public boolean haveReceipt() {
        return haveReceipt;
    }
}

