package task_3;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String uniqueIdentifier;
    private String name;
    private int age;
    private String gender;
    private List<Phone> phones;
    public Client(String uniqueIdentifier,String name, int age,String gender,List<Phone> phones){
        this.age = age;
        this.uniqueIdentifier = uniqueIdentifier;
        this.name = name;
        this.gender = gender;
        this.phones = List.copyOf(phones);
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public String toString(){
        return uniqueIdentifier + " " + name + " " + age + " " + gender + " " + phones;
    }
    public List<String> getTypePhones(){
        List<String> typePhone = new ArrayList<>();
        for(Phone a: phones){
            typePhone.add(a.getType());
        }
        return typePhone;
    }
}
