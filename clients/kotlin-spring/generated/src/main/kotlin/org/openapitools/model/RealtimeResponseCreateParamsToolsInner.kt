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
 * @param type The type of the tool, i.e. `function`.
 * @param name The name of the function.
 * @param description The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything). 
 * @param parameters Parameters of the function in JSON Schema.
 */
data class RealtimeResponseCreateParamsToolsInner(

    @Schema(description = "The type of the tool, i.e. `function`.")
    @param:JsonProperty("type")
    @get:JsonProperty("type") val type: RealtimeResponseCreateParamsToolsInner.Type? = null,

    @Schema(description = "The name of the function.")
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(description = "The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything). ")
    @param:JsonProperty("description")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @field:Valid
    @Schema(description = "Parameters of the function in JSON Schema.")
    @param:JsonProperty("parameters")
    @get:JsonProperty("parameters") val parameters: kotlin.Any? = null
) {

    /**
    * The type of the tool, i.e. `function`.
    * Values: function
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        function("function");
    
        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{ it.value == value }
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Type'")
            }
        }
    }

}

