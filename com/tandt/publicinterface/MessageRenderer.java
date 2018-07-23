package com.tandt.publicinterface;

import com.tandt.publicinterface.MessageProvider;

public interface MessageRenderer {
    void render();

    void setMessageProvider(MessageProvider provider);

    MessageProvider getMessageProvider();
}