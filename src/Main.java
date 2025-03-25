import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int last = sc.nextInt();

        int[] divisor = {3 , 5};
        String[] message = {"Fizz" , "Buzz"};

        for (int i = first; i <= last; i++) {
            String output = "";
            for (int j = 0; j < divisor.length; j++) {
                if (i % divisor[j] == 0) {
                    output += message[j];
                }
            }
            if(output.isEmpty()){
                System.out.println(i);
            }
            else {
                System.out.println(output);
            }
        }
    }
}