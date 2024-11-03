package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AssistantFileObject
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
data class ListAssistantFilesResponse(

    @Schema(example = "list", required = true, description = "")
    @get:JsonProperty("object", required = true) val `object`: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("data", required = true) val `data`: kotlin.collections.List<AssistantFileObject>,

    @Schema(example = "file-abc123", required = true, description = "")
    @get:JsonProperty("first_id", required = true) val firstId: kotlin.String,

    @Schema(example = "file-abc456", required = true, description = "")
    @get:JsonProperty("last_id", required = true) val lastId: kotlin.String,

    @Schema(example = "false", required = true, description = "")
    @get:JsonProperty("has_more", required = true) val hasMore: kotlin.Boolean
    ) {

}

