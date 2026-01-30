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
 * Fine-tuning job event object
 * @param &#x60;object&#x60; The object type, which is always \"fine_tuning.job.event\".
 * @param id The object identifier.
 * @param createdAt The Unix timestamp (in seconds) for when the fine-tuning job was created.
 * @param level The log level of the event.
 * @param message The message of the event.
 * @param type The type of event.
 * @param &#x60;data&#x60; The data associated with the event.
 */
data class FineTuningJobEvent(

    @Schema(example = "null", required = true, description = "The object type, which is always \"fine_tuning.job.event\".")
    @get:JsonProperty("object", required = true) val `object`: FineTuningJobEvent.`Object`,

    @Schema(example = "null", required = true, description = "The object identifier.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "The Unix timestamp (in seconds) for when the fine-tuning job was created.")
    @get:JsonProperty("created_at", required = true) val createdAt: kotlin.Int,

    @Schema(example = "null", required = true, description = "The log level of the event.")
    @get:JsonProperty("level", required = true) val level: FineTuningJobEvent.Level,

    @Schema(example = "null", required = true, description = "The message of the event.")
    @get:JsonProperty("message", required = true) val message: kotlin.String,

    @Schema(example = "null", description = "The type of event.")
    @get:JsonProperty("type") val type: FineTuningJobEvent.Type? = null,

    @field:Valid
    @Schema(example = "null", description = "The data associated with the event.")
    @get:JsonProperty("data") val `data`: kotlin.Any? = null
) {

    /**
    * The object type, which is always \"fine_tuning.job.event\".
    * Values: fine_tuningPeriodJobPeriodEvent
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        fine_tuningPeriodJobPeriodEvent("fine_tuning.job.event");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Object` {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'FineTuningJobEvent'")
            }
        }
    }

    /**
    * The log level of the event.
    * Values: info,warn,error
    */
    enum class Level(@get:JsonValue val value: kotlin.String) {

        info("info"),
        warn("warn"),
        error("error");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Level {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'FineTuningJobEvent'")
            }
        }
    }

    /**
    * The type of event.
    * Values: message,metrics
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        message("message"),
        metrics("metrics");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'FineTuningJobEvent'")
            }
        }
    }

}

