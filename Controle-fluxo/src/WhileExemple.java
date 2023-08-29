import java.util.concurrent.ThreadLocalRandom;

public class WhileExemple {
    public static void main(String[] args) {
        double monthlyAllowence = 50.0;
        while(monthlyAllowence>0) {
            Double sweetValue = randomValue();
            if(sweetValue > monthlyAllowence)
                sweetValue = monthlyAllowence;

            System.out.println("sweet of value: " + sweetValue + " added to cart. ");
            monthlyAllowence = monthlyAllowence - sweetValue;
        }
        System.out.println("monthly Allowence:" + monthlyAllowence);
        System.out.println("Danilo spent all his allowance on sweets");
    
    }

        private static double randomValue() {
	        return ThreadLocalRandom.current().nextDouble(1, 10);

    }    
}
    

