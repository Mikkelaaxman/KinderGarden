package project.kindergarden.models;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import project.kindergarden.data.Gender;

import java.time.LocalDate;
import java.util.Date;

@EntityScan //Brugbar?
public class ChildModel{
    @Id
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

    public ChildModel(int child_Id, int[] guardian_Id, String firstName, String lastName, Gender gender, LocalDate startDate, LocalDate endDate, LocalDate birthDate, Boolean active, String note) {
        this.child_Id = child_Id;
        this.guardian_Id = guardian_Id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.startDate = startDate;
        this.endDate = endDate;
        this.birthDate = birthDate;
        this.active = active;
        this.note = note;
    }

    /**
    public ChildModel Create(int id, int[] gid, String fn, String ln, Gender gender, Date sd, Date ed, Date bd, Boolean active, String n) {
        return new ChildModel(id, gid, fn, ln, gender, sd, ed, bd, active, n);
    }

    public void Read() {

    }


    public void Update(int id, String fn, String ln, Gender gender, Date sd, Date ed, Date bd, String n) {

        this.firstName = fn;
        this.lastName = ln;
        this.gender = gender;
        this.startDate = sd;
        this.endDate = ed; // TODO allow NULL??
        this.birthDate = bd;
        this.note = n;

    }

    public void Delete(int id) {
        // SQL DROP CHILD WITH ID ?
    }

**/

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
}
