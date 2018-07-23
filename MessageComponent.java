import  com.tandt.*;
import com.tandt.publicinterface.*;
import com.tandt.base.HelloWorldMessageProvider;
import com.tandt.base.StandardOutMessageRenderer;

public class MessageComponent{
    public static void main(String [] args){
        MessageRenderer mr= new StandardOutMessageRenderer();
        MessageProvider mp= new HelloWorldMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    
    }
}