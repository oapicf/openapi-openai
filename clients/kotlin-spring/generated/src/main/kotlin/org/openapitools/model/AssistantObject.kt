package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AssistantObjectToolsInner
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
 * Represents an `assistant` that can call the model and use tools.
 * @param id The identifier, which can be referenced in API endpoints.
 * @param &#x60;object&#x60; The object type, which is always `assistant`.
 * @param createdAt The Unix timestamp (in seconds) for when the assistant was created.
 * @param name The name of the assistant. The maximum length is 256 characters. 
 * @param description The description of the assistant. The maximum length is 512 characters. 
 * @param model ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
 * @param instructions The system instructions that the assistant uses. The maximum length is 256,000 characters. 
 * @param tools A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. 
 * @param fileIds A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. 
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
 */
data class AssistantObject(

    @Schema(example = "null", required = true, description = "The identifier, which can be referenced in API endpoints.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "The object type, which is always `assistant`.")
    @get:JsonProperty("object", required = true) val `object`: AssistantObject.`Object`,

    @Schema(example = "null", required = true, description = "The Unix timestamp (in seconds) for when the assistant was created.")
    @get:JsonProperty("created_at", required = true) val createdAt: kotlin.Int,

    @get:Size(max=256)
    @Schema(example = "null", required = true, description = "The name of the assistant. The maximum length is 256 characters. ")
    @get:JsonProperty("name", required = true) val name: kotlin.String?,

    @get:Size(max=512)
    @Schema(example = "null", required = true, description = "The description of the assistant. The maximum length is 512 characters. ")
    @get:JsonProperty("description", required = true) val description: kotlin.String?,

    @Schema(example = "null", required = true, description = "ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. ")
    @get:JsonProperty("model", required = true) val model: kotlin.String,

    @get:Size(max=256000)
    @Schema(example = "null", required = true, description = "The system instructions that the assistant uses. The maximum length is 256,000 characters. ")
    @get:JsonProperty("instructions", required = true) val instructions: kotlin.String?,

    @field:Valid
    @get:Size(max=128)
    @Schema(example = "null", required = true, description = "A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. ")
    @get:JsonProperty("tools", required = true) val tools: kotlin.collections.List<AssistantObjectToolsInner> = arrayListOf(),

    @get:Size(max=20)
    @Schema(example = "null", required = true, description = "A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. ")
    @get:JsonProperty("file_ids", required = true) val fileIds: kotlin.collections.List<kotlin.String> = arrayListOf(),

    @field:Valid
    @Schema(example = "null", required = true, description = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. ")
    @get:JsonProperty("metadata", required = true) val metadata: kotlin.Any?
    ) {

    /**
    * The object type, which is always `assistant`.
    * Values: assistant
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        assistant("assistant");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Object` {
                return values().first{it -> it.value == value}
            }
        }
    }

}

