package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("id")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(description = "A developer-provided per-request id that will be used to match outputs to inputs.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("custom_id")
    @get:JsonProperty("custom_id") val customId: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("response")
    @get:JsonProperty("response") val response: BatchRequestOutputResponse? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("error")
    @get:JsonProperty("error") val error: BatchRequestOutputError? = null
) {

}

