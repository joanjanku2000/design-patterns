package behavioral.chain_of_responsability;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) throws IOException {
        final AuthenticationHandler authenticationHandlerUnP = new UsernameAndPasswordAuthenticationHandler();
        final AuthenticationHandler authenticationHandlerBearer = new BearerTokenAuthenticationHandler();
        final AuthenticationHandler authenticationHandlerAws = new AwsAuthenticationHandler();

        final ChainAuthenticationElement lastElement = new ChainAuthenticationElement(authenticationHandlerAws);
        final ChainAuthenticationElement middleElement = new ChainAuthenticationElement(authenticationHandlerBearer, lastElement);
        final ChainAuthenticationElement firstElement = new ChainAuthenticationElement(authenticationHandlerUnP, middleElement);

        firstElement.authenticate(new AwsSignature());
        firstElement.authenticate(new UsernameAndPasswordCredentials());
        firstElement.authenticate(new BearerToken());


        Files.copy(Path.of("/src/main/java"),Path.of("src/main/java/e.java"));

        // possible output: INFO pl.sdacademy.cor.ChainAuthenticationElement - Authentication using handler BearerTokenAuthenticationHandler
    }
}
