package HomeworkWeek4SecondProject;

public class NewAnimal {

    boolean meatEater;
    String eats;
    int numberOfLegs;

    public NewAnimal(boolean meat, String food, int legs) {this.meatEater = meat; this.eats = food; this.numberOfLegs =legs;}
    public boolean isMeatEater() {return meatEater;}
    public String getEats() {return eats;}
    public void setEats(String eats) {this.eats = eats;}
    public int getNumberOfLegs() {return numberOfLegs;}
    public void setNoOfLegs(int numberOfLegs) {this.numberOfLegs = numberOfLegs;}

}
