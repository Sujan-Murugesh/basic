package basic;

/**
 *
 * @author Sujan
 */
public class WrraperinSwitch {
    public static void main(String[] args){
        int age =18;
        switch(age){
            case(16):System.out.println("your under 18");
            break;
            case(18):System.out.println("your elegible for vote");
            break;
            case(65):System.out.println("your senior citizen");
            break;
            default:System.out.println("please enter valid age!!!");
            break;
        }
    }
}
