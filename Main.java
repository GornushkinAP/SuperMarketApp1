// Импорт необходимых классов и интерфейсов
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Classes.ActionClient;
import Classes.Actor;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;
import Classes.TaxInspector;
import Classes.FileManager;
import Interfaces.iActionBehavior;
import Interfaces.iActorBehavior;
import Interfaces.iMarketBehavior;
import Interfaces.iReturnOrder;

// Главный класс Main, содержащий метод main для запуска программы
public class Main {
    public static void main(String[] args) {
        // Создание объекта магазина
        Market magnit = new Market();

        // Создание файл менеджера
        FileManager fileManager = new FileManager();

         List<iActorBehavior> loadedMarket = new ArrayList<>();
        try {
            loadedMarket = fileManager.readFromFile("SuperMarketApp.dat");
            System.out.println("Загруженные данные из файла:");
            for (iActorBehavior queue : loadedMarket) {
                System.out.println("Люди в маркете : " + queue.getActor().getName());
        } 
    }
        catch (IOException e) {
            System.err.println("Ошибка при чтении данных из файла: " + e.getMessage());
        }
         
        
        
        // Создание обычных клиентов 
        Actor client1 = new OrdinaryClient("Bob", 1, false);
        Actor client2 = new OrdinaryClient("Jack", 2, true);

        // Создание специального клиента
        Actor client3 = new SpecialClient("Drake", 3, false);

        // Создание налогового инспектора
        iActorBehavior client4 = new TaxInspector(null);

        // создание акционного клиента
        iActionBehavior client5 = new ActionClient("Tereza", null, 12);

        // создание возврата товара клиентом
        Actor client6 = new OrdinaryClient("Jhon", 47, true);
        Actor client7 = new SpecialClient("Tom", 67, false);

     
        // Принятие клиентов в магазин
        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        magnit.promotionInMarket(client5);
        magnit.processReturn(client6);
        magnit.processReturn(client7);


        // Обновление состояния магазина
        magnit.update();
        
        // //Вывод в консоль победителя акции и кол-во участников
        // System.out.println("Количество участников в акции: " + ActionClient.getAmountClients());
        // System.out.println("Победитель в акции: " + client5.getActionName() + " клиент с именем " + client5.getName());

        

            
    }
}
