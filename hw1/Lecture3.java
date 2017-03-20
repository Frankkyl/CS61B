/**
 * Created by kysft on 3/19/17.
 */
public class Lecture3 {

    public static void main(String[] args) {
        Human kayla = new Human("Kayla");
        //kayla.age = 12;
        //kayla.name = "Kayla";
        kayla.introduce();
        Human rishi = new Human("Rishi");
        rishi.introduce();
        rishi.age = 18;
        //rishi.name="Rishi";
        rishi.introduce();
        kayla.copy(rishi);
        kayla.introduce();
        kayla.change(15);
        kayla.introduce();
        int kids=Human.numberOfHumans/4;
        System.out.println(kids);
        kayla.PrintHumans();

    }
}

class Human {
    public int age;
    public String name;
    public static int numberOfHumans = 0;


    public void introduce() {
        System.out.println("I'm " + name + " and I'm " + age + " years old.");
    }

    public void copy(Human original) {
        age = original.age;
        name = original.name;
    }

    public Human(String giveName) {
        age = 12;
        name = giveName;
    }

    public Human() {
        this.age = 0;
        this.name = "untitled";
        numberOfHumans++;
    }

    public void change(int age) {
        String name = "Chang";
        this.age = age;
        this.name = name;
    }
    public static void PrintHumans(){
        System.out.println(numberOfHumans);
    }

}
