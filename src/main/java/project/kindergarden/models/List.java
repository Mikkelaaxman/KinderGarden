package project.kindergarden.models;

import java.util.ArrayList;
import java.util.Objects;

public class List
{
    java.util.List<Object> list = new ArrayList<>();

    public  List(String s){
        GetChildren("");
    }
    private java.util.List GetChildren(String s){
        list.add(new Child("HAns", "HAnsen"));
        list.add(new Child("Børge ", "Børgesen"));
        return list;
    }

}
