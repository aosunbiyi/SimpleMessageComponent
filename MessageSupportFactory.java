import java.util.Properties;
import java.io.IOException;

import com.tandt.publicinterface.MessageProvider;
import com.tandt.publicinterface.MessageRenderer;

public class MessageSupportFactory {
    private static MessageSupportFactory instance;

    private Properties props;
    private MessageRenderer renderer;
    private MessageProvider provider;

    private MessageSupportFactory() {
        try {
            props.load(this.getClass().getClassLoader().getResourceAsStream("msf.properties"));
            String rendererClass = props.getProperty("renderer.class");
            String providerClass = props.getProperty("provider.class");

            renderer = (MessageRenderer) Class.forName(rendererClass).newInstance();
            provider = (MessageProvider) Class.forName(providerClass).newInstance();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    static {
        instance = new MessageSupportFactory();
    }

    public static MessageSupportFactory getInstance() {
        return instance;
    }

    public MessageRenderer getMessageREnderer() {
        return renderer;
    }

    public MessageProvider getMessageProvider() {
        return provider;
    }
}