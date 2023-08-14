import java.util.Scanner;

public class Algo_2 {
    final static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int minNum;
        int maxNum;
        int[] nums = {-5, 2, 7, 10, 58, -7, 8, 23} ;
        minNum=nums[0];
        maxNum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(minNum>nums[i]){
                minNum=nums[i];
            }
            if(maxNum<nums[i]){
                maxNum=nums[i];
            }

        }
        System.out.printf("Maximum Number : %d \n",maxNum);
        System.out.printf("Minimum Number : %d \n",minNum);

    }
    
}
