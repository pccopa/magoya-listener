##  How to use it - Accounts and Transactions Listener.

Accounts and Transactions service, trigger multiple events and send it to RabbitMQ, 
this application has a purpose to listen that events and registered on a database.

This application doesn't have any endpoint to consume. So, you only can see their functionality on database persistence or rabbitmq console.


### Further releases

- Unit testing is a must
- App need a Controller Advice to handle multiple exception scenarios. Today no exceptions are handled.
