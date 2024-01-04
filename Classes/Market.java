// Пакет, в котором находится класс
package Classes;

// Импорт необходимых интерфейсов и библиотек
import java.util.ArrayList;
import java.util.List;
import Interfaces.iActorBehavior;
import Interfaces.iMarketBehavior;
import Interfaces.iQueueBehavior;

// Класс Market реализует интерфейсы iMarketBehavior и iQueueBehavior
public class Market implements iMarketBehavior, iQueueBehavior {

    // Список для хранения клиента в очереди
    private List<iActorBehavior> queue;

    // Конструктор класса
    public Market() {
        // Инициализация списка очереди
        this.queue = new ArrayList<iActorBehavior>();
    }

    // Метод для принятия клиента в магазин
    @Override
    public void acceptToMarket(iActorBehavior actor) {
        System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
        // Помещение клиента в очередь
        takeInQueue(actor);
    }

    // Метод для добавления клиента в очередь
    @Override
    public void takeInQueue(iActorBehavior actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
    }

    // Метод для освобождения клиента из магазина
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            // Удаление клиента из очереди
            queue.remove(actor);
        }
    }

    // Метод для обновления состояния магазина
    @Override
    public void update() {
        // Выполнение заказов и освобождение из очереди
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    // Метод для передачи заказов клиентам
    @Override
    public void giveOrder() {
        for (iActorBehavior actor : queue) {
            if (actor.getActor().isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
            }
        }
    }

    // Метод для освобождения клиентов из очереди
    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehavior actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }
        }
        // Освобождение клиентов из магазина
        releaseFromMarket(releaseActors);
    }

    // Метод для принятия заказов от клиентов в очереди
    @Override
    public void takeOrder() {
        for (iActorBehavior actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");
            }
        }
    }
}
