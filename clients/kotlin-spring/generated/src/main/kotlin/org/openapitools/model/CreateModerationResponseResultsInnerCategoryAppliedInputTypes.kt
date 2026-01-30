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
 * A list of the categories along with the input type(s) that the score applies to.
 * @param hate The applied input type(s) for the category 'hate'.
 * @param hateThreatening The applied input type(s) for the category 'hate/threatening'.
 * @param harassment The applied input type(s) for the category 'harassment'.
 * @param harassmentThreatening The applied input type(s) for the category 'harassment/threatening'.
 * @param illicit The applied input type(s) for the category 'illicit'.
 * @param illicitViolent The applied input type(s) for the category 'illicit/violent'.
 * @param selfHarm The applied input type(s) for the category 'self-harm'.
 * @param selfHarmIntent The applied input type(s) for the category 'self-harm/intent'.
 * @param selfHarmInstructions The applied input type(s) for the category 'self-harm/instructions'.
 * @param sexual The applied input type(s) for the category 'sexual'.
 * @param sexualMinors The applied input type(s) for the category 'sexual/minors'.
 * @param violence The applied input type(s) for the category 'violence'.
 * @param violenceGraphic The applied input type(s) for the category 'violence/graphic'.
 */
data class CreateModerationResponseResultsInnerCategoryAppliedInputTypes(

    @Schema(example = "null", required = true, description = "The applied input type(s) for the category 'hate'.")
    @get:JsonProperty("hate", required = true) val hate: kotlin.collections.List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.Hate>,

    @Schema(example = "null", required = true, description = "The applied input type(s) for the category 'hate/threatening'.")
    @get:JsonProperty("hate/threatening", required = true) val hateThreatening: kotlin.collections.List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.HateThreatening>,

    @Schema(example = "null", required = true, description = "The applied input type(s) for the category 'harassment'.")
    @get:JsonProperty("harassment", required = true) val harassment: kotlin.collections.List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.Harassment>,

    @Schema(example = "null", required = true, description = "The applied input type(s) for the category 'harassment/threatening'.")
    @get:JsonProperty("harassment/threatening", required = true) val harassmentThreatening: kotlin.collections.List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.HarassmentThreatening>,

    @Schema(example = "null", required = true, description = "The applied input type(s) for the category 'illicit'.")
    @get:JsonProperty("illicit", required = true) val illicit: kotlin.collections.List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.Illicit>,

    @Schema(example = "null", required = true, description = "The applied input type(s) for the category 'illicit/violent'.")
    @get:JsonProperty("illicit/violent", required = true) val illicitViolent: kotlin.collections.List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.IllicitViolent>,

    @Schema(example = "null", required = true, description = "The applied input type(s) for the category 'self-harm'.")
    @get:JsonProperty("self-harm", required = true) val selfHarm: kotlin.collections.List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.SelfHarm>,

    @Schema(example = "null", required = true, description = "The applied input type(s) for the category 'self-harm/intent'.")
    @get:JsonProperty("self-harm/intent", required = true) val selfHarmIntent: kotlin.collections.List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.SelfHarmIntent>,

    @Schema(example = "null", required = true, description = "The applied input type(s) for the category 'self-harm/instructions'.")
    @get:JsonProperty("self-harm/instructions", required = true) val selfHarmInstructions: kotlin.collections.List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.SelfHarmInstructions>,

    @Schema(example = "null", required = true, description = "The applied input type(s) for the category 'sexual'.")
    @get:JsonProperty("sexual", required = true) val sexual: kotlin.collections.List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.Sexual>,

    @Schema(example = "null", required = true, description = "The applied input type(s) for the category 'sexual/minors'.")
    @get:JsonProperty("sexual/minors", required = true) val sexualMinors: kotlin.collections.List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.SexualMinors>,

    @Schema(example = "null", required = true, description = "The applied input type(s) for the category 'violence'.")
    @get:JsonProperty("violence", required = true) val violence: kotlin.collections.List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.Violence>,

    @Schema(example = "null", required = true, description = "The applied input type(s) for the category 'violence/graphic'.")
    @get:JsonProperty("violence/graphic", required = true) val violenceGraphic: kotlin.collections.List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.ViolenceGraphic>
) {

    /**
    * The applied input type(s) for the category 'hate'.
    * Values: text
    */
    enum class Hate(@get:JsonValue val value: kotlin.String) {

        text("text");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Hate {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CreateModerationResponseResultsInnerCategoryAppliedInputTypes'")
            }
        }
    }

    /**
    * The applied input type(s) for the category 'hate/threatening'.
    * Values: text
    */
    enum class HateThreatening(@get:JsonValue val value: kotlin.String) {

        text("text");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): HateThreatening {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CreateModerationResponseResultsInnerCategoryAppliedInputTypes'")
            }
        }
    }

    /**
    * The applied input type(s) for the category 'harassment'.
    * Values: text
    */
    enum class Harassment(@get:JsonValue val value: kotlin.String) {

        text("text");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Harassment {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CreateModerationResponseResultsInnerCategoryAppliedInputTypes'")
            }
        }
    }

    /**
    * The applied input type(s) for the category 'harassment/threatening'.
    * Values: text
    */
    enum class HarassmentThreatening(@get:JsonValue val value: kotlin.String) {

        text("text");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): HarassmentThreatening {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CreateModerationResponseResultsInnerCategoryAppliedInputTypes'")
            }
        }
    }

    /**
    * The applied input type(s) for the category 'illicit'.
    * Values: text
    */
    enum class Illicit(@get:JsonValue val value: kotlin.String) {

        text("text");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Illicit {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CreateModerationResponseResultsInnerCategoryAppliedInputTypes'")
            }
        }
    }

    /**
    * The applied input type(s) for the category 'illicit/violent'.
    * Values: text
    */
    enum class IllicitViolent(@get:JsonValue val value: kotlin.String) {

        text("text");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): IllicitViolent {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CreateModerationResponseResultsInnerCategoryAppliedInputTypes'")
            }
        }
    }

    /**
    * The applied input type(s) for the category 'self-harm'.
    * Values: text,image
    */
    enum class SelfHarm(@get:JsonValue val value: kotlin.String) {

        text("text"),
        image("image");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): SelfHarm {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CreateModerationResponseResultsInnerCategoryAppliedInputTypes'")
            }
        }
    }

    /**
    * The applied input type(s) for the category 'self-harm/intent'.
    * Values: text,image
    */
    enum class SelfHarmIntent(@get:JsonValue val value: kotlin.String) {

        text("text"),
        image("image");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): SelfHarmIntent {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CreateModerationResponseResultsInnerCategoryAppliedInputTypes'")
            }
        }
    }

    /**
    * The applied input type(s) for the category 'self-harm/instructions'.
    * Values: text,image
    */
    enum class SelfHarmInstructions(@get:JsonValue val value: kotlin.String) {

        text("text"),
        image("image");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): SelfHarmInstructions {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CreateModerationResponseResultsInnerCategoryAppliedInputTypes'")
            }
        }
    }

    /**
    * The applied input type(s) for the category 'sexual'.
    * Values: text,image
    */
    enum class Sexual(@get:JsonValue val value: kotlin.String) {

        text("text"),
        image("image");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Sexual {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CreateModerationResponseResultsInnerCategoryAppliedInputTypes'")
            }
        }
    }

    /**
    * The applied input type(s) for the category 'sexual/minors'.
    * Values: text
    */
    enum class SexualMinors(@get:JsonValue val value: kotlin.String) {

        text("text");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): SexualMinors {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CreateModerationResponseResultsInnerCategoryAppliedInputTypes'")
            }
        }
    }

    /**
    * The applied input type(s) for the category 'violence'.
    * Values: text,image
    */
    enum class Violence(@get:JsonValue val value: kotlin.String) {

        text("text"),
        image("image");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Violence {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CreateModerationResponseResultsInnerCategoryAppliedInputTypes'")
            }
        }
    }

    /**
    * The applied input type(s) for the category 'violence/graphic'.
    * Values: text,image
    */
    enum class ViolenceGraphic(@get:JsonValue val value: kotlin.String) {

        text("text"),
        image("image");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ViolenceGraphic {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CreateModerationResponseResultsInnerCategoryAppliedInputTypes'")
            }
        }
    }

}

