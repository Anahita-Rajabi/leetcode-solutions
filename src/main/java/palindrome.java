class PalindromeSolution{
    public boolean isPalindrome(int x){
        //negative numbers are not palindrome
        if (x<0){
            return false;
        }

        //convert number to string
        String num = Integer.toString(x);

        //two pointers
        int left = 0;
        int right = num.length()-1;
        //compare from both sides
        while(left<right){
            //if not equal return false
            if(num.charAt(left) != num.charAt(right)){
                return false;
            }
            //move inward
            left++;
            right--;
        }
        return true;
    }
}