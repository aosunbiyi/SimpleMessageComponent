package com.tandt.base;

import com.tandt.publicinterface.MessageProvider;
import com.tandt.publicinterface.MessageRenderer;

public class StandardOutMessageRenderer implements MessageRenderer{

    private MessageProvider messageProvider;
    @Override
    public void render(){
      if(messageProvider ==null){
          String message = "You must set the property messageProvider of class ";
		throw new RuntimeException(message + StandardOutMessageRenderer.class.getName());
      }
      System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider provider){
      this.messageProvider=provider;
    }

    @Override
    public MessageProvider getMessageProvider(){
        return this.messageProvider;
    }
}