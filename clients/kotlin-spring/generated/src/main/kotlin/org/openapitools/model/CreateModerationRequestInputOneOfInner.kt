package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CreateModerationRequestInputOneOfInnerOneOf
import org.openapitools.model.CreateModerationRequestInputOneOfInnerOneOf1
import org.openapitools.model.CreateModerationRequestInputOneOfInnerOneOfImageUrl
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
 * @param type Always `image_url`.
 * @param imageUrl 
 * @param text A string of text to classify.
 */
data class CreateModerationRequestInputOneOfInner(

    @Schema(example = "null", required = true, description = "Always `image_url`.")
    @get:JsonProperty("type", required = true) val type: CreateModerationRequestInputOneOfInner.Type,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("image_url", required = true) val imageUrl: CreateModerationRequestInputOneOfInnerOneOfImageUrl,

    @Schema(example = "I want to kill them", required = true, description = "A string of text to classify.")
    @get:JsonProperty("text", required = true) val text: kotlin.String
) {

    /**
    * Always `image_url`.
    * Values: image_url,text
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        image_url("image_url"),
        text("text");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CreateModerationRequestInputOneOfInner'")
            }
        }
    }

}

