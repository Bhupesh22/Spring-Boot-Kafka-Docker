# Running Spring Boot + Kafka + Zookeeper using Docker

To run the Spring Boot application along with Kafka and Zookeeper using Docker, execute the following command:

### Start the Containers
```bash
docker-compose up -d
```

This will spin up the Spring application, Kafka, and Zookeeper services in the background.

### Sending Messages from Producer to Consumer

Use the following URL to send messages from the producer to the consumer:
```bash
http://localhost:8080/api/send-message
```

### Running Zookeeper and Kafka Independently

If you want to run only Zookeeper and Kafka without the Spring application, you can use the following commands:

### Create a Kafka Topic
```bash
docker exec broker kafka-topics --bootstrap-server broker:9092 --create --topic mytopic
```

### List Kafka Topics
```bash
docker exec broker kafka-topics --bootstrap-server broker:9092 --list
```

### Producing Messages
```bash
docker exec --interactive --tty broker kafka-console-producer --bootstrap-server broker:9092 --topic mytopic
```
```
> posting message to topic
> first message
> second message
> third message
> fourth message
```

### Consuming Messages
```bash
docker exec --interactive --tty broker kafka-console-consumer --bootstrap-server broker:9092 --topic mytopic --from-beginning
```
```
posting message to topic
first message
second message
third message
fourth message
^CProcessed a total of 5 messages
```

### Remember to stop the containers once you are done using them:

```bash
docker-compose down
```