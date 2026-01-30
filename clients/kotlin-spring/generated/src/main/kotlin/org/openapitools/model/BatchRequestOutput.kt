package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.BatchRequestOutputError
import org.openapitools.model.BatchRequestOutputResponse
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
 * The per-line object of the batch output and error files
 * @param id 
 * @param customId A developer-provided per-request id that will be used to match outputs to inputs.
 * @param response 
 * @param error 
 */
data class BatchRequestOutput(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "null", description = "A developer-provided per-request id that will be used to match outputs to inputs.")
    @get:JsonProperty("custom_id") val customId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("response") val response: BatchRequestOutputResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("error") val error: BatchRequestOutputError? = null
) {

}

