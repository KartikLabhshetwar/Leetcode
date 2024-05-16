/*
7. Reverse Integer

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
*/

class RevInteger {
    public int reverse(int x) {
        long rev = 0;
        int temp;
        while(x != 0){
            temp= x%10;
            rev = rev*10 + temp;
            x /= 10;

            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int)rev;
    }
}
