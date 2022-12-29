import java.util.Arrays;

class hello {
    public static void main(String[] args) {
        int[] nums = { -7, 3, 4, -10 };
        System.out.println(count(nums));
        
    }
    
    public static int count(int[] nums){
        Arrays.sort(nums);
        int count = 0;
        int length = nums.length;
        int res = 0;
        for (int i = length - 1; i >= 0; i--) {
            count += nums[i];
            System.out.println(count);
            if (count <= 0) {
                res = length - i - 1;
                break;
            }
        }
        return res;
    }
}
