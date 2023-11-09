// Time Complexity : O(logn)
// Space Complexity : O(logn)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this: None

// Your code here along with comments explaining your approach

class PowerOfX {
    public double myPow(double x, int n) {
        if(n==0){
            return 1.00;
        }
        double re = myPow(x,n/2);
        if(n%2==0){
            return re*re;
        }
        else{
            if(n>0)
                return re*re*x;
            else{
               return re*re*(1/x);
            }
        }
    }
}