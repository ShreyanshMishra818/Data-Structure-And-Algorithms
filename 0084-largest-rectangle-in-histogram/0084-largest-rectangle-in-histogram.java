class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int rb[]=new int[n];
        int lb[]=new int[n];
        
        
        Stack<Integer> stk= new Stack<>();
        stk.push(n-1);
        rb[n-1]=n;
        for(int i=n-2;i>=0;i--){
            while(stk.size()>0 && heights[i]<=heights[stk.peek()]){
                stk.pop();
            }
            if(stk.size()==0){
                rb[i]=n;
            }else{
                rb[i]=stk.peek();
            }
            stk.push(i);
        }
        
        stk=new Stack<>();
        lb[0]=-1;
        stk.push(0);
        for(int i=1;i<n;i++){
            while(stk.size()>0 && heights[i]<=heights[stk.peek()]){
                stk.pop();
                
            }
            if(stk.size()==0){
                lb[i]=-1;
            }else{
                lb[i]=stk.peek();
            }
            stk.push(i);
        }
        int max=0;
        for(int i=0;i<n;i++){
            int width= rb[i]-lb[i]-1;
            max=Math.max(max,width*heights[i]);
        }
        return max;
    }
}