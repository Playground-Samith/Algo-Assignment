import java.util.Scanner;

public class Algo_4 {
    final static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int x=0;
        int[] nums = {10, 20, 30, 40, 50};
        for(int i=0;i<nums.length/2;i++){
            x=nums[i];
            nums[i]=nums[nums.length-1-i];
            nums[nums.length-1-i]=x;  
        }
        System.out.print("{");
        for(int i=0;i<nums.length;i++){
            System.out.printf("%d,",nums[i]);
        }
        System.out.print("\b}\n");

    }
    
}
