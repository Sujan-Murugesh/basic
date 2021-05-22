package basic;
/**
 *
 * @author Sujan
 */
public class Nestedif {
    public static void main(String[] args){
        int age=22;
        int weight=60;
        
        if(age>=18){
            if(weight>=50){
                System.out.println("Your Aligible to donate blood");
            }
            else{
                System.out.println("You do not have enough weight");
            }
        }
        else{
            System.out.println("Your not eligble to donate blood");
        }
        
    }
}
