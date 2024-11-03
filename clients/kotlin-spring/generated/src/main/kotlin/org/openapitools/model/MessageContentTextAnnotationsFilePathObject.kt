package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.MessageContentTextAnnotationsFilePathObjectFilePath
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
 * @param type Always `file_path`.
 * @param text The text in the message content that needs to be replaced.
 * @param filePath 
 * @param startIndex 
 * @param endIndex 
 */
data class MessageContentTextAnnotationsFilePathObject(

    @Schema(example = "null", required = true, description = "Always `file_path`.")
    @get:JsonProperty("type", required = true) val type: MessageContentTextAnnotationsFilePathObject.Type,

    @Schema(example = "null", required = true, description = "The text in the message content that needs to be replaced.")
    @get:JsonProperty("text", required = true) val text: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("file_path", required = true) val filePath: MessageContentTextAnnotationsFilePathObjectFilePath,

    @get:Min(0)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("start_index", required = true) val startIndex: kotlin.Int,

    @get:Min(0)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("end_index", required = true) val endIndex: kotlin.Int
    ) {

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
                return values().first{it -> it.value == value}
            }
        }
    }

}

