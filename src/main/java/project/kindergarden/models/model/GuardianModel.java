package project.kindergarden.models.model;

import org.springframework.data.annotation.Id;
import project.kindergarden.models.data.Gender;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "guardian")
public class Guardian<ENUM>
{

    @Id
    @GeneratedValue()
    @Column(name = "guardian_id")
    String guardian_Id;


    @Column(name = "guardian_firstname")
    String firstName;
    @Column(name = "guardian_lastname")
    String lastName;
    @Column(name = "parenttelephone")
    String telephone;
    @Column(name = "postalcode")
    String postalcode;
    @Column(name = "streetname")
    String streetname;
    @Column(name = "streetnumber")
    String streetnumber;
    @Column(name = "city")
    String city;
    @Column(name = "g_mail")
    String gmail;
    @Column(name = "gender")
    ENUM gender;
    @Column(name = "note")
    String note;




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
