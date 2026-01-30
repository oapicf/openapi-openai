package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Invite
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
 * 
 * @param &#x60;object&#x60; The object type, which is always `list`
 * @param &#x60;data&#x60; 
 * @param firstId The first `invite_id` in the retrieved `list`
 * @param lastId The last `invite_id` in the retrieved `list`
 * @param hasMore The `has_more` property is used for pagination to indicate there are additional results.
 */
data class InviteListResponse(

    @Schema(example = "null", required = true, description = "The object type, which is always `list`")
    @get:JsonProperty("object", required = true) val `object`: InviteListResponse.`Object`,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("data", required = true) val `data`: kotlin.collections.List<Invite>,

    @Schema(example = "null", description = "The first `invite_id` in the retrieved `list`")
    @get:JsonProperty("first_id") val firstId: kotlin.String? = null,

    @Schema(example = "null", description = "The last `invite_id` in the retrieved `list`")
    @get:JsonProperty("last_id") val lastId: kotlin.String? = null,

    @Schema(example = "null", description = "The `has_more` property is used for pagination to indicate there are additional results.")
    @get:JsonProperty("has_more") val hasMore: kotlin.Boolean? = null
) {

    /**
    * The object type, which is always `list`
    * Values: list
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        list("list");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Object` {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'InviteListResponse'")
            }
        }
    }

}

