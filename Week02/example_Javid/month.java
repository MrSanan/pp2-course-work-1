import java.util.Scanner;

public class month {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        
        var month=scan.nextInt();
    
    switch(month){
        default:
        System.out.println("Please enter a month no [1-12]");
        case 1:
        System.out.println("Jan - 31");
        break;
        case 2:
        System.out.println("Feb -28");
        break;
        case 3:
        System.out.println("Mar - 31");
        break;
        case 4:
        System.out.println("Apr - 30");
        break;  
    }
    }

}
