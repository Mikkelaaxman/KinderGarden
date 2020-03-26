package project.kindergarden.controllers;

public class test
{
    public int id;
    public String name;
    public String info;

    public test(int id,String name, String info)
    {
        this.id= id;
        this.name = name;
        this.info = info;
    }

    public test get() {
        return this;
    }

    public String getName() {
        return name;
    }



}