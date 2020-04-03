package project.kindergarden.models.model;


import project.kindergarden.models.data.Gender;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "guardian")
public class GuardianModel
{

    @Id
    @GeneratedValue()
    @Column(name = "guardian_id")
    int guardian_id;


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

    @Column(name = "note")
    String note;



    /**************************************
     * GETTERS AND SETTERS BELOW
     **************************************/

    public int getGuardian_id() {
        return guardian_id;
    }

    public void setGuardian_id(int guardian_id) {
        this.guardian_id = guardian_id;
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getStreetname() {
        return streetname;
    }

    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }

    public String getStreetnumber() {
        return streetnumber;
    }

    public void setStreetnumber(String streetnumber) {
        this.streetnumber = streetnumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;

    }

}
