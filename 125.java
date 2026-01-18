class Solution{
  publid boolean isPalindrome (String s){
    int left = 0;
    int right = s.length()-1;
    while (left < right)
      {
        while (left < right && !Character.isLetterOrDigit(s.charAt(left))
        {
            left++;
        } 
        while (left < right && !Character.isLetterOrDigit(s.charAt(right))
        {
            right++;
        }
        if (Character.toLowerCase(s.char(left)) != Character.toLowerCase(s.char(right))
            {
              return false;
            }
      }
      return true;
  }
}
              
