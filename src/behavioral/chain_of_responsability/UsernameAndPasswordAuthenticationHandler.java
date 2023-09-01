package behavioral.chain_of_responsability;

import java.util.Random;

public class UsernameAndPasswordAuthenticationHandler implements AuthenticationHandler {
    @Override
    public boolean authenticate(final Credentials credentials) {
        if (supports(credentials.getClass())) {
            return isPasswordValid(credentials);
        }
        return false;
    }

    @Override
    public boolean supports(final Class<?> clazz) {
        return clazz.isInstance(UsernameAndPasswordCredentials.class);
    }

    public boolean isPasswordValid(Credentials credentials) {
        return new Random().nextBoolean(); // dummy implementation - use real credentials in the real implementation
    }
}
