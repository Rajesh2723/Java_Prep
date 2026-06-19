package JavaFundamentals;

public class ControlFlowDemo {
    public static void main(String[] args){
        int day=3;
        switch(day){
            case 1:
            case 2:
            case 3:
                System.out.println("not a weekend");
            case 4:
            case 5:
            case 6:
            case 7:
                System.out.println("weekend is here");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
