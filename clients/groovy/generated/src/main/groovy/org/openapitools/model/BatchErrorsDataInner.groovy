package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class BatchErrorsDataInner {
    /* An error code identifying the error type. */
    String code
    /* A human-readable message providing more details about the error. */
    String message
    /* The name of the parameter that caused the error, if applicable. */
    String param
    /* The line number of the input file where the error occurred, if applicable. */
    Integer line
}
