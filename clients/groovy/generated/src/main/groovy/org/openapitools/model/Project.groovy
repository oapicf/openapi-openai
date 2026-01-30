package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class Project {
    /* The identifier, which can be referenced in API endpoints */
    String id

    enum ObjectEnum {
    
        ORGANIZATION_PROJECT("organization.project")
    
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

    /* The object type, which is always `organization.project` */
    ObjectEnum _object
    /* The name of the project. This appears in reporting. */
    String name
    /* The Unix timestamp (in seconds) of when the project was created. */
    Integer createdAt
    /* The Unix timestamp (in seconds) of when the project was archived or `null`. */
    Integer archivedAt

    enum StatusEnum {
    
        ACTIVE("active"),
        
        ARCHIVED("archived")
    
        private final String value
    
        StatusEnum(String value) {
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

    /* `active` or `archived` */
    StatusEnum status
}
