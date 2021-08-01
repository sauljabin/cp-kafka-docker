package kafka.sandbox.cli;

import picocli.CommandLine.Command;
import picocli.CommandLine.Model.CommandSpec;

import static picocli.CommandLine.ParameterException;
import static picocli.CommandLine.Spec;

@Command(
        name = "kafka-clients",
        description = "Allows you either to producer or consume form the supplier topic",
        synopsisSubcommandLabel = "COMMAND"
)
public class KafkaClients implements Runnable {
    @Spec
    private CommandSpec spec;

    @Override
    public void run() {
        throw new ParameterException(spec.commandLine(), "Missing required subcommand");
    }
}
