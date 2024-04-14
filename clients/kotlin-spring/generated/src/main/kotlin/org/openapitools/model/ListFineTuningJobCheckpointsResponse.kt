package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.FineTuningJobCheckpoint
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
 * @param &#x60;object&#x60; 
 * @param hasMore 
 * @param firstId 
 * @param lastId 
 */
data class ListFineTuningJobCheckpointsResponse(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("data", required = true) val `data`: kotlin.collections.List<FineTuningJobCheckpoint>,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("object", required = true) val `object`: ListFineTuningJobCheckpointsResponse.`Object`,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("has_more", required = true) val hasMore: kotlin.Boolean,

    @Schema(example = "null", description = "")
    @get:JsonProperty("first_id") val firstId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("last_id") val lastId: kotlin.String? = null
) {

    /**
    * 
    * Values: list
    */
    enum class `Object`(val value: kotlin.String) {

        @JsonProperty("list") list("list")
    }

}

