package EdgeOfOcean;

public class AdjacentElementsProduct {

    //Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.
    //
    //Example
    //
    //For inputArray = [3, 6, -2, -5, 7, 3], the output should be
    //adjacentElementsProduct(inputArray) = 21.

    public static void main(String[] args) {

        int [] input = {3, 6, -2, -5, 7, 3};

        adjacentElementsProduct(input);


    }




    private static int adjacentElementsProduct(int[] inputArray) {

        int current = 0;
        int maxNum = -200;
        int u = 1;



        for(int i = 1 ; i < inputArray.length ; i+= 1){

            u = i-1;
            current = inputArray[i] * inputArray[u];
            System.out.println("   "+inputArray[i] + " " + inputArray[u]);
            System.out.println("");
            System.out.println("current  "+current);
            if(current > maxNum){
                maxNum = current;
                System.out.println("new maximum  "+maxNum);
            }


        }


        return maxNum;
    }




}
