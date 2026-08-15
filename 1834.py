import heapq

class Solution(object):
    def getOrder(self, tasks):
        """
        :type tasks: List[List[int]]
        :rtype: List[int]
        """
        
        n = len(tasks)

        # Add original index
        arr = []
        for i in range(n):
            arr.append([tasks[i][0], tasks[i][1], i])

        # Sort by enqueue time
        arr.sort()

        heap = []
        ans = []

        time = 0
        i = 0

        while i < n or heap:

            # If no task is available
            if not heap:
                time = max(time, arr[i][0])

            # Add all available tasks
            while i < n and arr[i][0] <= time:
                heapq.heappush(heap, (arr[i][1], arr[i][2]))
                i += 1

            # Choose task with smallest processing time
            process, index = heapq.heappop(heap)

            ans.append(index)

            # Process the task
            time += process

        return ans
