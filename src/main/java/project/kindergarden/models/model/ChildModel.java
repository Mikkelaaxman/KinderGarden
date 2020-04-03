package project.kindergarden.models.model;

import project.kindergarden.models.data.Gender;
import java.time.LocalDate;


public class ChildModel {

    int child_Id;

    //Foreign Key
    int[] guardian_Id;

    String firstName;
    String lastName;
    Gender gender;
    LocalDate startDate;
    LocalDate endDate;
    LocalDate birthDate;
    Boolean active;
    String note;


    /**************************************
     * GETTERS AND SETTERS BELOW
     **************************************/


    public int getChild_Id() {
        return child_Id;
    }

    public void setChild_Id(int child_Id) {
        this.child_Id = child_Id;
    }

    public int[] getGuardian_Id() {
        return guardian_Id;
    }

    public void setGuardian_Id(int[] guardian_Id) {
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }


    public int getId()
    {
        return child_Id;
    }
}
