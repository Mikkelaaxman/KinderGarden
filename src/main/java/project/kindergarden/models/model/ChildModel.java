package project.kindergarden.models.model;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "kid")
public class ChildModel
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kid_id")
    int kid_id;


    @Column(name = "kid_firstname")
    String firstName;
    @Column(name = "kid_lastname")
    String lastName;
    @Column(name = "kid_startdate")
    String startDate;
    @Column(name = "kid_enddate")
    String endDate;
    @Column(name = "kid_birthdate")
    String birthDate;
    @Column(name = "kid_note")
    String note;

    /**************************************
     * GETTERS AND SETTERS BELOW
     **************************************/


    public int getKid_id() {
        return kid_id;
    }

    public void setKid_id(int child_Id) {
        this.kid_id = child_Id;
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

    public String getEndDate() {
        return endDate;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }


    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }




}
