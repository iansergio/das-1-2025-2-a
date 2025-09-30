package br.univille;

import com.azure.core.amqp.AmqpTransportType;
import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.messaging.servicebus.ServiceBusMessage;
import com.azure.messaging.servicebus.ServiceBusSenderClient;

public class Producer {
    public static void main(String[] args) {
        var server = "sb-das1-2025.servicebus.windows.net";

        String key = System.getenv("CHAVE");
        String queue = "queue-iansergio";

        ServiceBusSenderClient senderClient = new ServiceBusClientBuilder()
                .fullyQualifiedNamespace(server)
                .connectionString(key)
                .transportType(AmqpTransportType.AMQP_WEB_SOCKETS)
                .sender()
                .queueName(queue)
                .buildClient();

        senderClient.sendMessage(new ServiceBusMessage("Bom dia 1"));
        senderClient.sendMessage(new ServiceBusMessage("Bom 2"));
        senderClient.sendMessage(new ServiceBusMessage("Dia 3"));
    }

}
