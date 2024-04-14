package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * Occurs when a stream ends.
 * @param event 
 * @param &#x60;data&#x60; 
 */
data class DoneEvent(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("event", required = true) val event: DoneEvent.Event,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("data", required = true) val `data`: DoneEvent.`Data`
) {

    /**
    * 
    * Values: done
    */
    enum class Event(val value: kotlin.String) {

        @JsonProperty("done") done("done")
    }

    /**
    * 
    * Values: Left_Square_BracketDONERight_Square_Bracket
    */
    enum class `Data`(val value: kotlin.String) {

        @JsonProperty("[DONE]") Left_Square_BracketDONERight_Square_Bracket("[DONE]")
    }

}

