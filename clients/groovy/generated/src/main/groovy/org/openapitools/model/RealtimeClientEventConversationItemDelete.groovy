package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class RealtimeClientEventConversationItemDelete {
    /* Optional client-generated ID used to identify this event. */
    String eventId

    enum TypeEnum {
    
        CONVERSATION_ITEM_DELETE("conversation.item.delete")
    
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

    /* The event type, must be `conversation.item.delete`. */
    TypeEnum type
    /* The ID of the item to delete. */
    String itemId
}
