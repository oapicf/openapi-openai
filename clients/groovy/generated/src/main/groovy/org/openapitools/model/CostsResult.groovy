package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CostsResultAmount;

@Canonical
class CostsResult {

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
    
    CostsResultAmount amount
    /* When `group_by=line_item`, this field provides the line item of the grouped costs result. */
    String lineItem
    /* When `group_by=project_id`, this field provides the project ID of the grouped costs result. */
    String projectId
}
