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
 * The refusal content that is part of a message.
 * @param index The index of the refusal part in the message.
 * @param type Always `refusal`.
 * @param refusal 
 */
data class MessageDeltaContentRefusalObject(

    @Schema(example = "null", required = true, description = "The index of the refusal part in the message.")
    @get:JsonProperty("index", required = true) val index: kotlin.Int,

    @Schema(example = "null", required = true, description = "Always `refusal`.")
    @get:JsonProperty("type", required = true) val type: MessageDeltaContentRefusalObject.Type,

    @Schema(example = "null", description = "")
    @get:JsonProperty("refusal") val refusal: kotlin.String? = null
) {

    /**
    * Always `refusal`.
    * Values: refusal
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        refusal("refusal");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'MessageDeltaContentRefusalObject'")
            }
        }
    }

}

