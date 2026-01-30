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
 * 
 * @param inProgress The number of files that are currently being processed.
 * @param completed The number of files that have been processed.
 * @param failed The number of files that have failed to process.
 * @param cancelled The number of files that where cancelled.
 * @param total The total number of files.
 */
data class VectorStoreFileBatchObjectFileCounts(

    @Schema(example = "null", required = true, description = "The number of files that are currently being processed.")
    @get:JsonProperty("in_progress", required = true) val inProgress: kotlin.Int,

    @Schema(example = "null", required = true, description = "The number of files that have been processed.")
    @get:JsonProperty("completed", required = true) val completed: kotlin.Int,

    @Schema(example = "null", required = true, description = "The number of files that have failed to process.")
    @get:JsonProperty("failed", required = true) val failed: kotlin.Int,

    @Schema(example = "null", required = true, description = "The number of files that where cancelled.")
    @get:JsonProperty("cancelled", required = true) val cancelled: kotlin.Int,

    @Schema(example = "null", required = true, description = "The total number of files.")
    @get:JsonProperty("total", required = true) val total: kotlin.Int
) {

}

