//Ameer Ahmed
// Write a Java program to test if an array contains a specific value.

class Array {

    public static void main (String [] args) {

        //define the array and the number in the index
        int [] numbers = {3,8,5};

        //do test conditions for a value you put in
        if(numbers[0] == 3) {

            System.out.println("This value contains the number 3."); 
        }

        if (numbers[1] == 8) {

            System.out.println("This value contains the number 8.");
        }

        if (numbers[2] == 5) {

            System.out.println("This value contains the number 5.");
        }
        
        System.out.println("");
        System.out.println("End of the array testing.");

        //print all the values for proof of the values
        for(int n : numbers) {
            System.out.println(n);
        }
    }
}