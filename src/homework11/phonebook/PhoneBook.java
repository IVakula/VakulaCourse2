package homework11.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private  List<Entry> entryList;

    public PhoneBook() {
        this.entryList = new ArrayList<>();
    }

    public List<Entry> getEntryList() {
        return entryList;
    }

    public void add(String name, String number) {
        this.entryList.add(new Entry(name, number));
    }

    public Entry find(String name) {
        for (Entry entry : entryList) {
            if (entry.getName().contains(name)) {
                return entry;
            }
        }
        return null;
    }


    public List<Entry> findAll(String name) {
        List<Entry> resultList = new ArrayList<>();
        for (Entry entry : entryList) {
            if (entry.getName().equals(name)) {
                resultList.add(entry);
            }
        }
        return resultList;
    }

}
