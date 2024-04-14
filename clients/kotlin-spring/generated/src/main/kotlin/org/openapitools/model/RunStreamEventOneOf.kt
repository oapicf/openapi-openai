package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RunObject
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
 * Occurs when a new [run](/docs/api-reference/runs/object) is created.
 * @param event 
 * @param &#x60;data&#x60; 
 */
data class RunStreamEventOneOf(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("event", required = true) val event: RunStreamEventOneOf.Event,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("data", required = true) val `data`: RunObject
) {

    /**
    * 
    * Values: threadPeriodRunPeriodCreated
    */
    enum class Event(val value: kotlin.String) {

        @JsonProperty("thread.run.created") threadPeriodRunPeriodCreated("thread.run.created")
    }

}

