package project.kindergarden.models;

import project.kindergarden.data.Gender;

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

    public List ListUtil(){

        return masterList;
    }

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
    public void CreateChild(int id, int[] gid, String fn, String ln, Gender gender, Date sd, Date ed, Date bd, Boolean active, String n){
        new ChildModel().Create(id, gid, fn, ln, gender, sd, ed, bd, active, n); //TODO
    }
    public void ReadChild(int id){
    }
    public void UpdateChild(String fn, String ln, Gender gender, Date sd, Date ed, Date bd, String n){

    }
    public void DeleteChild(int id){

    }

    public void CreateGuardian(int id, int[] cid, int contid, String fn, String ln, Gender gender, int prio, String n){
        new GuardianModel().Create(id, cid, contid, fn, ln, gender, prio, n); //TODO
    }
    public void ReadGuardian(int id){
    }
    public void UpdateGuardian(int id, int[] cid, int contid, String fn, String ln, Gender gender, int prio, String n){

    }
    public void DeleteGuardian(int id){
    }
}
