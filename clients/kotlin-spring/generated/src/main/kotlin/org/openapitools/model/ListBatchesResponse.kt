package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.Batch
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
 * @param &#x60;data&#x60; 
 * @param hasMore 
 * @param &#x60;object&#x60; 
 * @param firstId 
 * @param lastId 
 */
data class ListBatchesResponse(

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("data")
    @get:JsonProperty("data", required = true) val `data`: kotlin.collections.List<Batch>,

    @Schema(required = true, description = "")
    @param:JsonProperty("has_more")
    @get:JsonProperty("has_more", required = true) val hasMore: kotlin.Boolean,

    @Schema(required = true, description = "")
    @param:JsonProperty("object")
    @get:JsonProperty("object", required = true) val `object`: ListBatchesResponse.`Object`,

    @Schema(example = "batch_abc123", description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("first_id")
    @get:JsonProperty("first_id") val firstId: kotlin.String? = null,

    @Schema(example = "batch_abc456", description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("last_id")
    @get:JsonProperty("last_id") val lastId: kotlin.String? = null
) {

    /**
    * 
    * Values: list
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        list("list");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Object` {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum '&#x60;Object&#x60;'")
            }
        }
    }

}

