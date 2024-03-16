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
 * @param id 
 * @param &#x60;object&#x60; 
 * @param bytes 
 * @param createdAt 
 * @param filename 
 * @param purpose 
 * @param status 
 * @param statusDetails 
 */
data class OpenAIFile(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("object", required = true) val `object`: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("bytes", required = true) val bytes: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("created_at", required = true) val createdAt: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("filename", required = true) val filename: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("purpose", required = true) val purpose: kotlin.String,

    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("status_details") val statusDetails: kotlin.Any? = null
) {

}

