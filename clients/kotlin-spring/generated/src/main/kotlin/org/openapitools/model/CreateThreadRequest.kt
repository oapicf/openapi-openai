package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.CreateMessageRequest
import org.openapitools.model.CreateThreadRequestToolResources
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
 * @param messages A list of [messages](/docs/api-reference/messages) to start the thread with.
 * @param toolResources 
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
 */
data class CreateThreadRequest(

    @field:Valid
    @Schema(description = "A list of [messages](/docs/api-reference/messages) to start the thread with.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("messages")
    @get:JsonProperty("messages") val messages: kotlin.collections.List<CreateMessageRequest>? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("tool_resources")
    @get:JsonProperty("tool_resources") val toolResources: CreateThreadRequestToolResources? = null,

    @field:Valid
    @Schema(description = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")
    @param:JsonProperty("metadata")
    @get:JsonProperty("metadata") val metadata: kotlin.Any? = null
) {

}

