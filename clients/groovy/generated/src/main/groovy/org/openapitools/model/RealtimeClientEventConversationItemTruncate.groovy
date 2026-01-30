package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class RealtimeClientEventConversationItemTruncate {
    /* Optional client-generated ID used to identify this event. */
    String eventId

    enum TypeEnum {
    
        CONVERSATION_ITEM_TRUNCATE("conversation.item.truncate")
    
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

    /* The event type, must be `conversation.item.truncate`. */
    TypeEnum type
    /* The ID of the assistant message item to truncate. Only assistant message  items can be truncated.  */
    String itemId
    /* The index of the content part to truncate. Set this to 0. */
    Integer contentIndex
    /* Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error.  */
    Integer audioEndMs
}
