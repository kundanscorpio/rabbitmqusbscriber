# RabbitMQ Subscriber
This project is created to fulfill the following requirements: 
```
Create 2 spring boot apps, one calling another (testable via curl). 
This would use pub/sub communication. We currently utilise RabbitMQ as our 
messaging tier. Please do as much as you think is necessary to compete the tasks.
```

## Preparing RabbitMQ
you will need a RabbitMQ installation ready on your local machine.

You can do this by creating a `docker-compose.yml` file as in the following lines
```
rabbitmq:
  image: rabbitmq:management
  ports:
    - "5672:5672"
    - "15672:15672"
```
and run the docker image by `docker-compose up` command.

Then you need access the management console (http://localhost:15672/, with user:guest and password:guest)
and create a queue named "pubSubQ". The application assumes you have the queue ready.

You can see the submitted message by curling or visiting the same URL in your browser
```
curl http://localhost:8081/list
```