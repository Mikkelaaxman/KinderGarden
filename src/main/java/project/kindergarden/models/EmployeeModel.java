package project.kindergarden.models;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class EmployeeModel  {
    @Id
    int employee_Id;

    String firstName;
    String lastName;
    private enum gender {M,F}
    Date startDate;
    Date endDate;
    Date birthDate;
    String note;

    //Title
    String title;
    Date title_from;
    Date title_to;

    //Salary
    int salary;
    Date salary_from;
    Date salary_to;

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

    public int getEmployee_Id() {
        return employee_Id;
    }

    public void setEmployee_Id(int employee_Id) {
        this.employee_Id = employee_Id;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getTitle_from() {
        return title_from;
    }

    public void setTitle_from(Date title_from) {
        this.title_from = title_from;
    }

    public Date getTitle_to() {
        return title_to;
    }

    public void setTitle_to(Date title_to) {
        this.title_to = title_to;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getSalary_from() {
        return salary_from;
    }

    public void setSalary_from(Date salary_from) {
        this.salary_from = salary_from;
    }

    public Date getSalary_to() {
        return salary_to;
    }

    public void setSalary_to(Date salary_to) {
        this.salary_to = salary_to;
    }

    public int getContact_Id() {
        return contact_Id;
    }

    public void setContact_Id(int contact_Id) {
        this.contact_Id = contact_Id;
    }
}
