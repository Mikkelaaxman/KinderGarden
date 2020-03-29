package project.kindergarden.models;

import project.kindergarden.models.data.Person;

import java.util.ArrayList;

public interface Model
{

    public ArrayList<Person> getList();

    public ArrayList<Person> getElement(String... ids); // for each id in ids, return a lit with that person

    public void deleteElement(String... ids);

    public ArrayList<Person> searchByName(String id);

}
