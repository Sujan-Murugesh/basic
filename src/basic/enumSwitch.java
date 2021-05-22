package basic;

/**
 *
 * @author Sujan
 */
public class enumSwitch {
    public enum Day{sun,mon,tue,wed,thu,fri,sat}
    public static void main(String[] args){
        Day[] DayNow =Day.values();
        for(Day Now:DayNow){
            switch(Now){
                case sun:System.out.println("Sunday");
                        break;
                case mon:System.out.println("Monday");
                        break;
                case tue:System.out.println("tuesday");
                        break;
                case wed:System.out.println("Wednesday");
                        break;
                case thu:System.out.println("Thursday");
                        break;
                case fri:System.out.println("Friday");
                        break;
                case sat:System.out.println("Saturday");
                        break;
            }
        }
    }
}
