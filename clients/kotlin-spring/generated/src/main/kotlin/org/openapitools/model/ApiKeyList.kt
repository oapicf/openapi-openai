package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AdminApiKey
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
 * @param hasMore 
 * @param firstId 
 * @param lastId 
 */
data class ApiKeyList(

    @Schema(example = "list", description = "")
    @get:JsonProperty("object") val `object`: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("data") val `data`: kotlin.collections.List<AdminApiKey>? = null,

    @Schema(example = "false", description = "")
    @get:JsonProperty("has_more") val hasMore: kotlin.Boolean? = null,

    @Schema(example = "key_abc", description = "")
    @get:JsonProperty("first_id") val firstId: kotlin.String? = null,

    @Schema(example = "key_xyz", description = "")
    @get:JsonProperty("last_id") val lastId: kotlin.String? = null
) {

}

