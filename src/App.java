import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InterruptedException{

    Scanner sc = new Scanner(System.in);
    creditcard myCard;

    System.out.println("Enter credit card number: ");

    String str = sc.nextLine();
    myCard = new creditcard(str);
    long starttime = System.nanoTime();

    //four worker threads
    //one for stringToNumber, calculateAltDigitSum, add, findValidInvalid
    threads myThreads[] = new threads[4];

    // create all threads in array
    myThreads[0] = new threads(1, myCard);
    myThreads[1] = new threads(2, myCard);
    myThreads[2] = new threads(3, myCard);
    myThreads[3] = new threads(4, myCard);

    //start all threads
    myThreads[0].start();
    myThreads[1].start();
    myThreads[2].start(); 
    myThreads[3].start();

    //join all threads
    myThreads[0].join();
    myThreads[1].join();
    myThreads[2].join();
    myThreads[3].join();
            
    //printing company name if comes abck invalid print invalid
    System.out.println("Company: " + myCard.company());

    long endtime = System.nanoTime();
    long totaltime = endtime - starttime;

    System.out.println("Runtime: " + totaltime + " ns");

        sc.close();  
    }
}
