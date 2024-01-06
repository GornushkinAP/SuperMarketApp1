// Пакет в котором находитсся класс
package Classes;

import java.util.Random;

import Interfaces.iActionBehavior;
// import Interfaces.iActorBehavior;

//класс ActionClient расширяет абстрактный класс Actor
public class ActionClient implements iActionBehavior{

    // Дополнительное поле класса хранящее:
    // Client Name
    private static String name;
    //имя акции
    public static String actionName;

    //номер акционного клиента
    public int actionClientID;

    //количество клиентов
    private static int amountClients;
    

    // Флаг, указывающий, принимает ли клиент заказ
    private boolean isTakeOrder;

    // Флаг, указывающий, выполняет ли клиент заказ
    private boolean isMakeOrder;

    // Конструктор класса, принимающий имя и номер акционного клиента и название акции при создании
    public ActionClient(String name, String actionName, int actionClientID) {
        ActionClient.name = name;
        ActionClient.actionName =  "'Lucky Buyer'";
        this.actionClientID = actionClientID;
    }

    // Метод для получения 
    public static String getName() {
        return name;
    }

    @Override
    public ActionClient getActionClient() {
        return new ActionClient(name, actionName, 12);
    }

  

  
    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public ActionClient setActionClient() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setActionName(String actionName) {
        ActionClient.actionName = actionName;
        
    }

    @Override
    public void setMakeOrder(boolean val) {
        this.isMakeOrder = val;
        
    }

    @Override
    public void setTakeOrder(boolean val) {
        this.isTakeOrder = val;
        
    }

    // Метод для получения количества клиентов
    public static int getAmountClients(){
        return amountClients = new Random().nextInt(20)+1;
    }

    // Метод для установки количества клиентов
    public static void setAmountClients(int amountClients){}

    public static String getActionName() {
        return ActionClient.actionName;
    }

    public int getActionClientID() {
        return actionClientID;
    }
    
    
   
}
