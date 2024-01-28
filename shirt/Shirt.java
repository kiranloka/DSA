package shirt;

public class Shirt {

    public  String color;
    public  String size;

    Shirt(String color,String size){
        this.color=color;
        this.size=size;
    }

    public static void PutOn(){
        System.out.println("The shirt is On!");
    }
    public static void TakeOff(){
        System.out.println("The shirt is Off!");
    }

} 