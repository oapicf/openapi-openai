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
 * @param id 
 * @param createdAt 
 * @param level 
 * @param message 
 * @param &#x60;object&#x60; 
 */
data class FineTuningJobEvent(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("created_at", required = true) val createdAt: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("level", required = true) val level: FineTuningJobEvent.Level,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("message", required = true) val message: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("object", required = true) val `object`: FineTuningJobEvent.`Object`
) {

    /**
    * 
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
    * 
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

}

