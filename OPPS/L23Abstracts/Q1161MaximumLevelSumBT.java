package OPPS.L23Abstracts;

import java.util.*;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Q1161MaximumLevelSumBT {

    // This method calculates the maximum level sum in a binary tree
    public int maxLevelSum(TreeNode root) {
        // Create a queue to store nodes to be processed
        Queue<TreeNode> queue = new LinkedList<>();
        // Add the root node to the queue
        queue.add(root);
        // Create an array to store the sum of each level
        int[] sumArr = new int[1001]; // assuming the tree has at most 1000 levels
        // Call the sumOfLevel method to calculate the sum of each level
        sumOfLevel(queue, sumArr, 0);
        // Initialize variables to find the maximum sum and its corresponding level
        int maxSum = Integer.MIN_VALUE;
        int result = -1;
        // Iterate through the sumArr to find the maximum sum and its level
        for (int i = 0; i < sumArr.length; i++) {
            if (sumArr[i] > maxSum) {
                maxSum = sumArr[i];
                result = i;
            }
        }
        // Return the level with the maximum sum
        return result + 1;
    }

    // This method calculates the sum of each level in the binary tree
    private void sumOfLevel(Queue<TreeNode> queue, int[] sumArr, int level) {
        // Process each level in the tree
        while (!queue.isEmpty()) {
            // Get the number of nodes at the current level
            int size = queue.size();
            // Initialize a variable to store the sum of the current level
            int sum = 0;
            // Process each node at the current level
            for (int i = 0; i < size; i++) {
                // Dequeue a node and add its value to the sum
                TreeNode node = queue.poll();
                sum += node.val;
                // Enqueue the node's children to be processed in the next level
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            // Store the sum of the current level in the sumArr
            sumArr[level] = sum;
            // Move to the next level
            level++;
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(7);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(-8);
        System.out.println("Maximum level sum is: " + new Q1161MaximumLevelSumBT().maxLevelSum(root));
    }
}
