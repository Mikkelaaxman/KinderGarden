package project.kindergarden.models.model;

import org.springframework.data.annotation.Id;
import project.kindergarden.models.data.Gender;

import java.time.LocalDate;

public class GuardianModel
{
    @Id
    int guardian_Id;
    //Child foreign keys
    int[] child_Id;

    String firstName;
    String lastName;
    Gender gender;
    int priority;
    String note;
    int contact_Id;

    public GuardianModel(){}



    /**************************************
     * GETTERS AND SETTERS BELOW
     **************************************/
    public int getGuardian_Id() {
        return guardian_Id;
    }

    public void setGuardian_Id(int guardian_Id) {
        this.guardian_Id = guardian_Id;
    }

    public int[] getChild_Id() {
        return child_Id;
    }

    public void setChild_Id(int[] child_Id) { this.child_Id = child_Id; }

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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
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
