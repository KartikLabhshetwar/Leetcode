//Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

//Return the array in the form [x1,y1,x2,y2,...,xn,yn].

class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int new_arr[] = new int[2*n];
        for(int i = 0 ; i < n ; i++){
            new_arr[2*i] = nums[i];
            new_arr[(2*i)+1] = nums[i+n];
        }
        return new_arr;
    }
}
