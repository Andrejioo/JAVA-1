package bsu.rfct.lab1.vyalkin.var9;

public class Eggs extends Food  {
    public String number;
    public Eggs(String number) {
        super("Яйца");
        this.number= number;
    }
    public void consume() {
        System.out.println(this + " съедено");
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public String toString() {
        return " кол-во " + super.toString() + number.toUpperCase() + "'";
    }

}
