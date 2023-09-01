package behavioral.chain_of_responsability;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        final AuthenticationHandler authenticationHandlerUnP = new UsernameAndPasswordAuthenticationHandler();
        final AuthenticationHandler authenticationHandlerBearer = new BearerTokenAuthenticationHandler();
        final AuthenticationHandler authenticationHandlerAws = new AwsAuthenticationHandler();

        final ChainAuthenticationElement lastElement = new ChainAuthenticationElement(authenticationHandlerAws);
        final ChainAuthenticationElement middleElement = new ChainAuthenticationElement(authenticationHandlerBearer, lastElement);
        final ChainAuthenticationElement firstElement = new ChainAuthenticationElement(authenticationHandlerUnP, middleElement);

        firstElement.authenticate(new AwsSignature());
        firstElement.authenticate(new UsernameAndPasswordCredentials());
        firstElement.authenticate(new BearerToken());

        // possible output: INFO pl.sdacademy.cor.ChainAuthenticationElement - Authentication using handler BearerTokenAuthenticationHandler
    }
}
