package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.MessageDeltaContentTextAnnotationsFilePathObjectFilePath
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
 * A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.
 * @param index The index of the annotation in the text content part.
 * @param type Always `file_path`.
 * @param text The text in the message content that needs to be replaced.
 * @param filePath 
 * @param startIndex 
 * @param endIndex 
 */
data class MessageDeltaContentTextAnnotationsFilePathObject(

    @Schema(required = true, description = "The index of the annotation in the text content part.")
    @param:JsonProperty("index")
    @get:JsonProperty("index", required = true) val index: kotlin.Int,

    @Schema(required = true, description = "Always `file_path`.")
    @param:JsonProperty("type")
    @get:JsonProperty("type", required = true) val type: MessageDeltaContentTextAnnotationsFilePathObject.Type,

    @Schema(description = "The text in the message content that needs to be replaced.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("text")
    @get:JsonProperty("text") val text: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("file_path")
    @get:JsonProperty("file_path") val filePath: MessageDeltaContentTextAnnotationsFilePathObjectFilePath? = null,

    @get:Min(value=0)
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("start_index")
    @get:JsonProperty("start_index") val startIndex: kotlin.Int? = null,

    @get:Min(value=0)
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("end_index")
    @get:JsonProperty("end_index") val endIndex: kotlin.Int? = null
) : MessageDeltaContentTextObjectTextAnnotationsInner {

    /**
    * Always `file_path`.
    * Values: file_path
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        file_path("file_path");

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

