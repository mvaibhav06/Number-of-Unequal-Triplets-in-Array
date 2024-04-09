import java.util.Arrays;

public class UnequalTriplets {
    public static int unequalTriplets(int[] nums) {
        int out = 0;

        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    if(nums[i]!=nums[j] && nums[j]!=nums[k] && nums[k]!=nums[i]){
                        out++;
                    }
                }
            }
        }
        return out;
    }

    public static void main(String[] args) {
        int[] nums = {4,4,2,4,3};
        System.out.println(unequalTriplets(nums));
    }
}
