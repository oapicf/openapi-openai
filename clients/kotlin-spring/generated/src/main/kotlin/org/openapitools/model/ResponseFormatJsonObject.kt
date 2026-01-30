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
 * 
 * @param type The type of response format being defined: `json_object`
 */
data class ResponseFormatJsonObject(

    @Schema(example = "null", required = true, description = "The type of response format being defined: `json_object`")
    @get:JsonProperty("type", required = true) val type: ResponseFormatJsonObject.Type
) {

    /**
    * The type of response format being defined: `json_object`
    * Values: json_object
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        json_object("json_object");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ResponseFormatJsonObject'")
            }
        }
    }

}

