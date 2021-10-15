# Link

https://leetcode.com/problems/meeting-rooms-ii/

## Insight

Very different from run of the mill interval questions. 

Firstly, sort intervals by start time to process them in order. 

Maintain a minheap of ending times. The size of the minheap represents the number of rooms
in use, and the ending times represent the times from which the rooms will be free. For each
interval, we check if the earliest ending time (top of minheap) will be free when it needs to use it. 
If yes, we update this room's ending time with the current interval's ending time. Otherwise,
if the earliest ending time (top of minheap) is not free, all other rooms with later ending times
will also not be free for the current interval, hence a new room has to be added with the 
ending time of the current interval. 
2. 