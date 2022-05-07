# Kafka Connect

It makes it simple to quickly define connectors that move large data sets into and out of Kafka.

- [connect](https://docs.confluent.io/current/connect/index.html)
- [connect settings](https://docs.confluent.io/platform/current/installation/configuration/connect/index.html)
- [connect api reference](https://docs.confluent.io/platform/current/connect/references/restapi.html)
- [jdbc connector plugin](https://www.confluent.io/hub/confluentinc/kafka-connect-jdbc)
- [mongo connector plugin](https://www.confluent.io/hub/mongodb/kafka-connect-mongodb)
- project location: [kafka-connect](kafka-connect)
- plugins location: [kafka-connect/plugins](kafka-connect/plugins)
- requests location: [kafka-connect/requests](kafka-connect/requests)
- connect port: `8082`

Run Kafka Connect:

```bash
cd kafka-connect
docker compose up -d
http :8082/connector-plugins
```