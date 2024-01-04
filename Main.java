// Импорт необходимых классов и интерфейсов
import Classes.ActionClient;
import Classes.Actor;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;
import Classes.TaxInspector;
import Interfaces.iActorBehavior;

// Главный класс Main, содержащий метод main для запуска программы
public class Main {
    public static void main(String[] args) {
        // Создание объекта магазина
        Market magnit = new Market();

        // Создание обычных клиентов 
        Actor client1 = new OrdinaryClient("Bob", 1);
        Actor client2 = new OrdinaryClient("Jack", 2);

        // Создание специального клиента
        Actor client3 = new SpecialClient("Drake", 3);

        // Создание налогового инспектора
        iActorBehavior client4 = new TaxInspector(null);

        Actor client5 = new ActionClient("Tereza", "1000 buyer", 6);

        

        // Принятие клиентов в магазин
        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);

        // Обновление состояния магазина
        magnit.update();
    }
}
