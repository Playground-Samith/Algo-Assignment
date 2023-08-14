import java.util.Scanner;

public class Algo_1{
    final static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int numi;
        int numj;
        int total;

        case1:
        {
            System.out.print("Enter a positive number :");
            int num= scanner.nextInt();
            scanner.nextLine();

            if(num < 0){
                System.out.println("Invalid number.Please input positive integer value....");
                break case1;
            }
            else{
                numi=0;
                numj=1;
                total=numi+numj;
                System.out.print(numi+","+numj);

                do{
                    System.out.print(","+total);
                    numi=numj;
                    numj=total;
                    total=numi+numj;
                    
                }while(total<num);
            }
            System.out.println();
        }
    }
}