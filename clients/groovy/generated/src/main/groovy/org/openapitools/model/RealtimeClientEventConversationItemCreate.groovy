package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RealtimeConversationItem;

@Canonical
class RealtimeClientEventConversationItemCreate {
    /* Optional client-generated ID used to identify this event. */
    String eventId

    enum TypeEnum {
    
        CONVERSATION_ITEM_CREATE("conversation.item.create")
    
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

    /* The event type, must be `conversation.item.create`. */
    TypeEnum type
    /* The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added.  */
    String previousItemId
    
    RealtimeConversationItem item
}
