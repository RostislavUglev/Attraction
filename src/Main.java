import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> listPerson = new LinkedList<>();
        for (int i = 0; i < generateClients().size(); i++) {
            listPerson.offer(generateClients().get(i));
        }
        while (!listPerson.isEmpty()) {
            Person firstPerson = listPerson.poll();
            System.out.println(firstPerson.name + " " + firstPerson.surname + " Rode attraction");
            int tickets = firstPerson.tickets - 1;
            if (tickets > 0) {
                firstPerson.tickets = tickets;
                listPerson.offer(firstPerson);
            }
        }
    }

    public static List<Person> generateClients() {
        List<Person> list = new LinkedList<>();
        list.add(new Person("Petya", "Ivanov", 3));
        list.add(new Person("Vasya", "Petrov", 2));
        list.add(new Person("Olya", "Zubova", 1));
        list.add(new Person("Alexey", "Sidorov", 2));
        list.add(new Person("Ira", "Zhukova", 1));

        return list;
    }
}
