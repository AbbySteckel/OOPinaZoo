public class AnotherExampleClass {
    static int counter = 8999;
    String message;

    public AnotherExampleClass(String message){
        this.message=message;
    }

    public void increaseAndCheckTheCounter(){
        AnotherExampleClass.counter +=1;
        System.out.print(this.message + AnotherExampleClass.counter);
    }
}


