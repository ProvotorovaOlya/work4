package task_3;

public class Phone {
    private int phoneNumber;
    private String type;
    public Phone(int phoneNumber, String type){
        this.phoneNumber = phoneNumber;
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public String toString(){
        return phoneNumber + " " + type;
    }
}
