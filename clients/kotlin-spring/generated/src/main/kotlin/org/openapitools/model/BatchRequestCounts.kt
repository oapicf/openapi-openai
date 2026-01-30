package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * The request counts for different statuses within the batch.
 * @param total Total number of requests in the batch.
 * @param completed Number of requests that have been completed successfully.
 * @param failed Number of requests that have failed.
 */
data class BatchRequestCounts(

    @Schema(example = "null", required = true, description = "Total number of requests in the batch.")
    @get:JsonProperty("total", required = true) val total: kotlin.Int,

    @Schema(example = "null", required = true, description = "Number of requests that have been completed successfully.")
    @get:JsonProperty("completed", required = true) val completed: kotlin.Int,

    @Schema(example = "null", required = true, description = "Number of requests that have failed.")
    @get:JsonProperty("failed", required = true) val failed: kotlin.Int
) {

}

