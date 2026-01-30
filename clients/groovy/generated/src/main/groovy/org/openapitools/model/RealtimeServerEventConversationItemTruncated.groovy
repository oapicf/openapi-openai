package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class RealtimeServerEventConversationItemTruncated {
    /* The unique ID of the server event. */
    String eventId

    enum TypeEnum {
    
        CONVERSATION_ITEM_TRUNCATED("conversation.item.truncated")
    
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

    /* The event type, must be `conversation.item.truncated`. */
    TypeEnum type
    /* The ID of the assistant message item that was truncated. */
    String itemId
    /* The index of the content part that was truncated. */
    Integer contentIndex
    /* The duration up to which the audio was truncated, in milliseconds.  */
    Integer audioEndMs
}
