class Solution {
    public int getSecondLargest(int[] arr) {
       int m1= -1, m2= -1;
       for(int i=0; i<arr.length;i++){
           int num = arr[i];
           if(num > m1){
               m2=m1;
               m1= num;
           }else if(num > m2 && num!= m1){
               m2 = num;
           }
       }
       return m2;
    }
}