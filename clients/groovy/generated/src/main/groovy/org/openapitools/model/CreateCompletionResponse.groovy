package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CompletionUsage;
import org.openapitools.model.CreateCompletionResponseChoicesInner;

@Canonical
class CreateCompletionResponse {
    /* A unique identifier for the completion. */
    String id
    /* The list of completion choices the model generated for the input prompt. */
    List<CreateCompletionResponseChoicesInner> choices = new ArrayList<>()
    /* The Unix timestamp (in seconds) of when the completion was created. */
    Integer created
    /* The model used for completion. */
    String model
    /* This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.  */
    String systemFingerprint

    enum ObjectEnum {
    
        TEXT_COMPLETION("text_completion")
    
        private final String value
    
        ObjectEnum(String value) {
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

    /* The object type, which is always \"text_completion\" */
    ObjectEnum _object
    
    CompletionUsage usage
}
