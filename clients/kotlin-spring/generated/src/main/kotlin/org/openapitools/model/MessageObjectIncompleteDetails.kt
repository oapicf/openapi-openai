package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
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
 * On an incomplete message, details about why the message is incomplete.
 * @param reason The reason the message is incomplete.
 */
data class MessageObjectIncompleteDetails(

    @Schema(example = "null", required = true, description = "The reason the message is incomplete.")
    @get:JsonProperty("reason", required = true) val reason: MessageObjectIncompleteDetails.Reason
    ) {

    /**
    * The reason the message is incomplete.
    * Values: content_filter,max_tokens,run_cancelled,run_expired,run_failed
    */
    enum class Reason(@get:JsonValue val value: kotlin.String) {

        content_filter("content_filter"),
        max_tokens("max_tokens"),
        run_cancelled("run_cancelled"),
        run_expired("run_expired"),
        run_failed("run_failed");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Reason {
                return values().first{it -> it.value == value}
            }
        }
    }

}

