// Пакет в котором находитсся класс
package Classes;

//класс ActionClient расширяет абстрактный класс Actor
public class ActionClient extends Actor {


    // Дополнительное поле класса, хранящее имя акции, номер акционного клиента, количество клиентов
    private String actionName;

    private int actionClientID;

    static int amountClients;

    // Конструктор класса, принимающий имя и номер акционного клиента и название акции при создании
    public ActionClient(String name, String actionName, int actionClientID) {
        super(name);
        this.actionName = actionName;
        this.actionClientID = actionClientID;
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

    // Метод для получения номера акционного клиента
    public int getActionClientID() {
        return actionClientID;
    }

    // Метод для установки номера акционного клиента
    public void setActionClientID(int actionClientID) {
        this.actionClientID = actionClientID;
    }

    // Метод для получения самого объекта клиента
    @Override
    public Actor getActor() {
        return this;
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

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public static int getAmountClients() {
        return amountClients;
    }

    public static void setAmountClients(int amountClients) {
        ActionClient.amountClients = amountClients;
    }


    
}
