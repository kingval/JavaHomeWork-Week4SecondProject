package HomeworkWeek4SecondProject;

public class Cat extends NewAnimal {

    private String color;

    public Cat(boolean meat, String food, int legs) {super(meat, food, legs); this.color="White";}
    public Cat(boolean veg, String food, int legs, String color) {super(veg, food, legs); this.color= color;}
    public String getColor() {return color;}
    public void setColor(String color){this.color = color;}

}
