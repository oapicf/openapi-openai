package org.openapitools.model

import java.util.Objects
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
 * @param type The type of tool being defined: `retrieval`
 */
data class AssistantToolsRetrieval(

    @Schema(example = "null", required = true, description = "The type of tool being defined: `retrieval`")
    @get:JsonProperty("type", required = true) val type: AssistantToolsRetrieval.Type
) {

    /**
    * The type of tool being defined: `retrieval`
    * Values: retrieval
    */
    enum class Type(val value: kotlin.String) {

        @JsonProperty("retrieval") retrieval("retrieval")
    }

}

