package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation
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
 * A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"retrieval\" tool to search files.
 * @param index The index of the annotation in the text content part.
 * @param type Always `file_citation`.
 * @param text The text in the message content that needs to be replaced.
 * @param fileCitation 
 * @param startIndex 
 * @param endIndex 
 */
data class MessageDeltaContentTextAnnotationsFileCitationObject(

    @Schema(example = "null", required = true, description = "The index of the annotation in the text content part.")
    @get:JsonProperty("index", required = true) val index: kotlin.Int,

    @Schema(example = "null", required = true, description = "Always `file_citation`.")
    @get:JsonProperty("type", required = true) val type: MessageDeltaContentTextAnnotationsFileCitationObject.Type,

    @Schema(example = "null", description = "The text in the message content that needs to be replaced.")
    @get:JsonProperty("text") val text: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("file_citation") val fileCitation: MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation? = null,

    @get:Min(0)
    @Schema(example = "null", description = "")
    @get:JsonProperty("start_index") val startIndex: kotlin.Int? = null,

    @get:Min(0)
    @Schema(example = "null", description = "")
    @get:JsonProperty("end_index") val endIndex: kotlin.Int? = null
    ) {

    /**
    * Always `file_citation`.
    * Values: file_citation
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        file_citation("file_citation");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().first{it -> it.value == value}
            }
        }
    }

}

