/*

http://codingbat.com/

Given three ints, a b c, one of them is small, one is medium and one is large. 
Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large. 

evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
*/

public boolean evenlySpaced(int a, int b, int c) {
   int [] sorted = sort(a, b, c);
   return (diff(sorted[0],sorted[1]) == diff(sorted[1],sorted[2]));
}

public int diff(int x, int y) {
	return (Math.abs(x - y));
}

public int[] sort(int a, int b, int c) {
        int[] array = {a, b, c};
        
        for (int i = 0; i < array.length-1; i++) {
           for (int j = i+1; j < array.length; j++) {
             if (array[i] > array[j]) {
               int temp = array[j];
               array[j] = array[i];
               array[i] = temp;
             }
           }
        }
        
        return array;
}  