import java.util.ArrayList;

public class Zookeeper {
    public String name;
    public String food;


    public Zookeeper(String name){
        this.name=name;
    }

    public void feedAnimals(ArrayList<Animal> animals, String food){
        System.out.print(name + " is feeding " + food + " to " + animals.size() + " animals out of" + Animal.population + " total animals");
        for(int i=0; i<animals.size(); i++){
           animals.get(i).eat(food);
        }
    }

}
