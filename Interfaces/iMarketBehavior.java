// Пакет, в котором находится интерфейс
package Interfaces;

// Импорт необходимых классов и библиотек
import java.util.List;
import Classes.Actor;

// Интерфейс iMarketBehavior определяет поведение для магазина
public interface iMarketBehavior {

    // Метод для принятия клиента в магазин
    public void acceptToMarket(iActorBehavior actor);

    // Метод для проведения акции в магазине
    public void promotionInMarket(iActionBehavior actor);

    // Метод для освобождения клиентов из магазина
    public void releaseFromMarket(List<Actor> list);

    // Метод для обновления состояния магазина
    public void update();
}
