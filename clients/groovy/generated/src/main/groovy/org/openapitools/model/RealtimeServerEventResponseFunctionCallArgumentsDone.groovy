package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class RealtimeServerEventResponseFunctionCallArgumentsDone {
    /* The unique ID of the server event. */
    String eventId

    enum TypeEnum {
    
        RESPONSE_FUNCTION_CALL_ARGUMENTS_DONE("response.function_call_arguments.done")
    
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

    /* The event type, must be `response.function_call_arguments.done`.  */
    TypeEnum type
    /* The ID of the response. */
    String responseId
    /* The ID of the function call item. */
    String itemId
    /* The index of the output item in the response. */
    Integer outputIndex
    /* The ID of the function call. */
    String callId
    /* The final arguments as a JSON string. */
    String arguments
}
