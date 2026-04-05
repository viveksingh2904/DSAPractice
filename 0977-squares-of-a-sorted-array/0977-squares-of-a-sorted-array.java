class Solution {
    public int[] sortedSquares(int[] nums) {
        int n= nums.length;
        List<Integer> neg=new ArrayList<>();
        List<Integer> pos=new ArrayList<>();
// split original number
        for(int num : nums){
            if(num < 0){
                neg.add(num);
            }else{
                pos.add(num);
            }
        }
        //step 2: square both 
        for(int i=0;i<neg.size();i++){
            neg.set(i, neg.get(i) * neg.get(i));
            
        }
        //reverse neg square
        Collections.reverse(neg);
        
        for(int i=0; i<pos.size();i++){
            pos.set(i, pos.get(i)* pos.get(i));
        }
        //Merge 
        int[] result=new int[nums.length];
        int i=0,j=0,k=0;
        while(i<neg.size() && j< pos.size()){
            if(neg.get(i)<pos.get(j)){
                result[k++]=neg.get(i++);
            }else{
                result[k++]=pos.get(j++);
            }
        }
        while(i<neg.size()){
            result[k++]=neg.get(i++);
        }
        while(j<pos.size()){
            result[k++]=pos.get(j++);
        }
        return result;
    }
}