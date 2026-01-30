package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RealtimeServerEventConversationCreatedConversation;

@Canonical
class RealtimeServerEventConversationCreated {
    /* The unique ID of the server event. */
    String eventId

    enum TypeEnum {
    
        CONVERSATION_CREATED("conversation.created")
    
        private final String value
    
        TypeEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The event type, must be `conversation.created`. */
    TypeEnum type
    
    RealtimeServerEventConversationCreatedConversation conversation
}
