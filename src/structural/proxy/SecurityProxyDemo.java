package structural.proxy;

public class SecurityProxyDemo {
    public static void main(String[] args) {
        TokenValidator tokenValidator = new TokenValidator();
        SessionTokens sessionTokens = new SessionTokens();
        String userName = "Andrzej";
        String channelName = "design_patterns";
        String message = "I will learn what proxy is!";
        sessionTokens.createTokenForUser(userName); // supozojme useri beni login

        MessageSender realMessageSender = new SlackMessageSender();
        MessageSender proxy = new SlackMessageSenderProxy(realMessageSender, sessionTokens, tokenValidator);

        proxy.sendMessage(channelName, userName, message);
    }
}