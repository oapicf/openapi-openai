package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.BatchErrorsDataInner
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
 * @param &#x60;object&#x60; The object type, which is always `list`.
 * @param &#x60;data&#x60; 
 */
data class BatchErrors(

    @Schema(example = "null", description = "The object type, which is always `list`.")
    @get:JsonProperty("object") val `object`: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("data") val `data`: kotlin.collections.List<BatchErrorsDataInner>? = null
) {

}

