package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.MessageDeltaObjectDelta
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
 * Represents a message delta i.e. any changed fields on a message during streaming. 
 * @param id The identifier of the message, which can be referenced in API endpoints.
 * @param &#x60;object&#x60; The object type, which is always `thread.message.delta`.
 * @param delta 
 */
data class MessageDeltaObject(

    @Schema(example = "null", required = true, description = "The identifier of the message, which can be referenced in API endpoints.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "The object type, which is always `thread.message.delta`.")
    @get:JsonProperty("object", required = true) val `object`: MessageDeltaObject.`Object`,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("delta", required = true) val delta: MessageDeltaObjectDelta
) {

    /**
    * The object type, which is always `thread.message.delta`.
    * Values: threadPeriodMessagePeriodDelta
    */
    enum class `Object`(val value: kotlin.String) {

        @JsonProperty("thread.message.delta") threadPeriodMessagePeriodDelta("thread.message.delta")
    }

}

