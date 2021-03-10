class Solution {
    public int trap(int[] height) {
        int p1 = 0;
        int p2 = height.length - 1;
        int water_count = 0;
        int max_height = 0;
        while(p1<p2){
            if(height[p1]<height[p2]){
                max_height = Math.max(max_height,height[p1]);
                water_count+=max_height-height[p1];
                 p1++;
                }
            else{
                max_height = Math.max(max_height,height[p2]);
                water_count+=max_height-height[p2];
                p2--;
                 
            }
                
            
        }
        return water_count;
        
    }
}