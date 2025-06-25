package src;
/*
 * Methods are behaviour of a class
 * void means that the method is not returning any data after execution the method statements
 * int/string/class etc can also be used as a return type of a method
 * public/private/default are access modifier provided to methods
 * Once the method executes return in the executions statements it stops executing the rest of the statements
 */

public class Methods {

    public static void main(String[] args) {
        Computer obbj = new Computer();
        obbj.playMusic();
        String result = obbj.getMeAPen(15);
        System.out.println(result);
    }
    
}


class Computer{
    public void playMusic() {
        System.out.println("Playing Music");
    }

    public String getMeAPen(int cost){
        if (cost>=10)
            return "Pen";
        
        return "Nothing";
    }

}