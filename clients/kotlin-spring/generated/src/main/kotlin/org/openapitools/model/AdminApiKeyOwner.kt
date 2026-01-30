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
 * @param type 
 * @param id 
 * @param name 
 * @param createdAt 
 * @param role 
 */
data class AdminApiKeyOwner(

    @Schema(example = "service_account", description = "")
    @get:JsonProperty("type") val type: kotlin.String? = null,

    @Schema(example = "sa_456", description = "")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "My Service Account", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "1711471533", description = "")
    @get:JsonProperty("created_at") val createdAt: kotlin.Long? = null,

    @Schema(example = "member", description = "")
    @get:JsonProperty("role") val role: kotlin.String? = null
) {

}

