package JavaFundamentals;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args){
        int[] arr={5,4,3,2,1,7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int total=Arrays.stream(arr).sum();
        System.out.println("total : " +total);
    }
}
