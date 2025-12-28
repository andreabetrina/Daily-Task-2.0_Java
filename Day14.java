//Write a program to calculate the commission amount and commission percentage based on the sales amount using the following conditions:
If sales amount is greater than ₹10,000, commission rate is 10%
If sales amount is greater than ₹5,000, commission rate is 5%
Otherwise, no commission
The program should display the commission percentage and the commission amount.

class CPCM {
public static void main(String args[]) {
        double Amt = 12000;
        double Percentage = 0;
        double CA;
        if (Amt > 10000) {
            Percentage = 0.10;
        } 
        else if (Amt > 5000) {
            Percentage = 0.05;
        } 
        else {
            Percentage = 0;
        }

        CA = Amt * Percentage;
        System.out.println("Sales Amount = " + Amt);
        System.out.println("Commission Rate = " + (Percentage * 100) + "%");
        System.out.println("Commission Amount = " + CA);
    }
}
