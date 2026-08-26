package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.VectorStoreObject
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
 * @param &#x60;object&#x60; 
 * @param &#x60;data&#x60; 
 * @param firstId 
 * @param lastId 
 * @param hasMore 
 */
data class ListVectorStoresResponse(

    @Schema(example = "list", required = true, description = "")
    @param:JsonProperty("object")
    @get:JsonProperty("object", required = true) val `object`: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("data")
    @get:JsonProperty("data", required = true) val `data`: kotlin.collections.List<VectorStoreObject>,

    @Schema(example = "vs_abc123", required = true, description = "")
    @param:JsonProperty("first_id")
    @get:JsonProperty("first_id", required = true) val firstId: kotlin.String,

    @Schema(example = "vs_abc456", required = true, description = "")
    @param:JsonProperty("last_id")
    @get:JsonProperty("last_id", required = true) val lastId: kotlin.String,

    @Schema(example = "false", required = true, description = "")
    @param:JsonProperty("has_more")
    @get:JsonProperty("has_more", required = true) val hasMore: kotlin.Boolean
) {

}

