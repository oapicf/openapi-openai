package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.MessageContentTextAnnotationsFileCitationObjectFileCitation
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
 * @param type Always `file_citation`.
 * @param text The text in the message content that needs to be replaced.
 * @param fileCitation 
 * @param startIndex 
 * @param endIndex 
 */
data class MessageContentTextAnnotationsFileCitationObject(

    @Schema(example = "null", required = true, description = "Always `file_citation`.")
    @get:JsonProperty("type", required = true) val type: MessageContentTextAnnotationsFileCitationObject.Type,

    @Schema(example = "null", required = true, description = "The text in the message content that needs to be replaced.")
    @get:JsonProperty("text", required = true) val text: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("file_citation", required = true) val fileCitation: MessageContentTextAnnotationsFileCitationObjectFileCitation,

    @get:Min(0)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("start_index", required = true) val startIndex: kotlin.Int,

    @get:Min(0)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("end_index", required = true) val endIndex: kotlin.Int
) {

    /**
    * Always `file_citation`.
    * Values: file_citation
    */
    enum class Type(val value: kotlin.String) {

        @JsonProperty("file_citation") file_citation("file_citation")
    }

}

