package project.kindergarden.models;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class GuardianModel{
    @Id
    int guardian_Id;

    String firstName;
    String lastName;
    private enum gender {M,F}
    int priority;
    String note;

    //Contact
    int contact_Id;


    public void Create() {

    }

    public void Read() {

    }


    public void Update() {

    }


    public void Delete() {

    }

    public int getGuardian_Id() {
        return guardian_Id;
    }

    public void setGuardian_Id(int guardian_Id) {
        this.guardian_Id = guardian_Id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getContact_Id() {
        return contact_Id;
    }

    public void setContact_Id(int contact_Id) {
        this.contact_Id = contact_Id;
    }
}
