import java.util.ArrayList;

public class zoo {
    public static void main(String[] args){
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        Bear pooh = new Bear("pooh");
        pooh.eat("fish");
        pooh.eat("meat");
        Unicorn rarity = new Unicorn("Rarity");
        rarity.eat("marshmallows");
        rarity.sleep();
        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("leaves");
        gemma.eat("meat");
        Bee stinger = new Bee("Stinger");
        stinger.eat("ice cream");
        stinger.eat("pollen");

        ArrayList<Animal> animals=new ArrayList<Animal>();
        animals.add(tigger);
        animals.add(pooh);
        animals.add(rarity);
        animals.add(gemma);
        animals.add(stinger);

        Zookeeper zoebot = new Zookeeper("Zoebot");
        zoebot.feedAnimals(animals,"celery");
    }

}
