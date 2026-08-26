package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
 * @param statusCode The HTTP status code of the response
 * @param requestId An unique identifier for the OpenAI API request. Please include this request ID when contacting support.
 * @param body The JSON body of the response
 */
data class BatchRequestOutputResponse(

    @Schema(description = "The HTTP status code of the response")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("status_code")
    @get:JsonProperty("status_code") val statusCode: kotlin.Int? = null,

    @Schema(description = "An unique identifier for the OpenAI API request. Please include this request ID when contacting support.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("request_id")
    @get:JsonProperty("request_id") val requestId: kotlin.String? = null,

    @field:Valid
    @Schema(description = "The JSON body of the response")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("body")
    @get:JsonProperty("body") val body: kotlin.Any? = null
) {

}

