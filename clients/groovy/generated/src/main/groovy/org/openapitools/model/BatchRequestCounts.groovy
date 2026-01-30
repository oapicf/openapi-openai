package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class BatchRequestCounts {
    /* Total number of requests in the batch. */
    Integer total
    /* Number of requests that have been completed successfully. */
    Integer completed
    /* Number of requests that have failed. */
    Integer failed
}
