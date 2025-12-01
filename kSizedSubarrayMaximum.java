import java.util.*;
class kSizedSubarrayMaximum {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        int l=0;
        int r=k-1;
        int n= arr.length;
        ArrayList<Integer> List = new ArrayList<>();
        int maxe=arr[0];
        for(int i=l+1;i<=r;i++){
            maxe=Math.max(arr[i],maxe);
        }
        List.add(maxe);
        while(r<n-1){
            l++;
            r++;
            if(arr[l-1]==maxe){
                maxe=arr[l];
                for(int i=l+1;i<=r;i++){
                    maxe=Math.max(arr[i],maxe);
                } 
            }else{
                maxe=Math.max(maxe,arr[r]);
            }
            List.add(maxe);
            
        }
        return List;
    }
    public static void main(String[] args) {
        kSizedSubarrayMaximum s = new kSizedSubarrayMaximum();
        int[] arr={1,2,5,6,8,3};
        int k=3;
        System.out.println(s.maxOfSubarrays(arr,k));
    }
}