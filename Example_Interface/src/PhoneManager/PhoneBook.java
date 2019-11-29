package PhoneManager;

import java.util.ArrayList;

public class PhoneBook implements Phone {

    ArrayList<Person> phoneList = new ArrayList<>();

    @Override
    public void InsertPhone(String name, String phone) {
        boolean checkPhone = CheckName(phoneList, name);
        if (checkPhone){
            System.out.println("Tên người đã có trong danh sách");
        } else {
            Person person = new Person(name, phone);
            phoneList.add(person);
        }
    }

    @Override
    public void RemovePhone(String name) {
        int index = CheckNameRemove(phoneList, name);
        if (index != -1){
            phoneList.remove(index);
        } else {
            System.out.println("Tên người cần xóa không có trong danh sách");
        }
    }

    public boolean CheckName(ArrayList<Person> phoneList, String name) {
        for (int i = 0; i < phoneList.size(); i++) {
            if (phoneList.get(i).getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public int CheckNameRemove(ArrayList<Person> phoneList, String name){
        int index;
        for (int i = 0; i < phoneList.size(); i++) {
            if (phoneList.get(i).getName().equals(name)){
                index = i;
                return index;
            }
        }
        return -1;
    }
}
