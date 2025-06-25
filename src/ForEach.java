package src;
/*
 * ForEach is basically used in collections
 * Its an enhanced ForLoop, It iterates through Array and gives the value of each index
 */
public class ForEach {

    public static void main(String[] args) {
        int num[] = {1,2,3,4,5};

        for(int i : num){
            System.out.println(i);
        }
    }
    
}
