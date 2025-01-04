//5. Majority Element

public class Jaseel_5 {
    public static void main(String[] args) {
        int[] nums = {1,1,5,6,5,5,6,6,6,7};
        System.out.println(majorityElement(nums));
    }
    static int majorityElement(int[] nums) {
        int candi=0,count=0;
        for(int num:nums){
            if(count == 0){
                candi = num;
            }
            if(num == candi){
                count+=1;
            }else{
                count-=1;
            }
        }
        return candi;
    }
}
