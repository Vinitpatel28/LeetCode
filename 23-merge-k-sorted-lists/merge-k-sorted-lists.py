class Solution:
    def mergeKLists(self, lists):
        from heapq import heappush, heappop
        
        dummy = ListNode(0)
        curr = dummy
        heap = []
        
        for i, lst in enumerate(lists):
            if lst:
                heappush(heap, (lst.val, i, lst))
        
        while heap:
            val, i, node = heappop(heap)
            curr.next = node
            curr = curr.next
            
            if node.next:
                heappush(heap, (node.next.val, i, node.next))
        
        return dummy.next