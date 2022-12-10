import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Inorder_Traversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        helper(root, lst);
        return lst;
    }

    public void helper(TreeNode root, List<Integer> lst) {
        if (root == null) return;
        helper(root.left,lst);
        lst.add(root.val);
        helper(root.right,lst);

    }
}
