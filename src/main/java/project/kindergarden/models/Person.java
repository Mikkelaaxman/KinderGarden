package project.kindergarden.models;

import project.kindergarden.data.Gender;

import java.time.LocalDate;

public interface Person
{
    public Person create(int id, int[] child_Id, int contact_Id, String firstName, String lastName, Gender gender, int priority, String n, int[] guardian_Id, LocalDate startDate, LocalDate endDate, LocalDate birthDate, Boolean active, String note);

}
