import java.util.Random;
public class DoWhileExemple { 
        public static void main(String[] args) {
            System.out.println("dialing...");
            
            do {
                System.out.println("phone ringing");
            }while(ringing());
            
                System.out.println("hello !!!");
        }
        
        private static boolean ringing() {
                boolean answered = new Random().nextInt(3)==1;
                System.out.println("answered? " + answered);
            return ! answered;
        }
        
}
