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
 * An object describing the expected output of the model. If `json_object` only `function` type `tools` are allowed to be passed to the Run. If `text` the model can return text or any value needed. 
 * @param type Must be one of `text` or `json_object`.
 */
data class AssistantsApiResponseFormat(

    @Schema(example = "json_object", description = "Must be one of `text` or `json_object`.")
    @get:JsonProperty("type") val type: AssistantsApiResponseFormat.Type? = Type.text
) {

    /**
    * Must be one of `text` or `json_object`.
    * Values: text,json_object
    */
    enum class Type(val value: kotlin.String) {

        @JsonProperty("text") text("text"),
        @JsonProperty("json_object") json_object("json_object")
    }

}

