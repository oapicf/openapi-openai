package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
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
 * @param index The index of the tool call in the tool calls array.
 * @param type The type of tool call. This is always going to be `file_search` for this type of tool call.
 * @param fileSearch For now, this is always going to be an empty object.
 * @param id The ID of the tool call object.
 */
data class RunStepDeltaStepDetailsToolCallsFileSearchObject(

    @Schema(required = true, description = "The index of the tool call in the tool calls array.")
    @param:JsonProperty("index")
    @get:JsonProperty("index", required = true) val index: kotlin.Int,

    @Schema(required = true, description = "The type of tool call. This is always going to be `file_search` for this type of tool call.")
    @param:JsonProperty("type")
    @get:JsonProperty("type", required = true) val type: RunStepDeltaStepDetailsToolCallsFileSearchObject.Type,

    @field:Valid
    @Schema(required = true, description = "For now, this is always going to be an empty object.")
    @param:JsonProperty("file_search")
    @get:JsonProperty("file_search", required = true) val fileSearch: kotlin.Any,

    @Schema(description = "The ID of the tool call object.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("id")
    @get:JsonProperty("id") val id: kotlin.String? = null
) : RunStepDeltaStepDetailsToolCallsObjectToolCallsInner {

    /**
    * The type of tool call. This is always going to be `file_search` for this type of tool call.
    * Values: file_search
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        file_search("file_search");

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

