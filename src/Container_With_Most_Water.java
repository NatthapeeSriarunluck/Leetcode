/*have a left and right pointer at the start and end of array. Find area, move the pointer at the smaller bar towards
the center in case we find a larger bar, moving larger bar to the center doesn't make sense since it reduces width
while the left bar stays unchanged.
 */

public class Container_With_Most_Water {
    public static int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int leftPointer = 0;
        int rightPointer = height.length - 1;

        while (leftPointer < rightPointer) {
            int xAxis = rightPointer - leftPointer;
            int yAxis = Math.min(height[leftPointer], height[rightPointer]);
            int currentArea = xAxis * yAxis;
            maxArea = Math.max(maxArea, currentArea);
            if (height[leftPointer] <= height[rightPointer]) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        return maxArea;
    }
}

