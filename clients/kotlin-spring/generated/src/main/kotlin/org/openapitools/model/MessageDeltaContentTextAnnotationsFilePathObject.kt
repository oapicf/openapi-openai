package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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

    @Schema(example = "null", required = true, description = "The index of the annotation in the text content part.")
    @get:JsonProperty("index", required = true) val index: kotlin.Int,

    @Schema(example = "null", required = true, description = "Always `file_path`.")
    @get:JsonProperty("type", required = true) val type: MessageDeltaContentTextAnnotationsFilePathObject.Type,

    @Schema(example = "null", description = "The text in the message content that needs to be replaced.")
    @get:JsonProperty("text") val text: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("file_path") val filePath: MessageDeltaContentTextAnnotationsFilePathObjectFilePath? = null,

    @get:Min(0)
    @Schema(example = "null", description = "")
    @get:JsonProperty("start_index") val startIndex: kotlin.Int? = null,

    @get:Min(0)
    @Schema(example = "null", description = "")
    @get:JsonProperty("end_index") val endIndex: kotlin.Int? = null
) {

    /**
    * Always `file_path`.
    * Values: file_path
    */
    enum class Type(val value: kotlin.String) {

        @JsonProperty("file_path") file_path("file_path")
    }

}

