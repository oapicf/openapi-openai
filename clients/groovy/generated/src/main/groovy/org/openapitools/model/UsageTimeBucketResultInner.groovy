package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CostsResult;
import org.openapitools.model.CostsResultAmount;
import org.openapitools.model.UsageAudioSpeechesResult;
import org.openapitools.model.UsageAudioTranscriptionsResult;
import org.openapitools.model.UsageCodeInterpreterSessionsResult;
import org.openapitools.model.UsageCompletionsResult;
import org.openapitools.model.UsageEmbeddingsResult;
import org.openapitools.model.UsageImagesResult;
import org.openapitools.model.UsageModerationsResult;
import org.openapitools.model.UsageVectorStoresResult;

@Canonical
class UsageTimeBucketResultInner {

    enum ObjectEnum {
    
        ORGANIZATION_COSTS_RESULT("organization.costs.result")
    
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
    /* The aggregated number of input tokens used. */
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
    /* When `group_by=project_id`, this field provides the project ID of the grouped costs result. */
    String projectId
    /* When `group_by=user_id`, this field provides the user ID of the grouped usage result. */
    String userId
    /* When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result. */
    String apiKeyId
    /* When `group_by=model`, this field provides the model name of the grouped usage result. */
    String model
    /* When `group_by=batch`, this field tells whether the grouped usage result is batch or not. */
    Boolean batch
    /* The number of images processed. */
    Integer images
    /* When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`. */
    String source
    /* When `group_by=size`, this field provides the image size of the grouped usage result. */
    String size
    /* The number of characters processed. */
    Integer characters
    /* The number of seconds processed. */
    Integer seconds
    /* The vector stores usage in bytes. */
    Integer usageBytes
    /* The number of code interpreter sessions. */
    Integer sessions
    
    CostsResultAmount amount
    /* When `group_by=line_item`, this field provides the line item of the grouped costs result. */
    String lineItem
}
