package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
 * @param type The type of tool being defined: `code_interpreter`
 */
data class AssistantToolsCode(

    @Schema(required = true, description = "The type of tool being defined: `code_interpreter`")
    @param:JsonProperty("type")
    @get:JsonProperty("type", required = true) val type: AssistantToolsCode.Type
) : AssistantObjectToolsInner, CreateMessageRequestAttachmentsInnerToolsInner, CreateThreadAndRunRequestToolsInner {

    /**
    * The type of tool being defined: `code_interpreter`
    * Values: code_interpreter
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        code_interpreter("code_interpreter");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Type'")
            }
        }
    }

}

