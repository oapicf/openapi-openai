package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class BatchRequestOutputResponse {
    /* The HTTP status code of the response */
    Integer statusCode
    /* An unique identifier for the OpenAI API request. Please include this request ID when contacting support. */
    String requestId
    /* The JSON body of the response */
    Object body
}
