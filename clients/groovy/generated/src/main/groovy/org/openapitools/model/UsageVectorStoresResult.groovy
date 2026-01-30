package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class UsageVectorStoresResult {

    enum ObjectEnum {
    
        ORGANIZATION_USAGE_VECTOR_STORES_RESULT("organization.usage.vector_stores.result")
    
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
    /* The vector stores usage in bytes. */
    Integer usageBytes
    /* When `group_by=project_id`, this field provides the project ID of the grouped usage result. */
    String projectId
}
