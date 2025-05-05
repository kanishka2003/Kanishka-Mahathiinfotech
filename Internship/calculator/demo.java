package task;

import java.util.*;

class demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Calc cal=new Calc();
        System.out.println("Wlecome to calc!");
        int opt=1;
        // atleast once the program is run using do.. while loop
        do{
        try {
        	//provide calc option to the user
        System.out.println("1.Add,2.Subtract,3.Multiply,4.divison");
        System.out.println("Enter the choice:");
        int n=sc.nextInt();
        System.out.println("Enter the number of inputs:");
        int len=sc.nextInt();
    	if(len<2) {
        	System.out.println("The given length is less so provide more than two 2 values!!");
        	System.out.println("");
        }
        else {
        int[] arr=new int[len];
        for(int i=0;i<len;i++){
        	System.out.println("Enter number "+(i+1)+" :");
        	arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        switch(n){
            case 1:
                 System.out.println("Addition of the given input is: "+cal.addition(arr));
                break;
            case 2:
                System.out.println("Subtraction of the given input is: "+cal.subtract(arr));
                break;
            case 3:
                System.out.println("Multiplication of the given input is: "+cal.multiply(arr));
                break;
            case 4:
                System.out.println("Division of the given input is: "+cal.division(arr));
                break;
            default:
                 System.out.println("Invaild option");
                 break;
        }
        }
        System.out.println("If you want to exit press 0 or continue press 1");
        System.out.println("enter the option:");
        opt=sc.nextInt();
        }catch(Exception e1) {
        	System.out.println("Provide valid number");
        	sc.nextLine();
        	opt=1;
        }
        }while(opt!=0);
        System.out.println("Thank you!");
        sc.close();
    }
}
