
import java.io.*;
class Solution 
{
  public int solution(int N)
  {
    while(N % 2 == 0)
    {
      N = N / 2;
    }
    int count = 0,bingap = 0;
    while(N > 0)
    {
      int rem  = N % 2;
      if(rem == 0)
      {
        count++;
      }
      else 
      {
        if(count > bingap)
        {
          bingap = count;
        }
        count = 0;
      }
      N = N / 2;
    }
    return bingap;
  }
  public static void main (String[] args)
  {
    int N1 = 10;
    Solution t = new Solution();
    int b = t.solution(N1);
    System.out.println(b);
  }
}
