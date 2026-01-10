class Solution {
    public String firstPalindrome(String[] words) {
        
        for(String s: words)
        {
            String s1="";
            for(int i=s.length()-1;i>=0;i--)
            {
                s1+=s.charAt(i);
            }
            if(s1.equals(s))
            {
                return s;
            }

        }
        return "";
    }
}