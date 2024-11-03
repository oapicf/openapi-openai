package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * A list of the categories along with their scores as predicted by model.
 * @param hate The score for the category 'hate'.
 * @param hateThreatening The score for the category 'hate/threatening'.
 * @param harassment The score for the category 'harassment'.
 * @param harassmentThreatening The score for the category 'harassment/threatening'.
 * @param selfHarm The score for the category 'self-harm'.
 * @param selfHarmIntent The score for the category 'self-harm/intent'.
 * @param selfHarmInstructions The score for the category 'self-harm/instructions'.
 * @param sexual The score for the category 'sexual'.
 * @param sexualMinors The score for the category 'sexual/minors'.
 * @param violence The score for the category 'violence'.
 * @param violenceGraphic The score for the category 'violence/graphic'.
 */
data class CreateModerationResponseResultsInnerCategoryScores(

    @Schema(example = "null", required = true, description = "The score for the category 'hate'.")
    @get:JsonProperty("hate", required = true) val hate: java.math.BigDecimal,

    @Schema(example = "null", required = true, description = "The score for the category 'hate/threatening'.")
    @get:JsonProperty("hate/threatening", required = true) val hateThreatening: java.math.BigDecimal,

    @Schema(example = "null", required = true, description = "The score for the category 'harassment'.")
    @get:JsonProperty("harassment", required = true) val harassment: java.math.BigDecimal,

    @Schema(example = "null", required = true, description = "The score for the category 'harassment/threatening'.")
    @get:JsonProperty("harassment/threatening", required = true) val harassmentThreatening: java.math.BigDecimal,

    @Schema(example = "null", required = true, description = "The score for the category 'self-harm'.")
    @get:JsonProperty("self-harm", required = true) val selfHarm: java.math.BigDecimal,

    @Schema(example = "null", required = true, description = "The score for the category 'self-harm/intent'.")
    @get:JsonProperty("self-harm/intent", required = true) val selfHarmIntent: java.math.BigDecimal,

    @Schema(example = "null", required = true, description = "The score for the category 'self-harm/instructions'.")
    @get:JsonProperty("self-harm/instructions", required = true) val selfHarmInstructions: java.math.BigDecimal,

    @Schema(example = "null", required = true, description = "The score for the category 'sexual'.")
    @get:JsonProperty("sexual", required = true) val sexual: java.math.BigDecimal,

    @Schema(example = "null", required = true, description = "The score for the category 'sexual/minors'.")
    @get:JsonProperty("sexual/minors", required = true) val sexualMinors: java.math.BigDecimal,

    @Schema(example = "null", required = true, description = "The score for the category 'violence'.")
    @get:JsonProperty("violence", required = true) val violence: java.math.BigDecimal,

    @Schema(example = "null", required = true, description = "The score for the category 'violence/graphic'.")
    @get:JsonProperty("violence/graphic", required = true) val violenceGraphic: java.math.BigDecimal
    ) {

}

