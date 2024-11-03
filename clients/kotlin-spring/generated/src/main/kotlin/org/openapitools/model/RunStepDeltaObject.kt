package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RunStepDeltaObjectDelta
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
 * Represents a run step delta i.e. any changed fields on a run step during streaming. 
 * @param id The identifier of the run step, which can be referenced in API endpoints.
 * @param &#x60;object&#x60; The object type, which is always `thread.run.step.delta`.
 * @param delta 
 */
data class RunStepDeltaObject(

    @Schema(example = "null", required = true, description = "The identifier of the run step, which can be referenced in API endpoints.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "The object type, which is always `thread.run.step.delta`.")
    @get:JsonProperty("object", required = true) val `object`: RunStepDeltaObject.`Object`,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("delta", required = true) val delta: RunStepDeltaObjectDelta
    ) {

    /**
    * The object type, which is always `thread.run.step.delta`.
    * Values: threadPeriodRunPeriodStepPeriodDelta
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        threadPeriodRunPeriodStepPeriodDelta("thread.run.step.delta");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Object` {
                return values().first{it -> it.value == value}
            }
        }
    }

}

