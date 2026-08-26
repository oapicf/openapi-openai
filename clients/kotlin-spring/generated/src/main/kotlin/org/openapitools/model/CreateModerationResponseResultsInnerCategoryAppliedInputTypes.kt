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

    @Schema(required = true, description = "The applied input type(s) for the category 'hate'.")
    @param:JsonProperty("hate")
    @get:JsonProperty("hate", required = true) val hate: kotlin.collections.List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.Hate>,

    @Schema(required = true, description = "The applied input type(s) for the category 'hate/threatening'.")
    @param:JsonProperty("hate/threatening")
    @get:JsonProperty("hate/threatening", required = true) val hateThreatening: kotlin.collections.List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.HateThreatening>,

    @Schema(required = true, description = "The applied input type(s) for the category 'harassment'.")
    @param:JsonProperty("harassment")
    @get:JsonProperty("harassment", required = true) val harassment: kotlin.collections.List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.Harassment>,

    @Schema(required = true, description = "The applied input type(s) for the category 'harassment/threatening'.")
    @param:JsonProperty("harassment/threatening")
    @get:JsonProperty("harassment/threatening", required = true) val harassmentThreatening: kotlin.collections.List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.HarassmentThreatening>,

    @Schema(required = true, description = "The applied input type(s) for the category 'illicit'.")
    @param:JsonProperty("illicit")
    @get:JsonProperty("illicit", required = true) val illicit: kotlin.collections.List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.Illicit>,

    @Schema(required = true, description = "The applied input type(s) for the category 'illicit/violent'.")
    @param:JsonProperty("illicit/violent")
    @get:JsonProperty("illicit/violent", required = true) val illicitViolent: kotlin.collections.List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.IllicitViolent>,

    @Schema(required = true, description = "The applied input type(s) for the category 'self-harm'.")
    @param:JsonProperty("self-harm")
    @get:JsonProperty("self-harm", required = true) val selfHarm: kotlin.collections.List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.SelfHarm>,

    @Schema(required = true, description = "The applied input type(s) for the category 'self-harm/intent'.")
    @param:JsonProperty("self-harm/intent")
    @get:JsonProperty("self-harm/intent", required = true) val selfHarmIntent: kotlin.collections.List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.SelfHarmIntent>,

    @Schema(required = true, description = "The applied input type(s) for the category 'self-harm/instructions'.")
    @param:JsonProperty("self-harm/instructions")
    @get:JsonProperty("self-harm/instructions", required = true) val selfHarmInstructions: kotlin.collections.List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.SelfHarmInstructions>,

    @Schema(required = true, description = "The applied input type(s) for the category 'sexual'.")
    @param:JsonProperty("sexual")
    @get:JsonProperty("sexual", required = true) val sexual: kotlin.collections.List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.Sexual>,

    @Schema(required = true, description = "The applied input type(s) for the category 'sexual/minors'.")
    @param:JsonProperty("sexual/minors")
    @get:JsonProperty("sexual/minors", required = true) val sexualMinors: kotlin.collections.List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.SexualMinors>,

    @Schema(required = true, description = "The applied input type(s) for the category 'violence'.")
    @param:JsonProperty("violence")
    @get:JsonProperty("violence", required = true) val violence: kotlin.collections.List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.Violence>,

    @Schema(required = true, description = "The applied input type(s) for the category 'violence/graphic'.")
    @param:JsonProperty("violence/graphic")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Hate'")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'HateThreatening'")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Harassment'")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'HarassmentThreatening'")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Illicit'")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'IllicitViolent'")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'SelfHarm'")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'SelfHarmIntent'")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'SelfHarmInstructions'")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Sexual'")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'SexualMinors'")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Violence'")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ViolenceGraphic'")
            }
        }
    }

}

