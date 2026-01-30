package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * @param id 
 * @param &#x60;object&#x60; 
 * @param deleted 
 */
data class AdminApiKeysDelete200Response(

    @Schema(example = "key_abc", description = "")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "organization.admin_api_key.deleted", description = "")
    @get:JsonProperty("object") val `object`: kotlin.String? = null,

    @Schema(example = "true", description = "")
    @get:JsonProperty("deleted") val deleted: kotlin.Boolean? = null
) {

}

