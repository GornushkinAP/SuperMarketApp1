package Interfaces;

import Classes.Actor;
import Classes.ActionClient;

public interface iActionBehavior {

        
    // Метод для получения названия акции
    public static void getActionName(){
       
    }

    // Метод для установки названия акции
    public void setActionName(String actionName);

    // Метод для получения количества клиентов
    public static int getAmountClients(int amountClients){
        return amountClients;
    }

    // Метод для установки количества клиентов
    public static void setAmountClients(int amountClients){}
    
    // Метод для получения победителя
    public ActionClient getActionClient();
        
    // Метод для установки победителя
    public ActionClient setActionClient();
       
    // Метод для проверки, принимает ли клиент заказ
    public boolean isTakeOrder();

    // Метод для проверки, выполняет ли клиент заказ
    public boolean isMakeOrder();


    // Метод для установки флага принятия заказа
    public void setTakeOrder(boolean val);

    // Метод для установки флага выполнения заказа
    public void setMakeOrder(boolean val);

    // // Метод для получения объекта клиента
    // public Actor getActor();
}
