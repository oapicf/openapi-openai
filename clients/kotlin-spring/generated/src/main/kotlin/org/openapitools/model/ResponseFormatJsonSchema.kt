package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ResponseFormatJsonSchemaJsonSchema
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
 * @param type The type of response format being defined: `json_schema`
 * @param jsonSchema 
 */
data class ResponseFormatJsonSchema(

    @Schema(example = "null", required = true, description = "The type of response format being defined: `json_schema`")
    @get:JsonProperty("type", required = true) val type: ResponseFormatJsonSchema.Type,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("json_schema", required = true) val jsonSchema: ResponseFormatJsonSchemaJsonSchema
) {

    /**
    * The type of response format being defined: `json_schema`
    * Values: json_schema
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        json_schema("json_schema");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ResponseFormatJsonSchema'")
            }
        }
    }

}

