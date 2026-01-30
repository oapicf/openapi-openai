package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class UsageCodeInterpreterSessionsResult {

    enum ObjectEnum {
    
        ORGANIZATION_USAGE_CODE_INTERPRETER_SESSIONS_RESULT("organization.usage.code_interpreter_sessions.result")
    
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
    /* The number of code interpreter sessions. */
    Integer sessions
    /* When `group_by=project_id`, this field provides the project ID of the grouped usage result. */
    String projectId
}
