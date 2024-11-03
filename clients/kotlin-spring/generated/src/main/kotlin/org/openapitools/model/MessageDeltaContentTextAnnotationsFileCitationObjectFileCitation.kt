package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * @param fileId The ID of the specific File the citation is from.
 * @param quote The specific quote in the file.
 */
data class MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation(

    @Schema(example = "null", description = "The ID of the specific File the citation is from.")
    @get:JsonProperty("file_id") val fileId: kotlin.String? = null,

    @Schema(example = "null", description = "The specific quote in the file.")
    @get:JsonProperty("quote") val quote: kotlin.String? = null
    ) {

}

