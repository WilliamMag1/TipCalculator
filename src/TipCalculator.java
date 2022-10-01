import java.util.Scanner;

public class TipCalculator {

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        //declaring variables and getting their values
        System.out.println("What is the Bill?");
        double bill = scan.nextDouble();
        System.out.println("What is the percentage of tip?");
        int tip = scan.nextInt();
        System.out.println("How many people ate with you?");
        int numberOfPeople = scan.nextInt();

        //calculating total tip
        double tipTotal;
        tipTotal = bill*(tip*0.01);

        //calculating tip per person
        double tipPP= tipTotal/numberOfPeople;

        //calculating total cost
        double Cost = bill + tipTotal;

        //calculating the total per person
        double billPerP = bill/numberOfPeople;
        double perP = tipPP + billPerP;

        //Having the variables displayed and rounded to the hundredth decimal.
        System.out.println("Here is your Receipt.");
        System.out.println("Bill:"+ bill);
        System.out.println("Tip: "+  tip+ "%");
        System.out.println("Total tip: $"+String.format("%.2f", tipTotal));
        System.out.println("Total Cost: $"+String.format("%.2f", Cost));
        System.out.println("Group size: "+ numberOfPeople+ " people.");
        System.out.println("Tip per person: $"+String.format("%.2f", tipPP));
        System.out.println("Payment per person: $"+ String.format("%.2f",perP));

    }
}
