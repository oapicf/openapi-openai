package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RunStepDetailsToolCallsFileSearchObjectFileSearch
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
 * @param id The ID of the tool call object.
 * @param type The type of tool call. This is always going to be `file_search` for this type of tool call.
 * @param fileSearch 
 */
data class RunStepDetailsToolCallsFileSearchObject(

    @Schema(example = "null", required = true, description = "The ID of the tool call object.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "The type of tool call. This is always going to be `file_search` for this type of tool call.")
    @get:JsonProperty("type", required = true) val type: RunStepDetailsToolCallsFileSearchObject.Type,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("file_search", required = true) val fileSearch: RunStepDetailsToolCallsFileSearchObjectFileSearch
) {

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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RunStepDetailsToolCallsFileSearchObject'")
            }
        }
    }

}

