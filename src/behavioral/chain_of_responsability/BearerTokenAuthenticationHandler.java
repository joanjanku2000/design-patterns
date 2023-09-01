package behavioral.chain_of_responsability;

import java.util.Random;

public class BearerTokenAuthenticationHandler implements AuthenticationHandler {

    @Override
    public boolean authenticate(final Credentials credentials) {
        if (supports(credentials.getClass())) {
            return isTokenValid(credentials);
        }
        return false;
    }

    @Override
    public boolean supports(final Class<?> clazz) {
        return clazz.equals(BearerToken.class);
    }

    public boolean isTokenValid(final Credentials credentials) {
        return (new Random().nextInt(3) % 3) != 0; // dummy implementation
    }
}