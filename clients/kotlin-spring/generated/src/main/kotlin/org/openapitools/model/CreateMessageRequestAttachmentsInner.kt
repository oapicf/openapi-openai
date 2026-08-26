package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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

    @Schema(description = "The ID of the file to attach to the message.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("file_id")
    @get:JsonProperty("file_id") val fileId: kotlin.String? = null,

    @field:Valid
    @Schema(description = "The tools to add this file to.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("tools")
    @get:JsonProperty("tools") val tools: kotlin.collections.List<CreateMessageRequestAttachmentsInnerToolsInner>? = null
) {

}

