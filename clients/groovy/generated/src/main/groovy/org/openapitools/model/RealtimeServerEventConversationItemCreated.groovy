package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RealtimeConversationItem;

@Canonical
class RealtimeServerEventConversationItemCreated {
    /* The unique ID of the server event. */
    String eventId

    enum TypeEnum {
    
        CONVERSATION_ITEM_CREATED("conversation.item.created")
    
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

    /* The event type, must be `conversation.item.created`. */
    TypeEnum type
    /* The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation.  */
    String previousItemId
    
    RealtimeConversationItem item
}
