package BusinessLayer;

import java.util.Date;

public abstract class Report {

    static int ID = 0;
    protected int Id;
    protected Date date;

    public abstract String exportReport();

    public int getID() {
        return Id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Report(){
        ID ++;
        this.Id = ID;
        this.date = new Date(System.currentTimeMillis());
    }

}