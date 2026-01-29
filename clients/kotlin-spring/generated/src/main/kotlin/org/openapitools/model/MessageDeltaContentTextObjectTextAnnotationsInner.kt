package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.MessageDeltaContentTextAnnotationsFileCitationObject
import org.openapitools.model.MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation
import org.openapitools.model.MessageDeltaContentTextAnnotationsFilePathObject
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
 * 
 * @param index The index of the annotation in the text content part.
 * @param type Always `file_citation`.
 * @param text The text in the message content that needs to be replaced.
 * @param fileCitation 
 * @param startIndex 
 * @param endIndex 
 * @param filePath 
 */
data class MessageDeltaContentTextObjectTextAnnotationsInner(

    @Schema(example = "null", required = true, description = "The index of the annotation in the text content part.")
    @get:JsonProperty("index", required = true) val index: kotlin.Int,

    @Schema(example = "null", required = true, description = "Always `file_citation`.")
    @get:JsonProperty("type", required = true) val type: MessageDeltaContentTextObjectTextAnnotationsInner.Type,

    @Schema(example = "null", description = "The text in the message content that needs to be replaced.")
    @get:JsonProperty("text") val text: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("file_citation") val fileCitation: MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation? = null,

    @get:Min(value=0)
    @Schema(example = "null", description = "")
    @get:JsonProperty("start_index") val startIndex: kotlin.Int? = null,

    @get:Min(value=0)
    @Schema(example = "null", description = "")
    @get:JsonProperty("end_index") val endIndex: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("file_path") val filePath: MessageDeltaContentTextAnnotationsFilePathObjectFilePath? = null
) {

    /**
    * Always `file_citation`.
    * Values: file_citation,file_path
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        file_citation("file_citation"),
        file_path("file_path");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'MessageDeltaContentTextObjectTextAnnotationsInner'")
            }
        }
    }

}

