package Model;

public class Contact {
    private int id;
    private String fullName;
    private String group;
    private String address;
    private String phone;
    private String lastName;
    private String firstName;

    public Contact(int id, String fullName, String group, String address, String phone, String lastName, String firstName) {
        this.id = id;
        this.fullName = fullName;
        this.group = group;
        this.address = address;
        this.phone = phone;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }


    public String getFullName() {
        return fullName;
    }


    public String getGroup() {
        return group;
    }


    public String getAddress() {
        return address;
    }


    public String getPhone() {
        return phone;
    }


    public String getLastName() {
        return lastName;
    }


    public String getFirstName() {
        return firstName;
    }

}
