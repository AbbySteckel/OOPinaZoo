public class Animal {
    public String name;
    public String favoriteFood;

    public Animal (String name, String favoriteFood){
        this.name=name;
        this.favoriteFood=favoriteFood;
    }

    public void sleep(){
        System.out.print(this.name + " sleeps for 5 hours. ");
    }

    public void eat(String food){
        System.out.print(this.name + " eats " + food + ". ");
        if(food.equals(favoriteFood)){
            System.out.print(" YUM!!! " + this.name + " wants more "+ food + ".");
        }else{
            sleep();
        }
    }
}
