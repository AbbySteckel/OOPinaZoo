public class Bee extends Animal{
    public Bee(String name){
        super(name, "pollen");
    }

    public void eat(String food){
        if(food.equals(favoriteFood)){
            super.eat(favoriteFood);
            sleep();
        }else{
            System.out.print("YUCK!!! "+ this.name+ " will not eat "+ food + ". ");
        }
    }

    public void sleep(){
        System.out.print(this.name + " never sleeps. ");
    }
}
