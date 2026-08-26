package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ModifyThreadRequestToolResources
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
 * Represents a thread that contains [messages](/docs/api-reference/messages).
 * @param id The identifier, which can be referenced in API endpoints.
 * @param &#x60;object&#x60; The object type, which is always `thread`.
 * @param createdAt The Unix timestamp (in seconds) for when the thread was created.
 * @param toolResources 
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
 */
data class ThreadObject(

    @Schema(required = true, description = "The identifier, which can be referenced in API endpoints.")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(required = true, description = "The object type, which is always `thread`.")
    @param:JsonProperty("object")
    @get:JsonProperty("object", required = true) val `object`: ThreadObject.`Object`,

    @Schema(required = true, description = "The Unix timestamp (in seconds) for when the thread was created.")
    @param:JsonProperty("created_at")
    @get:JsonProperty("created_at", required = true) val createdAt: kotlin.Int,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("tool_resources")
    @get:JsonProperty("tool_resources", required = true) val toolResources: ModifyThreadRequestToolResources?,

    @field:Valid
    @Schema(required = true, description = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")
    @param:JsonProperty("metadata")
    @get:JsonProperty("metadata", required = true) val metadata: kotlin.Any?
) {

    /**
    * The object type, which is always `thread`.
    * Values: thread
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        thread("thread");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Object` {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum '&#x60;Object&#x60;'")
            }
        }
    }

}

