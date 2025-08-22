import java.util.*;
public class BubbleSort{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //taking input of number of people
        System.out.print("Enter the no. of people: ");
        int n=sc.nextInt();
        int age[]=new int[n];
        for(int i=0;i<n;i++){
            //taking the array input
            System.out.print("Enter the age of the person: ");
            age[i]=sc.nextInt();
        }        
        //bubble sort logic
        for(int i=0;i<age.length-1;i++){
            for(int j=0;j<age.length-i-1;j++){
                if(age[j]>age[j+1]){
                    int temp=age[j];
                    age[j]=age[j+1];
                    age[j+1]=temp;
                }
            }
        }
        //printing the elements after sorting in descending order
        for(int i=age.length-1;i>=0;i--){
            System.out.print(age[i]+" ");
        }
        System.out.println();
    }
}