package homework11.phonebook;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Сидоров", "0935864123");
        phoneBook.add("Петров", "09542864125");
        phoneBook.add("Сидоров", "09754864124");

        for (int i = 0; i < phoneBook.getEntryList().size(); i++) {
            System.out.println(phoneBook.getEntryList().get(i).getName() + ": "
                    + phoneBook.getEntryList().get(i).getPhoneNumber());
        }

        System.out.println("***********************");
        doFind(phoneBook, "Петров");
        doFind(phoneBook, "Иванов Иван Петрович");

        System.out.println("***********************");
        doFinAll(phoneBook, "Сидоров");
        doFinAll(phoneBook, "Иванов");
    }

    static void doFind(PhoneBook phoneBook, String inputName) {
        Entry resultEntry = phoneBook.find(inputName);
        if (resultEntry != null) {
            System.out.println(resultEntry.getName() + ": " + resultEntry.getPhoneNumber());
        } else {
            System.out.println(inputName + ": Entry not found");
        }
    }

    static void doFinAll(PhoneBook phoneBook, String inputName) {
        List <Entry> resultList = phoneBook.findAll(inputName);
        if (resultList.isEmpty()) {
            System.out.println(inputName + ": Entries not found");
        } else {
            for (Entry entry : resultList) {
                System.out.println(entry.getName() + ": " + entry.getPhoneNumber());
            }
        }
    }
}
