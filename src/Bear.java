public class Bear {
    public String bearName;
    public String favoriteFood = "fish";

    public Bear(String name) {
        this.bearName=name;
    }

    public void sleep(){
        System.out.print(this.bearName + " hibernates for 4 months. ");
    }

    public void eat(String food) {
        System.out.print(this.bearName + " eats " + food + ". ");
        if (food.equals(favoriteFood)) {
            System.out.print(" YUM!!! " + this.bearName + " wants more " + food + ". ");
        } else {
            sleep();
        }
    }

    public static void main(String[] args){
        Bear pooh = new Bear("pooh");
        pooh.eat("fish");
        pooh.eat("meat");
    }
}
