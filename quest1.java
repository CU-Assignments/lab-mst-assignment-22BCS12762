import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Map to store the next greater element for each element in nums2
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // Iterate through nums2 to fill the nextGreaterMap
        for (int num : nums2) {
            // While stack is not empty and the current number is greater than the number at the top of the stack
            while (!stack.isEmpty() && num > stack.peek()) {
                nextGreaterMap.put(stack.pop(), num); // Pop and map the next greater element
            }
            stack.push(num); // Push the current number onto the stack
        }

        // For any remaining elements in the stack, there is no next greater element
        while (!stack.isEmpty()) {
            nextGreaterMap.put(stack.pop(), -1);
        }

        // Prepare the result array for nums1
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreaterMap.get(nums1[i]); // Get the next greater element from the map
        }

        return result; // Return the result array
    }

    public static void main(String[] args) {
        NextGreaterElement solution = new NextGreaterElement();
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] result = solution.nextGreaterElement(nums1, nums2);

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
