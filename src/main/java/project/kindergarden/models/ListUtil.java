package project.kindergarden.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A class for adding and returning data to lists?
 */
public class ListUtil
{
    ArrayList<Objects> masterList = new ArrayList<>();

    public List ListUtil(){

        return masterList;
    }


    public void CreateChild(String data){
        ChildModel.Create(data);
    }
    public ChildModel ReadChild(int id){
        return ChildModel.Read();
    }

}
