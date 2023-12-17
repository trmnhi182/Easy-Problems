package Part2;

//bigCount = count of big flour bags (5 kilos each)
//smallCount = count of small flour bags (1 kilo each)
//goal = the goal amount of kilos of flours  to assemble a package

//Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal.
// The method should return true if it is possible to make a package with goal kilos of flour.
// If the sum is greater than goal, ensure that only full bags are used towards the goal amount.
// For example, if goal = 9, bigCount = 2, and smallCount = 0,
// the method should return false since each big bag is 5 kilos and cannot be divided.

// However, if goal = 9, bigCount = 1, and smallCount = 5,
// the method should return true because of 1 full bigCount bag and 4 full smallCount bags equal goal,
// and it's okay if there are additional bags left over.
// If any of the parameters are negative, return false.
public class Problem16 {
    private static final int BIG_WEIGHT = 5;
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0) {return false;}

        boolean result = false;
        int totalBigWeight = bigCount * BIG_WEIGHT;
        if (totalBigWeight >= goal) {
            int remaining = goal % BIG_WEIGHT;
            if (smallCount >= remaining) {
                result = true;
            }
        } else {
            if (smallCount >= goal - totalBigWeight) {
                result = true;
            }
        }
        return result;
    }
}
