package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.PredictionContentContent
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
 * Static predicted output content, such as the content of a text file that is being regenerated. 
 * @param type The type of the predicted content you want to provide. This type is currently always `content`. 
 * @param content 
 */
data class PredictionContent(

    @Schema(example = "null", required = true, description = "The type of the predicted content you want to provide. This type is currently always `content`. ")
    @get:JsonProperty("type", required = true) val type: PredictionContent.Type,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("content", required = true) val content: PredictionContentContent
) {

    /**
    * The type of the predicted content you want to provide. This type is currently always `content`. 
    * Values: content
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        content("content");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'PredictionContent'")
            }
        }
    }

}

