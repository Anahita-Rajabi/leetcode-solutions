/**
 * LeetCode Problem: Same Tree
 *
 * @Author: Anahita Rajabi
 * @Date: 2026-04-25
 *
 * Description:
 * This method checks whether two binary trees are identical.
 * Two trees are identical if they have the same structure
 * and the same node values.
 */
/**
 * LeetCode Problem: Same Tree
 *
 * @author Anahita Rajabi
 * @date 2026-04-26
 */

class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) return true;

        if (p == null || q == null) return false;

        if (p.val != q.val) return false;

        return isSameTree(p.left, q.left) &&
                isSameTree(p.right, q.right);
    }
}}