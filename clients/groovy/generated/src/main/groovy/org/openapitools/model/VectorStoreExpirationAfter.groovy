package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class VectorStoreExpirationAfter {

    enum AnchorEnum {
    
        LAST_ACTIVE_AT("last_active_at")
    
        private final String value
    
        AnchorEnum(String value) {
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

    /* Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`. */
    AnchorEnum anchor
    /* The number of days after the anchor time that the vector store will expire. */
    Integer days
}
