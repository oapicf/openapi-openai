package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.MessageDeltaContentTextObjectTextAnnotationsInner
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
 * @param `value` The data that makes up the text.
 * @param annotations 
 */
data class MessageDeltaContentTextObjectText(

    @Schema(description = "The data that makes up the text.")
    @param:JsonProperty("value")
    @get:JsonProperty("value") val `value`: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("annotations")
    @get:JsonProperty("annotations") val annotations: kotlin.collections.List<MessageDeltaContentTextObjectTextAnnotationsInner>? = null
) {

}

