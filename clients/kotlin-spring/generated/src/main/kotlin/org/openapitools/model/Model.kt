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
 * Describes an OpenAI model offering that can be used with the API.
 * @param id The model identifier, which can be referenced in the API endpoints.
 * @param created The Unix timestamp (in seconds) when the model was created.
 * @param &#x60;object&#x60; The object type, which is always \"model\".
 * @param ownedBy The organization that owns the model.
 */
data class Model(

    @Schema(example = "null", required = true, description = "The model identifier, which can be referenced in the API endpoints.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "The Unix timestamp (in seconds) when the model was created.")
    @get:JsonProperty("created", required = true) val created: kotlin.Int,

    @Schema(example = "null", required = true, description = "The object type, which is always \"model\".")
    @get:JsonProperty("object", required = true) val `object`: Model.`Object`,

    @Schema(example = "null", required = true, description = "The organization that owns the model.")
    @get:JsonProperty("owned_by", required = true) val ownedBy: kotlin.String
    ) {

    /**
    * The object type, which is always \"model\".
    * Values: model
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        model("model");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Object` {
                return values().first{it -> it.value == value}
            }
        }
    }

}

