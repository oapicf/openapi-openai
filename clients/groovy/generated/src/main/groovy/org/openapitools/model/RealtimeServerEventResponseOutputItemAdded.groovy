package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RealtimeConversationItem;

@Canonical
class RealtimeServerEventResponseOutputItemAdded {
    /* The unique ID of the server event. */
    String eventId

    enum TypeEnum {
    
        RESPONSE_OUTPUT_ITEM_ADDED("response.output_item.added")
    
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

    /* The event type, must be `response.output_item.added`. */
    TypeEnum type
    /* The ID of the Response to which the item belongs. */
    String responseId
    /* The index of the output item in the Response. */
    Integer outputIndex
    
    RealtimeConversationItem item
}
