public class Giraffe extends Animal{
    public Giraffe (String name){
        super(name, "leaves");
    }

    public void eat(String food){
        if(food.equals(favoriteFood)){
            super.eat(favoriteFood);
            sleep();
        }else{
            System.out.print("YUCK!!! "+ this.name+ " will not eat "+ food + ". ");
        }
    }

}
