package project.kindergarden.models.model;

import project.kindergarden.models.data.Gender;

import java.time.LocalDate;

public class EmployeeModel {
    int employee_Id;
    String firstName;
    String lastName;
    Gender gender;
    LocalDate startDate;
    LocalDate endDate;
    LocalDate birthDate;
    String note;
    String title;
    LocalDate title_from;
    LocalDate title_to;
    int salary;
    LocalDate salary_from;
    LocalDate salary_to;
    int contact_Id;



    /**************************************
     * GETTERS AND SETTERS BELOW
     **************************************/
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getTitle_from() {
        return title_from;
    }

    public void setTitle_from(LocalDate title_from) {
        this.title_from = title_from;
    }

    public LocalDate getTitle_to() {
        return title_to;
    }

    public void setTitle_to(LocalDate title_to) {
        this.title_to = title_to;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getSalary_from() {
        return salary_from;
    }

    public void setSalary_from(LocalDate salary_from) {
        this.salary_from = salary_from;
    }

    public LocalDate getSalary_to() {
        return salary_to;
    }

    public void setSalary_to(LocalDate salary_to) {
        this.salary_to = salary_to;
    }

    public int getContact_Id() {
        return contact_Id;
    }

    public void setContact_Id(int contact_Id) {
        this.contact_Id = contact_Id;
    }
}
