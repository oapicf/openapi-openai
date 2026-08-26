package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuditLogApiKeyCreatedData(
    /** A list of scopes allowed for the API key, e.g. &#x60;[\&quot;api.model.request\&quot;]&#x60; */
    val scopes: kotlin.collections.List<kotlin.String>? = null
)
