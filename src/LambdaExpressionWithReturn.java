package src;
/*
 * Lambda Expression can also be used a return values
 */
public class LambdaExpressionWithReturn {
    public static void main(String[] args) {
        Addition oAddition1 = (i,j) -> i+j;
        int add = oAddition1.add(10,20);
        System.out.println("Addition: "+add);

        Addition oAddition2 = (i,j) -> i-j;
        int sub = oAddition2.add(20,10);
        System.out.println("Subraction : " + sub);
    }
    
}

interface Addition {
    int add (int i,int j);
}