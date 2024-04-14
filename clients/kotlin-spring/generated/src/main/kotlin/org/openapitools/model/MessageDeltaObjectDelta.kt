package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.MessageDeltaObjectDeltaContentInner
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
 * The delta containing the fields that have changed on the Message.
 * @param role The entity that produced the message. One of `user` or `assistant`.
 * @param content The content of the message in array of text and/or images.
 * @param fileIds A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
 */
data class MessageDeltaObjectDelta(

    @Schema(example = "null", description = "The entity that produced the message. One of `user` or `assistant`.")
    @get:JsonProperty("role") val role: MessageDeltaObjectDelta.Role? = null,

    @field:Valid
    @Schema(example = "null", description = "The content of the message in array of text and/or images.")
    @get:JsonProperty("content") val content: kotlin.collections.List<MessageDeltaObjectDeltaContentInner>? = null,

    @get:Size(max=10)
    @Schema(example = "null", description = "A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.")
    @get:JsonProperty("file_ids") val fileIds: kotlin.collections.List<kotlin.String>? = arrayListOf()
) {

    /**
    * The entity that produced the message. One of `user` or `assistant`.
    * Values: user,assistant
    */
    enum class Role(val value: kotlin.String) {

        @JsonProperty("user") user("user"),
        @JsonProperty("assistant") assistant("assistant")
    }

}

