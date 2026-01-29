package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.RunStepDeltaObjectDeltaStepDetails
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
 * The delta containing the fields that have changed on the run step.
 * @param stepDetails 
 */
data class RunStepDeltaObjectDelta(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("step_details") val stepDetails: RunStepDeltaObjectDeltaStepDetails? = null
) {

}

