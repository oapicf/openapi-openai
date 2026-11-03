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
 * The conversation resource.
 * @param id The unique ID of the conversation.
 * @param `object` The object type, must be `realtime.conversation`.
 */
data class RealtimeServerEventConversationCreatedConversation(

    @Schema(description = "The unique ID of the conversation.")
    @param:JsonProperty("id")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(description = "The object type, must be `realtime.conversation`.")
    @param:JsonProperty("object")
    @get:JsonProperty("object") val `object`: kotlin.String? = null
) {

}

