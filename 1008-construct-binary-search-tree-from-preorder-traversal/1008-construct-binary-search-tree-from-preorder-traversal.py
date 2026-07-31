# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def bstFromPreorder(self, preorder: List[int]) -> Optional[TreeNode]:
        if not preorder:
            return None
        root = TreeNode(preorder[0])
        def construct(node,value):
            if not node:
                node=TreeNode(value)
                return node
            elif value>node.val:
                node.right=construct(node.right,value)
            elif value<node.val:
                node.left=construct(node.left,value)
            return node
        for i in range(1,len(preorder)):
            if preorder[i]>root.val:
                root.right=construct(root.right,preorder[i])
            elif preorder[i]<root.val:
                root.left=construct(root.left,preorder[i])
        return root
        