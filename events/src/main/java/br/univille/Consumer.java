package br.univille;

import com.azure.core.amqp.AmqpTransportType;
import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.messaging.servicebus.ServiceBusProcessorClient;
import com.azure.messaging.servicebus.models.ServiceBusReceiveMode;

public class Consumer {

    public static void main(String[] args) {
        var server = "sb-das1-2025.servicebus.windows.net";

        String key = System.getenv("CHAVE");
        String queue = "queue-iansergio";

        ServiceBusProcessorClient processorClient = new ServiceBusClientBuilder()
                .fullyQualifiedNamespace(server)
                .connectionString(key)
                .transportType(AmqpTransportType.AMQP_WEB_SOCKETS)
                .processor()
                .queueName(queue)
                .receiveMode(ServiceBusReceiveMode.PEEK_LOCK)
                .processMessage(context -> {
                    System.out.println("Mensagem: " +
                            context.getMessage()
                                    .getBody().toString());
                    context.complete();
                })
                .processError(context -> {
                    System.out.println("Não deu certo");
                })
                .buildProcessorClient();

        processorClient.start();
    }
}
