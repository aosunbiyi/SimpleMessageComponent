package com.tandt.base;

import com.tandt.publicinterface.MessageProvider;

public class HelloWorldMessageProvider implements MessageProvider{
@Override
public String getMessage(){
    return "Hello World";
}
}