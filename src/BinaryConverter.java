import java.util.Scanner;

public class BinaryConverter {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int x = 1;
        //Loop to keep prompting in case of exception
        do {
            //Set up "try" to attempt a block of code
            try {
                System.out.println("Enter any string to convert its binary value into decimal");

                int result = binToDec(sc.next());
                System.out.println(result);
                x = 2;
            }
            //set up "catch" to catch the exception
            catch (BinaryFormatException e){
                System.out.println(e.getMessage());
            }
        }
        while (x==1);
    }
    //converter method
    public static int binToDec(String x) throws BinaryFormatException{
        if((x.contains("0")) || (x.contains("1"))){
            int decimalResult = Integer.parseInt(x, 2);
            return decimalResult;
        }
        throw new BinaryFormatException("It must be binary format 1 and 0s only");
    }

}
