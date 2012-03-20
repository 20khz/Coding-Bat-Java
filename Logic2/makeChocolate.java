/*

http://codingbat.com/

We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). 
Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done. 

makeChocolate(4, 1, 9) → 4
makeChocolate(4, 1, 10) → -1
makeChocolate(4, 1, 7) → 2

*/

public int makeChocolate(int small, int big, int goal) {
	int total = 0;

	// Find the number of big
	while (big*5 > goal) 
	{
		big--;
	}
	// Add big bars
	total = big * 5;
	// Determine small to use
	if (goal - total <= small) 
	{
	    	return goal - total; 
	} 
	else     
    	{
    		return -1;
    	}
}