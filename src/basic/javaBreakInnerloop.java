package basic;

/**
 *
 * @author Sujan
 */
public class javaBreakInnerloop {
    public static void main(String[] args){
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                if(i==2&&j==2){
                    break;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}
