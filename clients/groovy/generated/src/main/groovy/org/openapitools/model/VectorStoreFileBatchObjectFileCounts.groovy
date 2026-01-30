package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class VectorStoreFileBatchObjectFileCounts {
    /* The number of files that are currently being processed. */
    Integer inProgress
    /* The number of files that have been processed. */
    Integer completed
    /* The number of files that have failed to process. */
    Integer failed
    /* The number of files that where cancelled. */
    Integer cancelled
    /* The total number of files. */
    Integer total
}
