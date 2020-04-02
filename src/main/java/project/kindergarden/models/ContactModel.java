package project.kindergarden.models;

import org.springframework.data.annotation.Id;
import project.kindergarden.data.Gender;

import java.time.LocalDate;

public class ContactModel implements Person{
    @Id
    int contact_id;
    String phone;
    String email;
    String address;
    String houseNumber;
    int zip;
    String city;

    public ContactModel(){

    }

    private ContactModel(int contact_id, String phone, String email, String address, String houseNumber, int zip, String city) {
        this.contact_id = contact_id;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.houseNumber = houseNumber;
        this.zip = zip;
        this.city = city;
    }

    @Override
    public Person create(int id, int[] child_Id, int contact_Id, String firstName, String lastName, Gender gender, int priority, int[] guardian_Id, LocalDate startDate, LocalDate endDate, LocalDate birthDate, Boolean active, String note, String phone, String email, String address, String houseNumber, int zip, String city, String title, LocalDate title_from, LocalDate title_to, int salary, LocalDate salary_from, LocalDate salary_to) {
        return new ContactModel(id, phone, email, address, houseNumber, zip, city);
    }

    /**************************************
     * GETTERS AND SETTERS BELOW
     **************************************/
    public int getContact_id() {
        return contact_id;
    }

    public void setContact_id(int contact_id) {
        this.contact_id = contact_id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}
