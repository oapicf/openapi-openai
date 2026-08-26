package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdminApiKeysDelete200Response(
    val id: kotlin.String? = null,
    val `object`: kotlin.String? = null,
    val deleted: kotlin.Boolean? = null
)
