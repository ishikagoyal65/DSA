class Solution {
    public int[] plusOne(int[] digits) {
        int j=digits.length-1;
        while(j>=0){
            if(digits[j]==9){
                digits[j]=0;
                j--;
            }else{
                digits[j]+=1;
                return digits;
            }
        }
        int []newDigits=new int[digits.length+1];
        newDigits[0]=1;
        return newDigits;
    }
}