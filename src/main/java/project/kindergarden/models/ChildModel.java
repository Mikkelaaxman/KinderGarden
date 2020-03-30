package project.kindergarden.models;

import java.util.ArrayList;
import java.util.Date;

public class ChildModel implements ModelInterface {
    ArrayList<String> list = new ArrayList<>();

    String firstName;
    String lastName;
    enum gender {M,F};
    Date startDate;
    Date endDate;
    Date birthDate;
    String note;

    /**
     *

    Guardian attributes here?
    */

    @Override
    public void getList() {

    }

    @Override
    public void search() {

    }

    private String getChild(String s){
        return "";
    }

}
