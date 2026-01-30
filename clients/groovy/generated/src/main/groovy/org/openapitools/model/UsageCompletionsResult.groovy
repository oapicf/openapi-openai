package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class UsageCompletionsResult {

    enum ObjectEnum {
    
        ORGANIZATION_USAGE_COMPLETIONS_RESULT("organization.usage.completions.result")
    
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

    
    ObjectEnum _object
    /* The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens. */
    Integer inputTokens
    /* The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens. */
    Integer inputCachedTokens
    /* The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens. */
    Integer outputTokens
    /* The aggregated number of audio input tokens used, including cached tokens. */
    Integer inputAudioTokens
    /* The aggregated number of audio output tokens used. */
    Integer outputAudioTokens
    /* The count of requests made to the model. */
    Integer numModelRequests
    /* When `group_by=project_id`, this field provides the project ID of the grouped usage result. */
    String projectId
    /* When `group_by=user_id`, this field provides the user ID of the grouped usage result. */
    String userId
    /* When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result. */
    String apiKeyId
    /* When `group_by=model`, this field provides the model name of the grouped usage result. */
    String model
    /* When `group_by=batch`, this field tells whether the grouped usage result is batch or not. */
    Boolean batch
}
