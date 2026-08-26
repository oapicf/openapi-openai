@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RealtimeSessionCreateResponseClientSecret(
    @field:JsonProperty("value")
    val `value`: kotlin.String? = null,

    @field:JsonProperty("expires_at")
    val expiresAt: kotlin.Int? = null,

)
