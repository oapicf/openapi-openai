package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ProjectApiKeyDeleteResponse {

    enum ObjectEnum {
    
        ORGANIZATION_PROJECT_API_KEY_DELETED("organization.project.api_key.deleted")
    
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
    
    String id
    
    Boolean deleted
}
