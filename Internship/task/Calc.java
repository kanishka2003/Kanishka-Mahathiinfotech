package task;

public class Calc{
   public int addition(int[] arr){
       int sum=0;
       for(int x=0;x<arr.length;x++){
           sum+=arr[x];
       }
       return sum;
       
   }
   public int subtract(int[] arr){
     
      int sum=arr[0];
       for(int x=1;x<arr.length;x++){
           sum-=arr[x];
       }
       return sum;
       
   }
   public int multiply(int[] arr){
      int value=1;
       for(int x=0;x<arr.length;x++){
           value*=arr[x];
       }
       return value;
       
   }
   public int division(int[] arr){
	   int value =arr[0];
       for(int x=0;x<arr.length;x++){
           value/=arr[x];
       }
       return value;
       
   }
}
