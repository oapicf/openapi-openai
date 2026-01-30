package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.RunStepDetailsToolCallsFileSearchResultObjectContentInner
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
 * A result instance of the file search.
 * @param fileId The ID of the file that result was found in.
 * @param fileName The name of the file that result was found in.
 * @param score The score of the result. All values must be a floating point number between 0 and 1.
 * @param content The content of the result that was found. The content is only included if requested via the include query parameter.
 */
data class RunStepDetailsToolCallsFileSearchResultObject(

    @Schema(example = "null", required = true, description = "The ID of the file that result was found in.")
    @get:JsonProperty("file_id", required = true) val fileId: kotlin.String,

    @Schema(example = "null", required = true, description = "The name of the file that result was found in.")
    @get:JsonProperty("file_name", required = true) val fileName: kotlin.String,

    @get:DecimalMin(value="0")
    @get:DecimalMax(value="1")
    @Schema(example = "null", required = true, description = "The score of the result. All values must be a floating point number between 0 and 1.")
    @get:JsonProperty("score", required = true) val score: java.math.BigDecimal,

    @field:Valid
    @Schema(example = "null", description = "The content of the result that was found. The content is only included if requested via the include query parameter.")
    @get:JsonProperty("content") val content: kotlin.collections.List<RunStepDetailsToolCallsFileSearchResultObjectContentInner>? = null
) {

}

