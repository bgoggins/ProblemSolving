public class Employee {

    boolean manager;
    String name;
    Date dateHired;
    int id;
    boolean partTime;

    public String getName() {
        return name;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public int getId() {
        return id;
    }

    public boolean isManager() {
        return manager;
    }

    public boolean isPartTime() {
        return partTime;
    }

    public void setManager(boolean manager) {
        this.manager = manager;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPartTime(boolean partTime) {
        this.partTime = partTime;
    }
}
