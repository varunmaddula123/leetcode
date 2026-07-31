# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def trimBST(self, root: Optional[TreeNode], low: int, high: int) -> Optional[TreeNode]:
        def pre(node):
            if not node:
                return node
            if node.val>high:
                return pre(node.left)
            if node.val<low:
                return pre(node.right)
            else:
                node.left=pre(node.left)
                node.right=pre(node.right)
                return node
        pre(root)
        return pre(root)