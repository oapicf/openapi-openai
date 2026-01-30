package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CreateMessageRequestAttachmentsInnerToolsInner
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
 * @param fileId The ID of the file to attach to the message.
 * @param tools The tools to add this file to.
 */
data class CreateMessageRequestAttachmentsInner(

    @Schema(example = "null", description = "The ID of the file to attach to the message.")
    @get:JsonProperty("file_id") val fileId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "The tools to add this file to.")
    @get:JsonProperty("tools") val tools: kotlin.collections.List<CreateMessageRequestAttachmentsInnerToolsInner>? = null
) {

}

