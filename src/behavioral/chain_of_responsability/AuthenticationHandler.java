package behavioral.chain_of_responsability;

public interface AuthenticationHandler {
    boolean authenticate(Credentials credentials);
    boolean supports(Class<?> clazz);
}
