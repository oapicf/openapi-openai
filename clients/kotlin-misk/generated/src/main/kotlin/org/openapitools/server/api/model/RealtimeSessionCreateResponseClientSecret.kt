package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeSessionCreateResponseClientSecret(
    /** Ephemeral key usable in client environments to authenticate connections to the Realtime API. Use this in client-side environments rather than a standard API token, which should only be used server-side.  */
    val `value`: kotlin.String? = null,
    /** Timestamp for when the token expires. Currently, all tokens expire after one minute.  */
    val expiresAt: kotlin.Int? = null
)
