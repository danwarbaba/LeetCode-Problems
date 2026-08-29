class Solution {
    public int maxProduct(int n) {
        int res=1;
        List<Integer> li = new ArrayList<>();
        while(n>0){
            li.add(n%10);
            n/=10;
        }

        for(int i=0;i<li.size()-1 && li.size()>2;i++){
            if(res*li.get(i)>res*li.get(i+1)){
                res*=li.get(i);
            }else{
                res*=li.get(i+1);
            }
        }
        if(li.size()==2){
            return (li.get(0)*li.get(1));
        }
        return res;
        
    }
}