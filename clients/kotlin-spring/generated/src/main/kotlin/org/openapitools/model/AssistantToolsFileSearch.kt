package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AssistantToolsFileSearchFileSearch
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
 * @param type The type of tool being defined: `file_search`
 * @param fileSearch 
 */
data class AssistantToolsFileSearch(

    @Schema(example = "null", required = true, description = "The type of tool being defined: `file_search`")
    @get:JsonProperty("type", required = true) val type: AssistantToolsFileSearch.Type,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("file_search") val fileSearch: AssistantToolsFileSearchFileSearch? = null
) {

    /**
    * The type of tool being defined: `file_search`
    * Values: file_search
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        file_search("file_search");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AssistantToolsFileSearch'")
            }
        }
    }

}

