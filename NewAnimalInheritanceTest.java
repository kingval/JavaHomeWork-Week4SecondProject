package HomeworkWeek4SecondProject;

public class NewAnimalInheritanceTest {

    public static void main(String[] args) {
        Cat cat = new Cat(false, "milk", 4, "black");

        System.out.println("Cat is MeatEater?" + cat.isMeatEater());
        System.out.println("Cat eats " + cat.getEats());
        System.out.println("Cat has " + cat.getNumberOfLegs() + " legs.");
        System.out.println("Cat color is " + cat.getColor());
    }

}
