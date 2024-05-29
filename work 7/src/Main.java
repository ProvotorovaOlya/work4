import java.util.*;
import java.util.stream.Collectors;
import task_3.Client;
import task_3.Phone;

public class Main implements Comparator<Integer> {
    //задание 1, номер 7
    @Override
    public int compare(Integer number1, Integer number2){
        number1 = Math.abs(number1);
        number2 = Math.abs(number2);
        return Integer.compare(number1,number2);
    }
    public static void main(String[] args) {
        //задание 2, номер 7
        List<Integer> numbers = Arrays.asList(1,2,3,-4,5,-6,-6);
        int min = numbers.stream()
                /*
                .min(Comparator.naturalOrder())
                .orElse(0);
                 */
                .sorted()
                .findFirst()
                .orElse(0);
        int max = numbers.stream()
                .max(Comparator.naturalOrder())
                .orElse(0);
        System.out.println(min + " " + max);

        //задание 3
        List<Client> clients = new ArrayList<>();
        clients.add(new Client("1", "Petay", 25, "M",
                List.of(new Phone(123, "Mobile"), new Phone(789, "Landline"))));
        clients.add(new Client("2", "Kate", 65, "W",
                List.of(new Phone(234, "Mobile"), new Phone(345, "Landline"))));
        clients.add(new Client("3", "Tom", 17, "M",
                List.of(new Phone(456, "Mobile"), new Phone(567, "Landline"))));
        clients.add(new Client("4", "Lisa", 35, "W",
                List.of(new Phone(678, "Mobile"), new Phone(789, "Landline"))));

        // Найти самого возрастного клиента, которой пользуется стационарным телефоном
        Optional<Client> clientOldestLandline = clients.stream()
                .filter(client -> client.getTypePhones().contains("Landline"))
                .max(Comparator.comparingInt(Client::getAge));

        //1. Средний возраст клиентов, имеющих стационарные телефоны
        double clientsAverageAgeLandline = clients.stream()
                .filter(client -> client.getTypePhones().contains("Landline"))
                .mapToInt(Client::getAge)
                .average()
                .orElse(0);

        if(clientOldestLandline.isPresent()){
            System.out.println(clientsAverageAgeLandline);
        }
        else {
            System.out.println("нет таких клиентов");
        }

        // 2. Вывести список клиентов, возраст которых 18+, владеющих мобильными телефонами
        List<Client> clientsMobile18 = clients.stream()
                .filter(client -> client.getTypePhones().contains("Mobile") && client.getAge() >= 18)
                .collect(Collectors.toList());

        System.out.println("список клиентов, возраст которых 18+, владеющих мобильными телефонами: ");
        for (Client client : clientsMobile18) {
            System.out.println(client);
        }

        // 3. Проверить, что в списке есть хотя бы одна женщина, старше 60 лет,  владеющая стационарным телефоном
        boolean womanLandline60 = clients.stream()
                .filter(client -> client.getTypePhones().contains("Landline") && client.getGender().equalsIgnoreCase("W") && client.getAge() >= 60)
                .findAny()
                .isPresent();

        if(womanLandline60){
            System.out.println("есть женщина, старше 60 лет,  владеющая стационарным телефоном");
        }
        else {
            System.out.println("нет женщины, старше 60 лет,  владеющей стационарным телефоном");
        }

        //4. Напечатать телефонный справочник, отсортированный по  имени клиента, по возрасту клиента
        List<Client> sortedClients = clients.stream()
                .sorted(Comparator.comparing(Client::getName).thenComparing(Client::getAge))
                .collect(Collectors.toList());

        System.out.println("телефонный справочник: ");
        for (Client client : sortedClients) {
            System.out.println(client);
        }
    }
}