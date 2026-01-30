package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class UsageImagesResult {

    enum ObjectEnum {
    
        ORGANIZATION_USAGE_IMAGES_RESULT("organization.usage.images.result")
    
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
    /* The number of images processed. */
    Integer images
    /* The count of requests made to the model. */
    Integer numModelRequests
    /* When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`. */
    String source
    /* When `group_by=size`, this field provides the image size of the grouped usage result. */
    String size
    /* When `group_by=project_id`, this field provides the project ID of the grouped usage result. */
    String projectId
    /* When `group_by=user_id`, this field provides the user ID of the grouped usage result. */
    String userId
    /* When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result. */
    String apiKeyId
    /* When `group_by=model`, this field provides the model name of the grouped usage result. */
    String model
}
