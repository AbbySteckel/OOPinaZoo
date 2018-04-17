public class zoo {
    public static void main(String[] args){
        zoo z = new zoo();
        //z.sleep("Tiger");
       // z.eat("Tiger", "bagels");

    }

    public void sleep(String name) {
        System.out.print(name + " sleeps for 8 hours. ");
    }

    String favFood = "blueberries";

    public void eat(String name, String food){
        System.out.print(name + " eats " + food + ". ");
        if(food.equals(favFood)){
            System.out.print(" YUM!!! " + name + " wants more "+ food + ".");
        }else{
            sleep(name);
        }
    }

}
