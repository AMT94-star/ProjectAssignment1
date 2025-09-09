package se.iths.aslihan;

public class Main {
    public static void main(String[] args) {
        String [] words = {"Hello", "World"};
        printWordsInArray(words);

        int [] numbers = { 54, 334, 87, 91, 32, 14};
        System.out.println("Max number is: " + findMaxInArray(numbers));

        System.out.println(returnHighestVal(55.6,7.6));

        names("Aslihan","Taskin");
    }

    private static void printWordsInArray(String[] arr){
        for (String word : arr) {
            System.out.println(word);
        }
    }

    private static int findMaxInArray(int[] maxValue){
        int max = maxValue[0];

        for(int i = 0; i < maxValue.length; i++){
            if(maxValue[i] > max){
                max = maxValue[i];
            }
        }
        return max;
    }

    private static double returnHighestVal(double a, double b){
        if(a > b){
            return a;
        }
        else if(a < b){
            return b;
        }
        else{
            return 0.0;
        }
    }

    private static void names(String firstName, String lastName){
        System.out.println(firstName + " " + lastName);
    }

}
