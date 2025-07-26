public class Arraysum {
    public int maxsum(int[] nums) {
        int sum = 0;
        for (int i= 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Arraysum arraySum = new Arraysum();
        int sum = arraySum.maxsum(arr);
        System.out.println("The sum of the array elements is: " + sum);
    }
}
