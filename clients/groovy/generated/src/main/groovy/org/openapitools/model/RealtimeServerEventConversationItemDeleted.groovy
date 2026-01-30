package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class RealtimeServerEventConversationItemDeleted {
    /* The unique ID of the server event. */
    String eventId

    enum TypeEnum {
    
        CONVERSATION_ITEM_DELETED("conversation.item.deleted")
    
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

    /* The event type, must be `conversation.item.deleted`. */
    TypeEnum type
    /* The ID of the item that was deleted. */
    String itemId
}
