package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RealtimeServerEventResponseContentPartAddedPart;

@Canonical
class RealtimeServerEventResponseContentPartAdded {
    /* The unique ID of the server event. */
    String eventId

    enum TypeEnum {
    
        RESPONSE_CONTENT_PART_ADDED("response.content_part.added")
    
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

    /* The event type, must be `response.content_part.added`. */
    TypeEnum type
    /* The ID of the response. */
    String responseId
    /* The ID of the item to which the content part was added. */
    String itemId
    /* The index of the output item in the response. */
    Integer outputIndex
    /* The index of the content part in the item's content array. */
    Integer contentIndex
    
    RealtimeServerEventResponseContentPartAddedPart part
}
