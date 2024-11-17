// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String chant = args [0].toUpperCase();
                int repetition = Integer.parseInt(args [1]);
                int i = 0;
                String vowels = "AEFHIJKLMNOPRSX";
                for (int count = 0; count < chant.length(); count++) {
                        char currentChar = chant.charAt(i); 
                        if (vowels.indexOf(currentChar) != -1 ) {
                                System.out.println("Give me an " + currentChar +": " + currentChar + "!");    
                        }
                        else {
                                System.out.println("Give me a  " + currentChar +": " + currentChar + "!");    
                        }
                        i++;
                }
                System.out.println("What does that spell?");
                for (int count = 0; count < repetition; count++) {
                        System.out.println(chant + "!!!");
                }              
        }
}
