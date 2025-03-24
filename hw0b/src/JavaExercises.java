import java.util.ArrayList;
import java.util.List;

public class JavaExercises {

    /** Returns an array [1, 2, 3, 4, 5, 6] */
    public static int[] makeDice() {
        // TODO: Fill in this function.
        int[] a1 = new int[]{1,2,3,4,5,6};
        return a1;
    }

    /** Returns the order depending on the customer.
     *  If the customer is Ergun, return ["beyti", "pizza", "hamburger", "tea"].
     *  If the customer is Erik, return ["sushi", "pasta", "avocado", "coffee"].
     *  In any other case, return an empty String[] of size 3. */
    public static String[] takeOrder(String customer) {
        // TODO: Fill in this function.
        if (customer.equals("Ergun")){
            String[] order = new String[]{"beyti", "pizza", "hamburger", "tea"};
            return order;
        }else if(customer.equals("Erik")){
            String[] order = new String[]{"sushi", "pasta", "avocado", "coffee"};
            return order;
        }else{
            String[] order = new String[]{null,null,null};
            return order;
        }
    }

    /** Returns the positive difference between the maximum element and minimum element of the given array.
     *  Assumes array is nonempty. */
    public static int findMinMax(int[] array) {
        // TODO: Fill in this function.
        int i,maxone,minone;
        maxone=array[0];
        minone=array[0];
        for (i=1; i<array.length;i++){
            if(array[i]>maxone){
                maxone=array[i];
            }if(array[i]<minone){
                minone=array[i];
            }
        }
        return maxone-minone;
    }

    /**
      * Uses recursion to compute the hailstone sequence as a list of integers starting from an input number n.
      * Hailstone sequence is described as:
      *    - Pick a positive integer n as the start
      *        - If n is even, divide n by 2
      *        - If n is odd, multiply n by 3 and add 1
      *    - Continue this process until n is 1
      */
    public static List<Integer> hailstone(int n) {
        return hailstoneHelper(n, new ArrayList<>());
    }

    private static List<Integer> hailstoneHelper(int x, List<Integer> list) {
        // TODO: Fill in this function.
        if (x==1){
            list.add(1);
            return list;
        }if(x%2==0){
            list.add(x);
            return hailstoneHelper(x/2,list);
        }else{
            list.add(x);
            return hailstoneHelper(x*3+1,list);
        }
    }

    /*public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        List <Integer> result = hailstone(10);
        for (Integer i : result){
            System.out.println(i);
        }
    }*/
}
