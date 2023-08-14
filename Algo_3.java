import java.util.Scanner;

public class Algo_3 {
     final static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int[] newNums=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            newNums[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=newNums[nums.length-1-i];
        }
        System.out.print("{");
        for(int i=0;i<nums.length;i++){
            System.out.printf("%d,",nums[i]);
        }
        System.out.print("\b}\n");
    }
    
}
