package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BatchRequestOutputError;
import org.openapitools.model.BatchRequestOutputResponse;

@Canonical
class BatchRequestOutput {
    
    String id
    /* A developer-provided per-request id that will be used to match outputs to inputs. */
    String customId
    
    BatchRequestOutputResponse response
    
    BatchRequestOutputError error
}
