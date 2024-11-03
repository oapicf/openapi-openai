package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.FineTuningJobHyperparametersNEpochs
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
 * The hyperparameters used for the fine-tuning job. See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
 * @param nEpochs 
 */
data class FineTuningJobHyperparameters(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("n_epochs", required = true) val nEpochs: FineTuningJobHyperparametersNEpochs
    ) {

}

