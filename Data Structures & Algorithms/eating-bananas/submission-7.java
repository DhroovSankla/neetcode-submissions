class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int speed = 1;
       while(true) {
        long totalHours = 0;
        for(int pile : piles) {
            totalHours += (int)  Math.ceil((double) pile/speed);
        }

        if(totalHours <= h) {
            return speed;
        }
        speed++;
       }
    }
}