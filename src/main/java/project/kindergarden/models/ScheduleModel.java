package project.kindergarden.models;

//TODO Create schedule model
public class ScheduleModel{

    public void Create() {

    }


    public void Read() {

    }


    public void Update() {

    }


    public void Delete() {

    }


}


class day
{
    int day;

    public day(int weekday)
    {
        day = weekday;
    }

}

class month{
    public int[] days;

    public month(int length)
    {
        days = new int[length];
        for (int i = 0; i <days.length ; i++)
        {
            days[i] = i+1;
        }

    }
}