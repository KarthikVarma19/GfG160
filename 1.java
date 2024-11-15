/* Second Largest

Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the largest element.
*/
class Solution {
    public int getSecondLargest(int[] arr) {
        int largest = -1;
        int secondLargest = -1;
        for(int ele: arr){
            if(ele>largest){
                secondLargest = largest;
                largest = ele;
            }
            else if(ele>secondLargest && ele<largest){
                secondLargest = ele;
            }
        }
        return secondLargest;
    }
}
