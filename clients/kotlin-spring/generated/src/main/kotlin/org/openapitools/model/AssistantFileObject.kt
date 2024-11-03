package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * A list of [Files](/docs/api-reference/files) attached to an `assistant`.
 * @param id The identifier, which can be referenced in API endpoints.
 * @param &#x60;object&#x60; The object type, which is always `assistant.file`.
 * @param createdAt The Unix timestamp (in seconds) for when the assistant file was created.
 * @param assistantId The assistant ID that the file is attached to.
 */
data class AssistantFileObject(

    @Schema(example = "null", required = true, description = "The identifier, which can be referenced in API endpoints.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "The object type, which is always `assistant.file`.")
    @get:JsonProperty("object", required = true) val `object`: AssistantFileObject.`Object`,

    @Schema(example = "null", required = true, description = "The Unix timestamp (in seconds) for when the assistant file was created.")
    @get:JsonProperty("created_at", required = true) val createdAt: kotlin.Int,

    @Schema(example = "null", required = true, description = "The assistant ID that the file is attached to.")
    @get:JsonProperty("assistant_id", required = true) val assistantId: kotlin.String
    ) {

    /**
    * The object type, which is always `assistant.file`.
    * Values: assistantPeriodFile
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        assistantPeriodFile("assistant.file");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Object` {
                return values().first{it -> it.value == value}
            }
        }
    }

}

