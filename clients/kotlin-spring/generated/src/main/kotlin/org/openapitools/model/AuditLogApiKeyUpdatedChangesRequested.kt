package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
 * The payload used to update the API key.
 * @param scopes A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]`
 */
data class AuditLogApiKeyUpdatedChangesRequested(

    @Schema(description = "A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]`")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("scopes")
    @get:JsonProperty("scopes") val scopes: kotlin.collections.List<kotlin.String>? = null
) {

}

