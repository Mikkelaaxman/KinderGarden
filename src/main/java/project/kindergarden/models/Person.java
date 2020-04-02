package project.kindergarden.models;

import project.kindergarden.data.Gender;

import java.time.LocalDate;

public interface Person
{
    Person create(int id, int[] child_Id, int contact_Id, String firstName, String lastName, Gender gender, int priority, int[] guardian_Id, LocalDate startDate, LocalDate endDate, LocalDate birthDate, Boolean active, String note,
                  //Contact
                  String phone, String email, String address, String houseNumber, int zip, String city,
                  //Employee Details
                  String title, LocalDate title_from, LocalDate title_to, int salary, LocalDate salary_from, LocalDate salary_to
    );

}
