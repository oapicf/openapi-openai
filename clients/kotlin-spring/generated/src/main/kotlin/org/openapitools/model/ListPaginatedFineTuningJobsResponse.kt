package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.FineTuningJob
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
 */
data class ListPaginatedFineTuningJobsResponse(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("data", required = true) val `data`: kotlin.collections.List<FineTuningJob>,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("has_more", required = true) val hasMore: kotlin.Boolean,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("object", required = true) val `object`: ListPaginatedFineTuningJobsResponse.`Object`
) {

    /**
    * 
    * Values: list
    */
    enum class `Object`(val value: kotlin.String) {

        @JsonProperty("list") list("list")
    }

}

