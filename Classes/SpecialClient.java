// Пакет, в котором находится класс
package Classes;

// Класс SpecialClient расширяет абстрактный класс Actor
public class SpecialClient extends Actor {

    // Дополнительное поле класса, хранящее идентификатор VIP-клиента
    private int vipId;

    // Конструктор класса, принимающий имя и идентификатор VIP-клиента при создании
    public SpecialClient(String name, int vipId) {
        // Вызов конструктора суперкласса (Actor) с передачей имени клиента
        super(name);
        // Установка идентификатора VIP-клиента
        this.vipId = vipId;
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

    // Метод для получения идентификатора VIP-клиента
    public int getVipId() {
        return vipId;
    }

    // Метод для установки идентификатора VIP-клиента
    public void setVipId(int vipId) {
        this.vipId = vipId;
    }

    // Метод для проверки, принимает ли VIP-клиент заказ (делегирование к суперклассу)
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    // Метод для проверки, выполняет ли VIP-клиент заказ (делегирование к суперклассу)
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
}
