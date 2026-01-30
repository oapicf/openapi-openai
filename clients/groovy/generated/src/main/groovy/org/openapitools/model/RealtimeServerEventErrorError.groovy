package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class RealtimeServerEventErrorError {
    /* The type of error (e.g., \"invalid_request_error\", \"server_error\").  */
    String type
    /* Error code, if any. */
    String code
    /* A human-readable error message. */
    String message
    /* Parameter related to the error, if any. */
    String param
    /* The event_id of the client event that caused the error, if applicable.  */
    String eventId
}
