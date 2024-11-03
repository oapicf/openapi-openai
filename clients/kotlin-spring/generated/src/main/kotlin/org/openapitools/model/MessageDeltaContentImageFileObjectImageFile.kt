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
 * @param fileId The [File](/docs/api-reference/files) ID of the image in the message content.
 */
data class MessageDeltaContentImageFileObjectImageFile(

    @Schema(example = "null", description = "The [File](/docs/api-reference/files) ID of the image in the message content.")
    @get:JsonProperty("file_id") val fileId: kotlin.String? = null
    ) {

}

