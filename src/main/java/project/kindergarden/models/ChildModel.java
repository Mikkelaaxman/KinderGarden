package project.kindergarden.models;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.util.IdGenerator; //Brugbar?

import java.util.Date;

@EntityScan //Brugbar?
public class ChildModel{
    @Id
    int child_Id;


    String firstName;
    String lastName;
    private enum gender {M,F}
    Date startDate;
    Date endDate;
    Date birthDate;
    String note;


    private ChildModel(String fn, String ln){
        this.firstName = fn;
        this.lastName = ln;
    }
    private ChildModel(){

    }

    public void Create(int id, String fn, String ln, gender g, Date sd, Date ed, Date bd, String n) {
        this.firstName = fn;
        this.lastName = ln;
        //  this.gender = g;  //TODO Check ENUM how??
        this.child_Id = id;
        this.startDate = sd;
        this.endDate = ed; // TODO allow NULL??
        this.birthDate = bd;
        this.note = n;
    }

        public static ChildModel Read() {
        return new ChildModel();
    }


    public void Update(int id, String fn, String ln, gender g, Date sd, Date ed, Date bd, String n) {
        this.firstName = fn;
        this.lastName = ln;
      //  this.gender = g;  //TODO Check ENUM how??
        this.child_Id = id;
        this.startDate = sd;
        this.endDate = ed; // TODO allow NULL??
        this.birthDate = bd;
        this.note = n;

    }

    public void Delete(int id) {
        // SQL DROP CHILD WITH ID ?
    }


    /**************************************
     * GETTERS AND SETTERS BELOW
     **************************************/


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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
