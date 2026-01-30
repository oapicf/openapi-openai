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
 * The payload used to create the API key.
 * @param scopes A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]`
 */
data class AuditLogApiKeyCreatedData(

    @Schema(example = "null", description = "A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]`")
    @get:JsonProperty("scopes") val scopes: kotlin.collections.List<kotlin.String>? = null
) {

}

