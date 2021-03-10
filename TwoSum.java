class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.length()<1)
            return " ";
        int end = 0;
        int start = 0;
        for(int i = 0 ; i < s.length() ; i++){
            int specialcaselength = expansionAroundCenter(s,i,i);
            int normalcaselength =  expansionAroundCenter(s,i,i+1);
            int length = Math.max(specialcaselength,normalcaselength);
            if(length > end-start){
                start = i-((length-1)/2);
                end = i+(length)/2;
            }
        }
        return s.substring(start,end+1);
        
        
    }
    
    public int expansionAroundCenter(String s , int l , int r){
        if(s==null || l>r)
            return 0;
        while(l>=0 && r < s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
}