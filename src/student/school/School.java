package student.school;

public class School {

    private int number;
    private String address;

    public School (int number, String address) {
        this.number = number;
        this.address = address;
    }
    int getNumber() {
        return number;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
