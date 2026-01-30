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
 * A list of the categories, and whether they are flagged or not.
 * @param hate Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.
 * @param hateThreatening Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.
 * @param harassment Content that expresses, incites, or promotes harassing language towards any target.
 * @param harassmentThreatening Harassment content that also includes violence or serious harm towards any target.
 * @param illicit Content that includes instructions or advice that facilitate the planning or execution of wrongdoing, or that gives advice or instruction on how to commit illicit acts. For example, \"how to shoplift\" would fit this category.
 * @param illicitViolent Content that includes instructions or advice that facilitate the planning or execution of wrongdoing that also includes violence, or that gives advice or instruction on the procurement of any weapon.
 * @param selfHarm Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.
 * @param selfHarmIntent Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.
 * @param selfHarmInstructions Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.
 * @param sexual Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).
 * @param sexualMinors Sexual content that includes an individual who is under 18 years old.
 * @param violence Content that depicts death, violence, or physical injury.
 * @param violenceGraphic Content that depicts death, violence, or physical injury in graphic detail.
 */
data class CreateModerationResponseResultsInnerCategories(

    @Schema(example = "null", required = true, description = "Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.")
    @get:JsonProperty("hate", required = true) val hate: kotlin.Boolean,

    @Schema(example = "null", required = true, description = "Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.")
    @get:JsonProperty("hate/threatening", required = true) val hateThreatening: kotlin.Boolean,

    @Schema(example = "null", required = true, description = "Content that expresses, incites, or promotes harassing language towards any target.")
    @get:JsonProperty("harassment", required = true) val harassment: kotlin.Boolean,

    @Schema(example = "null", required = true, description = "Harassment content that also includes violence or serious harm towards any target.")
    @get:JsonProperty("harassment/threatening", required = true) val harassmentThreatening: kotlin.Boolean,

    @Schema(example = "null", required = true, description = "Content that includes instructions or advice that facilitate the planning or execution of wrongdoing, or that gives advice or instruction on how to commit illicit acts. For example, \"how to shoplift\" would fit this category.")
    @get:JsonProperty("illicit", required = true) val illicit: kotlin.Boolean,

    @Schema(example = "null", required = true, description = "Content that includes instructions or advice that facilitate the planning or execution of wrongdoing that also includes violence, or that gives advice or instruction on the procurement of any weapon.")
    @get:JsonProperty("illicit/violent", required = true) val illicitViolent: kotlin.Boolean,

    @Schema(example = "null", required = true, description = "Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.")
    @get:JsonProperty("self-harm", required = true) val selfHarm: kotlin.Boolean,

    @Schema(example = "null", required = true, description = "Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.")
    @get:JsonProperty("self-harm/intent", required = true) val selfHarmIntent: kotlin.Boolean,

    @Schema(example = "null", required = true, description = "Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.")
    @get:JsonProperty("self-harm/instructions", required = true) val selfHarmInstructions: kotlin.Boolean,

    @Schema(example = "null", required = true, description = "Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).")
    @get:JsonProperty("sexual", required = true) val sexual: kotlin.Boolean,

    @Schema(example = "null", required = true, description = "Sexual content that includes an individual who is under 18 years old.")
    @get:JsonProperty("sexual/minors", required = true) val sexualMinors: kotlin.Boolean,

    @Schema(example = "null", required = true, description = "Content that depicts death, violence, or physical injury.")
    @get:JsonProperty("violence", required = true) val violence: kotlin.Boolean,

    @Schema(example = "null", required = true, description = "Content that depicts death, violence, or physical injury in graphic detail.")
    @get:JsonProperty("violence/graphic", required = true) val violenceGraphic: kotlin.Boolean
) {

}

