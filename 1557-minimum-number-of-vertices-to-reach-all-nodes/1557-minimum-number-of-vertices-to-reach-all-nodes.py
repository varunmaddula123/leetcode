class Solution:
    def findSmallestSetOfVertices(self, n: int, edges: List[List[int]]) -> List[int]:
        indegree=[False]*n
        for _,node2 in edges:
            indegree[node2]=True
        return [node for node in range(n) if not indegree[node]]