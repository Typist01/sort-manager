import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args){
        System.out.println("Hello from BubbleSort");
        int[] myInts = new int[100];
        for (int i = 0; i < myInts.length; i++){
            myInts[i] = (int)Math.floor(Math.random()*100);
        }

//        System.out.println((int)Math.floor(Math.random()*100));

        System.out.println(Arrays.toString(myInts));
        System.out.println(Arrays.toString(bubbleSort(myInts)));


    }

    public static int[] bubbleSort(int[] inputArray){
        int temp;
        boolean arraySorted = true;
        while (arraySorted) {
            arraySorted = false;
            for (int i = 0; i < inputArray.length - 1; i++) {
                if (inputArray[i] > inputArray[i + 1]) {
                    temp = inputArray[i + 1];
                    inputArray[i + 1] = inputArray[i];
                    inputArray[i] = temp;
                    arraySorted = true;
                }
            }
        }
        return inputArray;
    }
}
