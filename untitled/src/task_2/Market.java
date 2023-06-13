package task_2;

import java.util.LinkedList;
import java.util.Queue;

/**



 */
public class Market implements QueueBehaviour, MarketBehaviour {
    private Queue<Person> queue = new LinkedList<>();

    public void addPerson(Person person) {
        queue.add(person);
    }

    public Person servePerson() {
        return queue.poll();
    }

    public int getQueueLength() {
        return queue.size();
    }

    public void update() {
        // Логика обновления состояния магазина
    }

    @Override
    public void completeOrder(Customer customer) {

    }

    public static void main(String[] args) {
        Market market = new Market();

        // Добавляем несколько человек в очередь
        market.addPerson(new Person("Мария"));
        market.addPerson(new Person("Александр"));
        market.addPerson(new Person("Любовь"));

        // Смотрим длину очереди
        System.out.println("Длина очереди: " + market.getQueueLength());

        // Обслуживаем первого в очереди и выводим его имя
        Person servedPerson = market.servePerson();
        System.out.println("Обслуженный человек: " + servedPerson.getName());

        // Смотрим длину очереди после обслуживания
        System.out.println("Длина очереди после обслуживания: " + market.getQueueLength());

        // Обновляем состояние магазина

        market.update();
    }

    @Override
    public void addCustomerToQueue(Customer newCustomer) {

    }

    @Override
    public Customer pullFirstFromQueue() {
        return null;
    }

    @Override
    public void queueToString() {

    }
}
