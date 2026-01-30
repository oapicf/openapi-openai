package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class RealtimeConversationItemContentInner {

    enum TypeEnum {
    
        INPUT_AUDIO("input_audio"),
        
        INPUT_TEXT("input_text"),
        
        ITEM_REFERENCE("item_reference"),
        
        TEXT("text")
    
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

    /* The content type (`input_text`, `input_audio`, `item_reference`, `text`).  */
    TypeEnum type
    /* The text content, used for `input_text` and `text` content types.  */
    String text
    /* ID of a previous conversation item to reference (for `item_reference` content types in `response.create` events). These can reference both client and server created items.  */
    String id
    /* Base64-encoded audio bytes, used for `input_audio` content type.  */
    String audio
    /* The transcript of the audio, used for `input_audio` content type.  */
    String transcript
}
