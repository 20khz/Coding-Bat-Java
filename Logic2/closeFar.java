/*
  http://codingbat.com/

  Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", 
  differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number. 

  closeFar(1, 2, 10) → true
  closeFar(1, 2, 3) → false
  closeFar(4, 1, 3) → true
*/

public boolean closeFar(int a, int b, int c) {

  if (isFar(b, c)) {
    if (isClose(a, b) && isFar(a, c)) {
      return true;
    }
    if (isClose(a, c) && isFar(a, b)) {
      return true;
    }
  }
  return false;
}
public boolean isFar(int x, int y) {
  return (Math.abs(x-y) >= 2);
}
public boolean isClose(int x, int y) {
  return (Math.abs(x-y) <= 1);
}