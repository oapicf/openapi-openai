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
 * The expiration policy for a vector store.
 * @param anchor Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.
 * @param days The number of days after the anchor time that the vector store will expire.
 */
data class VectorStoreExpirationAfter(

    @Schema(example = "null", required = true, description = "Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.")
    @get:JsonProperty("anchor", required = true) val anchor: VectorStoreExpirationAfter.Anchor,

    @get:Min(value=1)
    @get:Max(value=365)
    @Schema(example = "null", required = true, description = "The number of days after the anchor time that the vector store will expire.")
    @get:JsonProperty("days", required = true) val days: kotlin.Int
) {

    /**
    * Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.
    * Values: last_active_at
    */
    enum class Anchor(@get:JsonValue val value: kotlin.String) {

        last_active_at("last_active_at");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Anchor {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'VectorStoreExpirationAfter'")
            }
        }
    }

}

