package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ThreadObject
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
 * Occurs when a new [thread](/docs/api-reference/threads/object) is created.
 * @param event 
 * @param &#x60;data&#x60; 
 */
data class ThreadStreamEventOneOf(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("event", required = true) val event: ThreadStreamEventOneOf.Event,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("data", required = true) val `data`: ThreadObject
) {

    /**
    * 
    * Values: threadPeriodCreated
    */
    enum class Event(val value: kotlin.String) {

        @JsonProperty("thread.created") threadPeriodCreated("thread.created")
    }

}

