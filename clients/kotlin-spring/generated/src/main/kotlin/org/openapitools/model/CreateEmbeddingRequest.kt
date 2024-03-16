package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CreateEmbeddingRequestInput
import org.openapitools.model.CreateEmbeddingRequestModel
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
 * @param model 
 * @param input 
 * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
 */
data class CreateEmbeddingRequest(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("model", required = true) val model: CreateEmbeddingRequestModel,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("input", required = true) val input: CreateEmbeddingRequestInput,

    @Schema(example = "user-1234", description = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ")
    @get:JsonProperty("user") val user: kotlin.String? = null
) {

}

