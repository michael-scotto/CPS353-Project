import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.protobuf.services.ProtoReflectionService;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import io.grpc.Grpc;
import io.grpc.InsecureServerCredentials;

    public class LychrelComputationServer {
        private Server server;

        private void start() throws IOException {
            int port = 50052;

            server = ServerBuilder.forPort(port)
                    .addService(new LychrelComputationServiceImpl())
                    .addService(ProtoReflectionService.newInstance())
                    .build()
                    .start();

            System.out.println("Server started on port " + port);

            Runtime.getRuntime().addShutdownHook(new Thread() {
                @Override
                public void run() {
                    System.err.println("*** shutting down gRPC server since JVM is shutting down");
                    try {
                        LychrelComputationServer.this.stop();
                    } catch (InterruptedException e) {
                        e.printStackTrace(System.err);
                    }
                    System.err.println("*** server shut down");
                }
            });
        }

        private void stop() throws InterruptedException {
            if (server != null) {
                server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
            }
        }

        private void blockUntilShutdown() throws InterruptedException {
            if (server != null) {
                server.awaitTermination();
            }
        }

        public static void main(String[] args) throws IOException, InterruptedException {
            LychrelComputationServer server = new LychrelComputationServer();
            server.start();
            server.blockUntilShutdown();
        }
    }

