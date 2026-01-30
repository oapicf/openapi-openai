package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ProjectApiKeyOwner;

@Canonical
class ProjectApiKey {

    enum ObjectEnum {
    
        ORGANIZATION_PROJECT_API_KEY("organization.project.api_key")
    
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

    /* The object type, which is always `organization.project.api_key` */
    ObjectEnum _object
    /* The redacted value of the API key */
    String redactedValue
    /* The name of the API key */
    String name
    /* The Unix timestamp (in seconds) of when the API key was created */
    Integer createdAt
    /* The identifier, which can be referenced in API endpoints */
    String id
    
    ProjectApiKeyOwner owner
}
