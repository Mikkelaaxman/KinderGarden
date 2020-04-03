package project.kindergarden.models.model;

import project.kindergarden.models.data.Gender;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "kid")
public class ChildModel
{

    @Id
    @GeneratedValue()
    @Column(name = "kid_id")
    int child_Id;


    @Column(name = "kid_firstname")
    String firstName;
    @Column(name = "kid_lastname")
    String lastName;
    @Column(name = "kid_startdate")
    LocalDate startDate;
    @Column(name = "kid_enddate")
    LocalDate endDate;
    @Column(name = "kid_birthdate")
    LocalDate birthDate;

    public int getChild_Id() {
        return child_Id;
    }

    public void setChild_Id(int child_Id) {
        this.child_Id = child_Id;
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

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Column(name = "kid_gender")
    Boolean active;
    @Column(name = "kid_note")
    String note;


    /**************************************
     * GETTERS AND SETTERS BELOW
     **************************************/

}
