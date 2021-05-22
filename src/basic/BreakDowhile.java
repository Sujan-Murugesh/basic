package basic;

/**
 *
 * @author Sujan
 */
public class BreakDowhile {
    public static void main(String[] ags){
        int i=1;
        do{
            if(i==5){
            i++;
            break;
            }
            System.out.println(i);
            i++;
        }while(i<=10);
    }
}
