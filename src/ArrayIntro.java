import java.util.Arrays;
class ArrayIntro {
    public static void main(String[] args){
        int []nums= {10,20,30,40};
        System.out.println(nums.length);
        nums[3]=50;
        System.out.println(nums[3]);
        System.out.println(nums[2]);
        System.out.println(Arrays.toString(nums));
        int []arr=new int[3];
        int x=10;
        for(int i=0;i<arr.length;i++){
            arr[i]=x;
            x=x+10;
        }
        System.out.println(Arrays.toString(arr));
    }
}