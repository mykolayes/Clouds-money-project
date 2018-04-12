package Entities.Model;

public class CalendarModel {

    String name;
    long millisDate;

    public CalendarModel(){}

    public CalendarModel(String name, long millisDate) {
        this.name = name;
        this.millisDate = millisDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMillisDate() {
        return millisDate;
    }

    public void setMillisDate(long millisDate) {
        this.millisDate = millisDate;
    }
}
