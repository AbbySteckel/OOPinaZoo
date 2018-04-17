public class Tiger {
    public String favoriteFood="meat";
    public String tigerName;


    public Tiger(String name) {
        this.tigerName=name;

    }

    public void sleep() {
        System.out.print(this.tigerName + " sleeps for 8 hours. ");

    }

    public void eat(String food) {
        System.out.print(this.tigerName + " eats " + food + ". ");
        if(food.equals(favoriteFood)){
            System.out.print(" YUM!!! " + this.tigerName + " wants more "+ food + ".");
        }else{
            sleep();
        }

    }

    public static void main(String[] args) {
        //either make a new instance of a zoo
        //to call the non-static sleep method....
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");

    }

}
