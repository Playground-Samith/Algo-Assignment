import java.util.Scanner;

public class Algo_5 {
     final static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        start:
        {
        System.out.print("Enter a text : ");
        String text=scanner.nextLine();
        text=text.strip();
        if(text.length()==0){
            System.out.println("Input is empty.Please enter a text.");
            break start;
        }
        char[] letterArr=text.toCharArray();
        for(int i=0;i<letterArr.length/2;i++){
            char t=letterArr[i];
            letterArr[i]=letterArr[letterArr.length-1-i];
            letterArr[letterArr.length-1-i]=t;
        }
        System.out.printf("Invert sequence of %s is ",text);
        for(int i=0;i<letterArr.length;i++){
            System.out.printf("%s",letterArr[i]);
        }
        System.out.println();
        } 
    }
    
}
