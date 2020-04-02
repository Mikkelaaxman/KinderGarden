package project.kindergarden.models;

import project.kindergarden.data.Gender;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * A class for adding and returning data to lists?
 */
public class ListUtil
{
    ArrayList<Objects> masterList = new ArrayList<>();
    List<ChildModel> childList = new ArrayList<>();
    List<GuardianModel> guardianList = new ArrayList<>();

    /**
     *
     * @param id Childs ID
     * @param gid One or more Guardians ID
     * @param fn Firstname
     * @param ln Lastname
     * @param gender Gender
     * @param sd Start date
     * @param ed End date
     * @param bd Birth date
     * @param active Active or not active
     * @param n Note
     */
    public void CreateChild(int id, int[] gid, String fn, String ln, Gender gender, LocalDate sd, LocalDate ed, LocalDate bd, Boolean active, String n){
        this.childList.add(new ChildModel(id, gid, fn, ln, gender, sd, ed, bd, active, n)); //TODO
        
    }

    public ChildModel ReadChild(int id){
        int index = 0;

        for (int i = 0; i<childList.size(); i++){
            if (childList.get(i).getChild_Id() == id){
                index = i;
                break;
            }
        }
        return childList.get(index);
    }

    public void UpdateChild(int id, String fn, String ln, Gender gender, LocalDate sd, LocalDate ed, LocalDate bd, Boolean act, String n){
        // GET object from list via ID
        ChildModel cm = childList.get(id);
        // Set each attribute to each new parameter except ID
        cm.setFirstName(fn);
        cm.setLastName(ln);
        cm.setGender(gender);
        cm.setStartDate(sd);
        cm.setEndDate(ed);
        cm.setBirthDate(bd);
        cm.setActive(act);
        cm.setNote(n);
        // Add back to list .. and DB?
        childList.set(id, cm);
    }
    public void DeleteChild(int id){
        childList.remove(id);
    }



    public void CreateGuardian(int id, int[] cid, int contid, String fn, String ln, Gender gender, int prio, String n){
        this.guardianList.add(new GuardianModel(id, cid, contid, fn, ln, gender, prio, n)); //TODO
    }
    public void ReadGuardian(int id){
    }
    public void UpdateGuardian(int id, int[] cid, int contid, String fn, String ln, Gender gender, int prio, String n){

    }
    public void DeleteGuardian(int id){
    }

    public List<ChildModel> getChildList() {
        return childList;
    }

    public void setChildList(List<ChildModel> childList) {
        this.childList = childList;
    }
}
