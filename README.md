# QueueLine-Program
This system manages a bank’s customer queue using a LinkedList. Customers join the end with "ENQUEUE name" and leave the front with "DEQUEUE." It efficiently tracks arrivals and departures. At day's end, it prints all waiting customers or "EMPTY" if none, ensuring smooth queue handling and customer flow.

Bank Queue Management using LinkedList --> 
You are developing a queue management system for a bank branch in India. Customers arrive and stand in a line to be served.

If a new customer comes, the system receives:
"ENQUEUE name" queue. meaning the customer with the given name joins the end of the

If a customer is served, the system receives:
"DEQUEUE" → meaning the customer at the front of the queue leaves after being served.
At the end of the day, you need to print the list of all customers still waiting in the queue.

If no customers are waiting in the queue, print:
EMPTY

Input Format:
First line: integer N → number of operations.
Next N lines: each operation is either "ENQUEUE name" or "DEQUEUE".

Output Format:
Print all customer names remaining in the queue separated by spaces.
If no one is waiting, print "EMPTY".

1) Sample Input
6
ENQUEUE Ramesh
ENQUEUE Sita
DEQUEUE
ENQUEUE Aarav
ENQUEUE Priya
DEQUEUE

Sample Output
Aarav Priya

3) Sample Input
3
ENQUEUE Rohit
ENQUEUE Neha
ENQUEUE Ananya

Sample Output
Rohit Neha Ananya

