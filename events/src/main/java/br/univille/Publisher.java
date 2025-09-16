package br.univille;

public class Publisher {
    public static void main(String[] args) {
        var server = "sbdas12025a.servicebus.windows.net";
        var topic = "topic-das1-a";

        DefaultAzureCredential = credential = new DefaultAzureCredentialBuilder().build();

        ServiceBusSenderClient client = new ServiceBusClientBuilder()
                .fullyQualifiedNamespace(server)
                .transportType(AmqpTransportType.AMQP_WEB_SOCKETS)
                .credential(credential)
                .sender()
                .topicName(topic)
                .buildClient();

    }
}
