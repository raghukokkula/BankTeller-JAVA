Project: Bank Teller Simulation in JAVA

Consider a bank. A teller line can be thought of as a queue. As people arrive, they enter the rear of the queue and when the teller is finished with a customer, that customer is removed from the front of the queue. 

You will write a program to simulate the operation of a single teller queue.

The arrival of customers will be simulated with a single input file. Each line of data represents a new customer and the number of transactions that customer has. If a customer entry has 0 transactions, that simply means that at that time there was no customer entering the bank.

Your input data file will have the exact format of the following, and will have similar data:

1   Beth
5   David
0   no_cust

1   Beth means that Beth arrives with 1 transaction. 5   David means that David arrives with 5 transactions, and 0  no_cust means that there is no customer to add to the queue at this time.

When a customer "arrives" they shall be added to the queue.

Your program shall have a main loop, during which one item will be read from the input data file (if any items are remaining in the input data file) and the item will be placed on the queue; and a teller will handle one transaction for the current customer. The teller handles transactions for the current customer, one per loop, until the customer runs out of transactions. Whenever a customer runs out of transactions, that customer exits the bank, and a new customer will be taken off the queue.

Your program will write the message:
 "Customer <name> with <n> transactions enters the bank."
whenever a new customer is read from the input data file, and placed on the queue.

Your program will write the message:
"Customer <name> with <n> transactions is now the current customer handled by the teller."
whenever a customer is taken off the queue to become the current customer.

Your program will write the message:
"---Current customer <name> now has <i> transactions remaining.
at every iteration of the main loop. Note that the number of transactions remaining will decrement with every iteration of the main loop.
Your program will write the message:
"Current customer <name> has completed all his/her transactions and has exited the bank."
after the number of transactions remaining to the customer has been decremented to 0.
(Note that at this point the program will remove a new customer from the queue).

The program will terminate when there are no more customers in the input file, and when the queue is empty.

When the simulation is complete, the program must print out:
1) the total number of transactions
2) the total number of customers
3) the average number of transactions per customer
