package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AdminApiKeyOwner
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
 * @param `object` 
 * @param id 
 * @param name 
 * @param redactedValue 
 * @param `value` 
 * @param createdAt 
 * @param owner 
 */
data class AdminApiKey(

    @Schema(example = "organization.admin_api_key", description = "")
    @param:JsonProperty("object")
    @get:JsonProperty("object") val `object`: kotlin.String? = null,

    @Schema(example = "key_abc", description = "")
    @param:JsonProperty("id")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "Administration Key", description = "")
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "sk-admin...def", description = "")
    @param:JsonProperty("redacted_value")
    @get:JsonProperty("redacted_value") val redactedValue: kotlin.String? = null,

    @Schema(example = "sk-admin-1234abcd", description = "")
    @param:JsonProperty("value")
    @get:JsonProperty("value") val `value`: kotlin.String? = null,

    @Schema(example = "1711471533", description = "")
    @param:JsonProperty("created_at")
    @get:JsonProperty("created_at") val createdAt: kotlin.Long? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("owner")
    @get:JsonProperty("owner") val owner: AdminApiKeyOwner? = null
) {

}

